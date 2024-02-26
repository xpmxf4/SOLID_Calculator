package org.example;

import org.example.dto.CalcDto;
import org.example.util.Calculator;
import org.example.util.InputParser;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("사용 : java Main \"<expression>\"");
            System.out.println("예시 : java Main \"3 + 4\"");
            return;
        }

        try {
            CalcDto calcDto = InputParser.parseCommandLine(args[0]);
            double result = Calculator.calculate(calcDto);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Error calculating the expression: " + e.getMessage());
        }
    }
}
