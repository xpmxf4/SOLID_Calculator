package org.example.operation;

import org.example.operation.Operation;

public class Subtraction implements Operation {
    @Override
    public double calculate(double operand1, double operand2) {
        return operand1 - operand2;
    }
}
