package consoleCalculator;

import java.util.Scanner;

public class ModuleSubtraction {
    public void subtraction () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Значение а: ");
        int firstValue = scanner.nextInt();
        System.out.println("Значение b: ");
        int secondValue = scanner.nextInt();

        int resultSubtraction = firstValue + secondValue;
        System.out.println("Результат вычитания = " + resultSubtraction );

    }
}
