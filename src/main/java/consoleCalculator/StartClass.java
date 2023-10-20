package consoleCalculator;

public class StartClass {

    public static void start() {
        System.out.println(
                """
                        The program is a console calculator.
                        Operations are selected by entering the values 1,2,3,4 from the keyboard
                        1. Adding\s
                        2. Subtraction\s
                        3. Multiplication\s
                        4. Division\s
                        -----------------\s
                        5. Exit\s"""
        );
    }
}
