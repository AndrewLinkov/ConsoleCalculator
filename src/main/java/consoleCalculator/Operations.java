package consoleCalculator;

public interface Operations {
    default int sumInterface(int a, int b) {
        return a + b;
    }

    default int subtractionInterface(int a, int b) {
        return a - b;
    }
}
