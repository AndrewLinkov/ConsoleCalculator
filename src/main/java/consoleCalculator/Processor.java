//Главный класс вычислений, логики.

package consoleCalculator;

import java.util.Scanner;

public class Processor {
    public void result() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Calculation operation number: ");
            int numberOperation = scanner.nextInt();
            if (numberOperation == 1) {
                System.out.println("Add operation selected");
                ModuleSum moduleSum = new ModuleSum();
                moduleSum.sum();
            } else if (numberOperation == 2) {
                System.out.println("Subtraction operation selected");
                ModuleSubtraction moduleSubtraction = new ModuleSubtraction();
                moduleSubtraction.subtraction();
            } else {
                System.out.println("Invalid command");
            }
            return;
        }
    }
}
