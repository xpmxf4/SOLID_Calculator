package org.example.operation.binary;

import org.example.operation.OperationType;

@OperationType("-")
public class Subtraction implements BinaryOperation {

    @Override
    public double calculate(double operand1, double operand2) {
        return operand1 - operand2;
    }
}
