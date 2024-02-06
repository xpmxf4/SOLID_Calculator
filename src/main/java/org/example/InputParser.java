package org.example;

public class InputParser {
    public static double[] parseOperands(String input) {
        String[] parts = input.split(" ");
        double operand1 = Double.parseDouble(parts[0]);
        String operator = parts[1];
        double operand2 = Double.parseDouble(parts[2]);
        return new double[]{operand1, operand2};
    }

    public static String parseOperator(String input) {
        return input.split(" ")[1];
    }
}
