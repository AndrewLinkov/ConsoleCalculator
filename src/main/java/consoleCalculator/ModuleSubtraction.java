// Класс, в котором описаны ввод чисел, вычитание и вывод результата в консоль

package consoleCalculator;

public class ModuleSubtraction {
    public int subtraction() {
        DataInputter dataInputter = new DataInputter();
        //Вызов метода ввода с клавиатуры
        dataInputter.inputter();
        // прописываем логику вычитания первого введенног числа - второго числа,
        // с проверкой что первое число больше второго
        if (dataInputter.valueClass.getFirstValue() >= dataInputter.valueClass.getSecondValue()) {
            int resultSubtraction = dataInputter.valueClass.getFirstValue() - dataInputter.valueClass.getSecondValue();
            //вывод результата вычитания
            System.out.println("Результат вычитания: " + resultSubtraction);
            return resultSubtraction;
        } else {
            System.out.println("Операция вычитания невозможно, т.к первое число меньше второго " +
                    "\nВведите корректные значения");
        }
        return subtraction();
    }
}
