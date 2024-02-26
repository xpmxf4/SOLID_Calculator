package org.example.dto;


public record UnaryCalcDto(double operand, String operator) implements CalcDto {
}
