// Класс, в котором описаны ввод чисел, вычитание и вывод результата в консоль

package consoleCalculator;

public class ModuleSubtraction {
    public int subtraction() {
        DataInput dataInput = new DataInput();
        //Вызов метода ввода с клавиатуры
        dataInput.inputterValue();
        // прописываем логику вычитания первого введенног числа - второго числа,
        // с проверкой что первое число больше второго
        if (dataInput.valueClass.getFirstValue() >= dataInput.valueClass.getSecondValue()) {
            int resultSubtraction = dataInput.valueClass.getFirstValue() - dataInput.valueClass.getSecondValue();
            //вывод результата вычитания
            System.out.println("Результат вычитания: " + resultSubtraction);
            return resultSubtraction;
        } else {
            System.out.println("Операция вычитания невозможна, т.к первое число меньше второго " +
                    "\nВведите корректные значения");
        }
        return subtraction();
    }
}
