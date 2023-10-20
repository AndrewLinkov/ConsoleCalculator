package consoleCalculator;

public class Division implements Operations {
    public void divide() {

        DataInput dataInput = new DataInput();
        dataInput.inputValue();
        int resultDivide = divisionInterface(dataInput.valueClass.getFirstValue(), dataInput.valueClass.getSecondValue());
        System.out.println("------------------------- " +
                "\nResult of division: " + resultDivide);
    }
}
