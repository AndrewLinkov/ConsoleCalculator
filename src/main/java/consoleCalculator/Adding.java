// Класс, в котором описаны ввод чисел, сложение и вывод результата в консоль

package consoleCalculator;

public class Adding implements Operations{
    public void sum() {

        DataInput dataInput = new DataInput();
        //Вызов метода ввода с клавиатуры
        dataInput.inputValue();

        //обращаемся к интерфейсу, где прописана логика
        int resultSum = sumInterface(dataInput.valueClass.getFirstValue(), dataInput.valueClass.getSecondValue());

        //вывод результата суммы
        System.out.println("------------------------- " +
                "\nРезультат сложения: " + resultSum);
    }
}
