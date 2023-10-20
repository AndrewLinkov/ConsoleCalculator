package consoleCalculator;

public class StartClass {

    public static void start() {
        System.out.println(
                """
                        -------------------------
                        The program is a console calculator.\s
                        Select operations from the list: addition, subtraction, multiplication, division\s
                        -------------------------\s
                        1. Addition\s
                        2. Subtraction\s
                        3. Multiplication\s
                        4. Division\s
                        -------------------------\s
                        0. Exit\s"""
        );
    }
}
