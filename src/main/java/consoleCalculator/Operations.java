package consoleCalculator;

public interface Operations {
    default double additionInterface(double a, double b) {
        return a + b;
    }

    default double subtractionInterface(double a, double b) {
        return a - b;
    }

    default double multiplicationInterface(double a, double b) {
        return a * b;
    }

    default double divisionInterface(double a, double b) {
        return a / b;
    }
}
