package org.example.operation.binary;

import org.example.operation.Operation;

public interface BinaryOperation extends Operation {

    double calculate(double operand1, double operand2);
}
