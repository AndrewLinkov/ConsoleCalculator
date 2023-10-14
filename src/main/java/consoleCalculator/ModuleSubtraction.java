// Класс, в котором описаны ввод чисел, вычитание и вывод результата в консоль

package consoleCalculator;

import java.util.Scanner;

public class ModuleSubtraction {
    public int subtraction() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number one: ");
        int firstValue = scanner.nextInt();
        System.out.print("Enter number two: ");
        int secondValue = scanner.nextInt();

        ValueClass valueClass = new ValueClass(firstValue, secondValue);
        int resultSubtraction = valueClass.getFirstValue() - valueClass.getSecondValue();
        System.out.println("Result subtraction" + resultSubtraction);
        return resultSubtraction;
    }
}
