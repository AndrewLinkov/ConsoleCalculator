// Класс, в котором описаны ввод чисел, сложение и вывод результата в консоль

package consoleCalculator;

public class ModuleAdding {
    public void sum() {

        DataInput dataInput = new DataInput();
        //Вызов метода ввода с клавиатуры
        dataInput.inputValue();
        // прописываем логику сложения первого введенног числа + второго числа

        int resultSum = dataInput.valueClass.getFirstValue() + dataInput.valueClass.getSecondValue();
        //вывод результата суммы
        System.out.println("------------------------- " +
                "\nРезультат сложения: " + resultSum);
    }
}
