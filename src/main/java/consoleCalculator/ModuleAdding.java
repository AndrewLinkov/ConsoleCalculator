// Класс, в котором описаны ввод чисел, сложение и вывод результата в консоль

package consoleCalculator;

import java.util.Scanner;

public class ModuleAdding {
    public int sum() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number one: ");
        int firstValue = scanner.nextInt();
        System.out.print("Enter number two: ");
        int secondValue = scanner.nextInt();

        ValueClass valueClass = new ValueClass(firstValue, secondValue);
        int resultSum = valueClass.getFirstValue() + valueClass.getSecondValue();
        System.out.println("Result sum: " + resultSum);
        return resultSum;
    }
}
