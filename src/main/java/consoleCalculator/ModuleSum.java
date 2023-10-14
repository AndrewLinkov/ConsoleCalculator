package consoleCalculator;

import java.util.Scanner;
import java.util.SortedMap;

public class ModuleSum {
    public void sum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int firstValue = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int secondValue = scanner.nextInt();

        int resultSum = firstValue + secondValue;
        System.out.println("Результат суммы = " + resultSum );
        return;
    }
}
