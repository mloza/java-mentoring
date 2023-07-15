package pl.programovanie.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorServiceTest {

    @Test
    public void shouldAddTwoNumbers() {
        // given
        CalculatorService calculatorService = new CalculatorService(
                new AdderService(),
                new SubtractorService(),
                new MultiplierService(),
                new DividerService()
        );
        var numberOne = 11;
        var numerTwo = 12;
        var expectedResult = numberOne + numerTwo;

        // when
        var result = calculatorService.add(11, 12);

        // then
        assertEquals(expectedResult, result);
    }
}