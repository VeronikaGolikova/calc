package calculator;

public class Sum extends Operation {
    private double resultOfOperation;
    public Sum(double agr1, double agr2) {
        super(agr1, agr2, 1);
    }

    @Override
    public String getResult() {
        return String.format("arg1 + arg2 = %+.4f", getAgr1()+getAgr2());
    }
}
