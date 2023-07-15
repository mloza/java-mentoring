package pl.programovanie;

import pl.programovanie.calculator.*;

public class Main {
    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorService(
                new AdderService(),
                new SubtractorService(),
                new MultiplierService(),
                new DividerService()
        );

        System.out.println("Hello result of 13 - 6 is " + calculatorService.subtract(13, 6));
    }
}