package org.example;

import org.example.dto.CalculateDto;
import org.example.util.InputParserRefactor;

public class MainRefactor {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("사용 : java CalculatorApp \"<expression>\"");
            System.out.println("예시 : java CalculatorApp \"3 + 4\"");
            return;
        }


        try {
            CalculateDto calculateDto = InputParserRefactor.parseCommandLine(args[0]);
            double result = calculateDto.calculate();

            System.out.println("계산 성공 = " + result);
        } catch (Exception e) {
            System.err.println("Error calculating the expression: " + e.getMessage());
        }
    }
}
