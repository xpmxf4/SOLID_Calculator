package org.example.dto;



public record BinaryCalcDto(double operand1, double operand2, String operator) implements CalcDto {
}
