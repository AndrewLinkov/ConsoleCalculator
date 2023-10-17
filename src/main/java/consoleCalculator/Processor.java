//Главный класс вычислений, логики.

package consoleCalculator;

import java.util.Scanner;

public class Processor {
    public void result() {
        Scanner scanner = new Scanner(System.in);

        for (; ; ) {
            System.out.println("Enter calculation operation number: ");
            int numberOperation = scanner.nextInt();
            switch (numberOperation) {
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

