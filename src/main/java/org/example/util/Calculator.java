package org.example.util;

import org.example.dto.BinaryCalcDto;
import org.example.dto.CalcDto;
import org.example.dto.UnaryCalcDto;
import org.example.operation.binary.BinaryOperator;
import org.example.operation.unary.UnaryOperator;

public final class Calculator {

    private Calculator() {
    }

    public static double calculate(CalcDto calcDto) throws IllegalStateException {

        if (calcDto instanceof UnaryCalcDto unaryCalcDto) {
            double op1 = unaryCalcDto.operand();
            String operator = unaryCalcDto.operator();

            return ((UnaryOperator) OperationRegistry.getOperation(operator))
                    .calculate(op1);
        }

        if (calcDto instanceof BinaryCalcDto binaryCalcDto) {
            double operand1 = binaryCalcDto.operand1();
            double operand2 = binaryCalcDto.operand2();
            String operator = binaryCalcDto.operator();

            return ((BinaryOperator) OperationRegistry.getOperation(operator))
                    .calculate(operand1, operand2);
        }

        throw new IllegalArgumentException("Invalid DTO");
    }
}
