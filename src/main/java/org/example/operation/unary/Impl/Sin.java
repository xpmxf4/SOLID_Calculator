package org.example.operation.unary.Impl;

import org.example.operation.OperationType;
import org.example.operation.unary.UnaryOperation;

@OperationType("sin")
public class Sin implements UnaryOperation {

    @Override
    public double calculate(double operand1) {
        return Math.sin(operand1);
    }
}
