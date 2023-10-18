//Класс ввода данных

package consoleCalculator;

import java.util.Scanner;

public class DataInput {
    ValueClass valueClass = new ValueClass();
    Scanner scanner = new Scanner(System.in);

    //Метод ввода в модули сложения, вычитания, умножения и деления.
    public ValueClass inputValue() {
        System.out.print("Enter number one: ");
        valueClass.setFirstValue(scanner.nextInt());
        System.out.print("Enter number two: ");
        valueClass.setSecondValue(scanner.nextInt());
        return valueClass;
    }

    //Метод ввода выбора операции вычисления
    public int inputNumberOperation() {
        System.out.println("-------------------------" +
                "\nEnter calculation operation number: ");
        valueClass.setNumberOperation(scanner.nextInt());
        return valueClass.getNumberOperation();
    }
}

