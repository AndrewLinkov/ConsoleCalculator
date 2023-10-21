// Класс сложения

package consoleCalculator;

public class Addition implements Operations{
    public void add() {

        DataInput dataInput = new DataInput();
        dataInput.inputValue();
        double resultAdding = additionInterface(dataInput.valueClass.getFirstValue(), dataInput.valueClass.getSecondValue());
        System.out.println("------------------------- " +
                "\nAddition result: " + resultAdding);
    }
}
