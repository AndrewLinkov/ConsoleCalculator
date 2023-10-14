package consoleCalculator;

import java.util.Scanner;

public class Calculator {
    public void result() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Номер операции: ");
        int value = scanner.nextInt();


        if (value == 1) {
            ModuleSum moduleSum = new ModuleSum();
            moduleSum.sum();
        } else if (value == 2) {
            ModuleSubtraction moduleSubtraction = new ModuleSubtraction();
            moduleSubtraction.subtraction();
        } else {
            System.out.println("Неверная команда");
        }
        return;
    }
}
