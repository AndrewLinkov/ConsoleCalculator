package consoleCalculator;

public interface Calculatable {
    default int sum(int a, int b) {
        return a + b;
    }

    default int substruct(int a, int b) {
        return a - b;
    }
}
