//Класс ввода данных

package consoleCalculator;

import java.util.Scanner;

public class DataInput {
    ValueClass valueClass = new ValueClass();
    Scanner scanner = new Scanner(System.in);

    //Метод ввода в модули сложения, вычитания, умножения и деления.
    public ValueClass inputterValue() {
        System.out.print("Enter number one: ");
        valueClass.setFirstValue(scanner.nextInt());
        System.out.print("Enter number two: ");
        valueClass.setSecondValue(scanner.nextInt());
        scanner.close();
        return valueClass;
    }

    //Метод ввода выбора операции вычисления
    public void inputNumberOperation() {
        System.out.println("Enter calculation operation number: ");
        valueClass.setNumberOperation(scanner.nextInt());
        return;
    }
}

