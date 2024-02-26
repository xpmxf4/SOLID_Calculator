package org.example.operation.unary;

public class Cos implements UnaryOperator{

    @Override
    public double calculate(double operand1) {
        return Math.cos(operand1);
    }
}
