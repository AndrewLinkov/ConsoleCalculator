//Класс ввода данных

package consoleCalculator;

import java.util.Scanner;

public class DataInputter {
    ValueClass valueClass = new ValueClass();

    public ValueClass inputter() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number one: ");
        valueClass.setFirstValue(scanner.nextInt());
        System.out.print("Enter number two: ");
        valueClass.setSecondValue(scanner.nextInt());
        return valueClass;
    }
}

