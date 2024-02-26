package org.example.operation.unary;

import org.example.operation.Operation;

public interface UnaryOperator extends Operation {

    double calculate(double operand1);
}
