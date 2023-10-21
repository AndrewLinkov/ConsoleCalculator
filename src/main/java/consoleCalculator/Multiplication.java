//Класс сложения

package consoleCalculator;

public class Multiplication implements Operations {
    public void multiply() {

        DataInput dataInput = new DataInput();
        dataInput.inputValue();
        double resultMultiply = multiplicationInterface(dataInput.valueClass.getFirstValue(), dataInput.valueClass.getSecondValue());
        System.out.println("------------------------- " +
                "\nResult of multiplication: " + resultMultiply);
    }
}
