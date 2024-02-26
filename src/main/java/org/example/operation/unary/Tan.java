package org.example.operation.unary;

public class Tan implements UnaryOperator{

    @Override
    public double calculate(double operand1) {
        return Math.tan(operand1);
    }
}
