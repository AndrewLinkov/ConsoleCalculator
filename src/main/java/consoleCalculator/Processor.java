//Главный класс вычислений, логики.

package consoleCalculator;

public class Processor {
    public void result() {
        DataInput dataInput = new DataInput();
//        dataInput.inputNumberOperation();
//
//        if (dataInput.valueClass.getNumberOperation() == 1) {
//            System.out.println("Add operation selected");
//            ModuleAdding moduleAdding = new ModuleAdding();
//            moduleAdding.sum();
//        } else if (dataInput.valueClass.getNumberOperation() == 2) {
//            System.out.println("Subtraction operation selected");
//            ModuleSubtraction moduleSubtraction = new ModuleSubtraction();
//            moduleSubtraction.subtraction();
//        } else {
//            System.out.println("Invalid command");
//        }

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



