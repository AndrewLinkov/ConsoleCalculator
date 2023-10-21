// Класс описывающий логику вычитания

package consoleCalculator;

public class Subtraction implements Operations {
    public double subtraction() {

        DataInput dataInput = new DataInput();
        dataInput.inputValue();

        if (dataInput.valueClass.getFirstValue() < dataInput.valueClass.getSecondValue()) {
            System.out.println("The subtraction operation is not possible because the first number is less than the second " +
                    "\nEnter valid values");
        } else {
            double resultSubtraction = subtractionInterface(dataInput.valueClass.getFirstValue(), dataInput.valueClass.getSecondValue());
            System.out.println("-------------------------" +
                    "\nSubtraction result: " + resultSubtraction);
            return resultSubtraction;
        }
        return subtraction();
    }
}
