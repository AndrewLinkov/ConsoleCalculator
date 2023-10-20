// Класс, в котором описаны ввод чисел, вычитание и вывод результата в консоль

package consoleCalculator;

public class Subtraction implements Operations {
    public int subtraction() {
        DataInput dataInput = new DataInput();
        //Вызов метода ввода с клавиатуры
        dataInput.inputValue();
        // прописываем логику вычитания первого введенног числа - второго числа,
        // с проверкой что первое число больше второго
        if (dataInput.valueClass.getFirstValue() >= dataInput.valueClass.getSecondValue()) {
            //обращаемся к интерфейсу, где прописана логика
            int resultSubtraction = subtractionInterface(dataInput.valueClass.getFirstValue(), dataInput.valueClass.getSecondValue());
            System.out.println("-------------------------" +
                    "\nSubtraction result: " + resultSubtraction);
            return resultSubtraction;
        } else {
            System.out.println("The subtraction operation is not possible because the first number is less than the second " +
                    "\nEnter valid values");
        }
        return subtraction();
    }
}
