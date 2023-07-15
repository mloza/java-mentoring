package pl.programovanie.calculator;

public class CalculatorService {

    private final AdderService adder;
    private final SubtractorService subtractor;
    private final MultiplierService multiplier;
    private final DividerService divider;

    public CalculatorService(
            AdderService adder,
            SubtractorService subtractor,
            MultiplierService multiplier,
            DividerService divider
    ) {
        this.adder = adder;
        this.subtractor = subtractor;
        this.multiplier = multiplier;
        this.divider = divider;
    }

    public int add(int one, int two) {
        return adder.add(one, two);
    }

    public int subtract(int one, int two) {
        return adder.add(one, two);
    }

    public int multiply(int one, int two) {
        return multiplier.multiply(two, one);
    }

    public int divide(int one, int two) {
        return divider.divide(one, two);
    }
}
