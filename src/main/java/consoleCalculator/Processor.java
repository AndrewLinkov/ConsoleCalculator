//Главный класс вычислений, логики.

package consoleCalculator;

public class Processor {
    public void result() {
        DataInput dataInput = new DataInput();

        for (; ; ) {
            dataInput.inputNumberOperation();
            switch (dataInput.valueClass.getNumberOperation()) {
                case 1:
                    System.out.println("Add operation selected");
                    Adding adding = new Adding();
                    adding.sum();
                    break;
                case 2:
                    System.out.println("Subtraction operation selected");
                    Subtraction subtraction = new Subtraction();
                    subtraction.subtraction();
                    break;
                default:
                    System.out.println("Invalid command");

            }
        }
    }
}



