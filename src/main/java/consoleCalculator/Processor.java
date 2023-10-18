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
                    ModuleAdding moduleAdding = new ModuleAdding();
                    moduleAdding.sum();
                    break;
                case 2:
                    System.out.println("Subtraction operation selected");
                    ModuleSubtraction moduleSubtraction = new ModuleSubtraction();
                    moduleSubtraction.subtraction();
                    break;
                default:
                    System.out.println("Invalid command");

            }
        }
    }
}



