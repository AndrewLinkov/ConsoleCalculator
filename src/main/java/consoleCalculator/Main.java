package consoleCalculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Начало программы. \n1. Сложение \n2. Вычитание \n ----------------- ");
        Calculator calculator = new Calculator();
        System.out.println("Сумма: " + calculator.getResult(Actions.SUM, 7, 5));
    }
}
