package org.example.operation.binary;

public class Division implements BinaryOperator {

    @Override
    public double calculate(double operand1, double operand2) {
        return operand1 / operand2;
    }
}
