package calculator;

public class Subtraction extends Operation {
    private double resultOfOperation;
    public Subtraction(double agr1, double agr2) {
        super(agr1, agr2, 2);
    }

    @Override
    public String getResult() {
        return String.format("arg1 - arg2 = %+.4f", getAgr1()-getAgr2());
    }
}
