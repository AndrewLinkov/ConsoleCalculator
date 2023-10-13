package consoleCalculator;

public class Calculator implements Calculatable{
//    private int first;
//    private int sec;
//
//    public Calculator(int first, int sec) {
//        this.first = first;
//        this.sec = sec;
//    }

    public int getResult(Actions actions, int first, int sec) {
        if (actions.equals(Actions.SUBSTRUCTING)) {
            return this.substruct(first, sec);
        } else {
            return actions.equals(Actions.SUM) ? this.sum(first, sec) : 0;
        }
    }
}
