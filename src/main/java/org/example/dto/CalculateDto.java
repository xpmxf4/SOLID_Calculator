package org.example.dto;

import org.example.operation.CalculatorRefactor;

public class CalculateDto {

    private final double operand1;
    private final double operand2;
    private final CalculatorRefactor calculator;

    public CalculateDto(double operand1, String operator, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.calculator = CalculatorRefactor.getCalculator(operator);
    }

    public double calculate() {
        return calculator.calculate(operand1, operand2);
    }
}
