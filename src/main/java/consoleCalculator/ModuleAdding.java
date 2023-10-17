// Класс, в котором описаны ввод чисел, сложение и вывод результата в консоль

package consoleCalculator;

public class ModuleAdding {
    public int sum() {

        DataInputter dataInputter = new DataInputter();
        //Вызов метода ввода с клавиатуры
        dataInputter.inputter();
        // прописываем логику сложения первого введенног числа + второго числа
        int resultSum = dataInputter.valueClass.getFirstValue() + dataInputter.valueClass.getSecondValue();
        //вывод результата суммы
        System.out.println("Результат сложения: " + resultSum);
        return resultSum;
    }
}
