package org.example;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("사용 : java CalculatorApp \"<expression>\"");
            System.out.println("예시 : java CalculatorApp \"3 + 4\"");
            return;
        }

        String input = args[0];
        try {
            Calculator calculator = new Calculator();
            double result = calculator.calculate(input);
            System.out.println(input + " = " + result);
        } catch (Exception e) {
            System.out.println("Error calculating the expression: " + e.getMessage());
        }
    }
}
