package org.example.operation.binary.Impl;

import org.example.operation.OperationType;
import org.example.operation.binary.BinaryOperation;

@OperationType("/")
public class Division implements BinaryOperation {

    @Override
    public double calculate(double operand1, double operand2) {
        return operand1 / operand2;
    }
}
