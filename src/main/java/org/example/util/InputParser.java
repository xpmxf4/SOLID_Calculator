package org.example.util;

import org.example.operation.Operation;
import org.example.operation.OperationType;
import org.example.operation.binary.*;
import org.example.operation.unary.UnaryOperator;
import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Set;

public final class InputParser {

    private InputParser() {
    }

    private static final HashMap<String, Operation> OPERATION_MAP = new HashMap<>();

    public static void initializeOperations() {
        // Reflections를 사용하여 @OperationType 애노테이션이 적용된 모든 클래스를 스캔하고 초기화
        Reflections reflections = new Reflections("org.example.operation");
        Set<Class<?>> annotated = reflections.getTypesAnnotatedWith(OperationType.class);
        for (Class<?> cls : annotated) {
            try {
                OperationType operationAnnotation = cls.getAnnotation(OperationType.class);
                Object instance = cls.getDeclaredConstructor().newInstance();

                if (instance instanceof Operation operation) {
                    OPERATION_MAP.put(operationAnnotation.value(), operation);
                } else {
                    System.err.println("Class " + cls.getName() + " does not implement Operation interface.");
                }
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                     NoSuchMethodException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    static {
        initializeOperations();
    }


    public static double parseCommandLine(String input) {
        String[] parts = input.split(" ");
        int splitInputLen = parts.length;

        try {
            if (splitInputLen == 2) { // 단항 연산
                String operator = parts[0];
                double operand = Double.parseDouble(parts[1]);

                Operation op = OPERATION_MAP.get(operator);
                if (op instanceof UnaryOperator unaryOperator) {
                    return unaryOperator.calculate(operand);
                }
            } else if (splitInputLen == 3) { // 이항 연산
                double operand1 = Double.parseDouble(parts[0]);
                String operator = parts[1];
                double operand2 = Double.parseDouble(parts[2]);

                Operation op = OPERATION_MAP.get(operator);
                if (op instanceof BinaryOperator binaryOperator) {
                    return binaryOperator.calculate(operand1, operand2);
                }
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("입력이 올바르지 않습니다: " + input, e);
        }

        throw new IllegalArgumentException("유효하지 않은 연산자 또는 피연산자입니다: " + input);
    }
}
