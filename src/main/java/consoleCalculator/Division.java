//Класс сложения

package consoleCalculator;

public class Division implements Operations {
    public void divide() {

        DataInput dataInput = new DataInput();
        dataInput.inputValue();
        if (dataInput.valueClass.getSecondValue() == 0) {
            System.out.println("The operation cannot be performed. You can't divide by zero!");
        } else if (dataInput.valueClass.getSecondValue() > dataInput.valueClass.getFirstValue()) {
            System.out.println("The operation cannot be performed. The second number is greater than the first");
        } else {
            double result = divisionInterface(dataInput.valueClass.getFirstValue(), dataInput.valueClass.getSecondValue());
            double resultDivide = Math.round(result * 10.0) / 10.0;
            System.out.println("------------------------- " +
                    "\nResult of division: " + resultDivide);
        }
    }
}
