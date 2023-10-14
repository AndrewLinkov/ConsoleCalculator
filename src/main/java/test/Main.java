package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();
        AnotherClass anotherClass = new AnotherClass();
        int sum = anotherClass.sumNumbers(number1, number2);
        System.out.println("Сумма чисел: " + sum);
    }
}

class AnotherClass {
    public int sumNumbers(int number1, int number2) {
        return number1 + number2;
    }
}

