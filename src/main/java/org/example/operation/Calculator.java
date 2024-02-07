package org.example.operation;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum Calculator implements Operation {

    ADDITION("+") {
        @Override
        public double calculate(double operand1, double operand2) {
            return operand1 + operand2;
        }
    },

    DIVISION("/") {
        @Override
        public double calculate(double operand1, double operand2) {
            return operand1 / operand2;
        }
    },

    MULTIPLY("*") {
        @Override
        public double calculate(double operand1, double operand2) {
            return operand1 * operand2;
        }
    },

    SUBTRACTION("-") {
        @Override
        public double calculate(double operand1, double operand2) {
            return operand1 - operand2;
        }
    };

    private final String operator;

    public String getOperator() {
        return operator;
    }

    Calculator(String operator) {
        this.operator = operator;
    }

    private static final Map<String, Calculator> calculatorMap = Arrays.stream(values())
            .collect(Collectors.toMap(Calculator::getOperator, Function.identity()));

    public static Calculator getCalculator(String operator) {
        Calculator calculator = calculatorMap.get(operator);
        if (calculator == null) throw new IllegalArgumentException("정의 되지 않은 연산입니다.");
        return calculator;
    }
}
