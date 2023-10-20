//Главный класс вычислений, логики.

package consoleCalculator;

public class Processor {
    public void result() {
        DataInput dataInput = new DataInput();
        StartClass.start();
        do {
            dataInput.inputNumberOperation();
            switch (dataInput.valueClass.getNumberOperation()) {
                case 1 -> {
                    System.out.println("Addition operation selected");
                    Addition addition = new Addition();
                    addition.add();
                }
                case 2 -> {
                    System.out.println("Subtraction operation selected");
                    Subtraction subtraction = new Subtraction();
                    subtraction.subtraction();
                }
                case 3 -> {
                    System.out.println("Multiplication operation selected");
                    Multiplication multiplication = new Multiplication();
                    multiplication.multiply();
                }
                case 4 -> {
                    System.out.println("Division operation selected");
                    Division division = new Division();
                    division.divide();
                }
                case 0 -> {
                    System.out.println("Exit");
                    ExitClass exitClass = new ExitClass();
                    exitClass.exit();
                }
                default -> System.out.println("Invalid command");
            }
        } while (dataInput.valueClass.getNumberOperation() != 0);
    }
}

