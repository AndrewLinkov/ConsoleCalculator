package consoleCalculator;

public interface Operations {
    default int addingInterface(int a, int b) {
        return a + b;
    }

    default int subtractionInterface(int a, int b) {
        return a - b;
    }

    default int multiplicationInterface(int a, int b) {
        return a * b;
    }

    default int divisionInterface(int a, int b) {
        return a / b;
    }
}
