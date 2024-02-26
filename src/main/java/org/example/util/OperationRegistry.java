package org.example.util;

import org.example.operation.Operation;
import org.example.operation.OperationType;
import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OperationRegistry {

    private OperationRegistry() {}

    private static final Map<String, Operation> operationMap = new HashMap<>();

    static {
        initializeOperations();
    }

    private static void initializeOperations() {
        Reflections reflections = new Reflections("org.example.operation");
        Set<Class<?>> annotated = reflections.getTypesAnnotatedWith(OperationType.class);
        for (Class<?> cls : annotated) {
            try {
                OperationType operationAnnotation = cls.getAnnotation(OperationType.class);
                Object instance = cls.getDeclaredConstructor().newInstance();

                if (instance instanceof Operation operation) {
                    operationMap.put(operationAnnotation.value(), operation);
                } else {
                    System.err.println("Class " + cls.getName() + " does not implement Operation interface");
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static Operation getOperation(String operationType) {
        return operationMap.get(operationType);
    }
}
