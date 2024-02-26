package org.example.operation.unary;

public class Sin implements UnaryOperator {

    @Override
    public double calculate(double operand1) {
        return Math.sin(operand1);
    }
}
