package consoleCalculator;

public class Multiplication implements Operations {
    public void multiply() {

        DataInput dataInput = new DataInput();
        dataInput.inputValue();
        int resultMultiply = multiplicationInterface(dataInput.valueClass.getFirstValue(), dataInput.valueClass.getSecondValue());
        System.out.println("------------------------- " +
                "\nРезультат умножения: " + resultMultiply);
    }
}
