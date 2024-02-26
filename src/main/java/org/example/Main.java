package org.example;

import org.example.dto.CalculateDto;
import org.example.util.InputParser;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("사용 : java Main \"<expression>\"");
            System.out.println("예시 : java Main \"3 + 4\"");
            return;
        }

        try {
            CalculateDto calculateDto = InputParser.parseCommandLine(args[0]);
            double result = calculateDto.calculate();
            System.out.println("계산 성공 = " + result);
        } catch (Exception e) {
            System.err.println("Error calculating the expression: " + e.getMessage());
        }
    }
}
