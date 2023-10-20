//Главный класс вычислений, логики.

package consoleCalculator;

public class Processor {
    public void result() {
        DataInput dataInput = new DataInput();

        for (; ; ) {
            dataInput.inputNumberOperation();
            switch (dataInput.valueClass.getNumberOperation()) {
                case 1 -> {
                    System.out.println("Add operation selected");
                    Adding adding = new Adding();
                    adding.add();
                }
                case 2 -> {
                    System.out.println("Subtraction operation selected");
                    Subtraction subtraction = new Subtraction();
                    subtraction.subtraction();
                }
                case 3 -> {
                    System.out.println("Multiply operation selected");
                    Multiplication multiplication = new Multiplication();
                    multiplication.multiply();
                }
                case 4 -> {
                    System.out.println("Division operation selected");
                    Division division = new Division();
                    division.divide();
                }
                case 5 -> System.out.println("Exit");
                default -> System.out.println("Invalid command");
            }
        }
    }
}



