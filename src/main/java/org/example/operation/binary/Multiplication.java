package org.example.operation.binary;

public class Multiplication implements BinaryOperator {

    @Override
    public double calculate(double operand1, double operand2) {
        return operand1 * operand2;
    }
}
