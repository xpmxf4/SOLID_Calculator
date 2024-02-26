package org.example.util;

import org.example.operation.Operation;
import org.example.operation.binary.*;
import org.example.operation.unary.Cos;
import org.example.operation.unary.Sin;
import org.example.operation.unary.Tan;
import org.example.operation.unary.UnaryOperator;

import java.util.HashMap;

public final class InputParser {

    private InputParser() {
    }

    private static final HashMap<String, Operation> OPERATION_MAP = new HashMap<>();

    static {
        OPERATION_MAP.put("+", new Addition());
        OPERATION_MAP.put("-", new Subtraction());
        OPERATION_MAP.put("*", new Multiplication());
        OPERATION_MAP.put("/", new Division());
        OPERATION_MAP.put("sin", new Sin());
        OPERATION_MAP.put("cos", new Cos());
        OPERATION_MAP.put("tan", new Tan());
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
