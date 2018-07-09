package calculator;

public class Division extends Operation {
    private double resultOfOperation;
    public Division(double agr1, double agr2) {
        super(agr1, agr2, 4);
    }

    @Override
    public String getResult() {
        return String.format("arg1 / arg2 = %+.4f", getAgr1()/getAgr2());
    }
}
