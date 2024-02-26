package org.example.operation.unary.Impl;

import org.example.operation.OperationType;
import org.example.operation.unary.UnaryOperation;

@OperationType("cos")
public class Cos implements UnaryOperation {

    @Override
    public double calculate(double operand1) {
        return Math.cos(operand1);
    }
}
