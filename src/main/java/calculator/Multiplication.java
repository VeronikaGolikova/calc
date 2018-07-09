package calculator;

public class Multiplication extends Operation {
    private double resultOfOperation;
    public Multiplication(double agr1, double agr2) {
        super(agr1, agr2, 3);
    }

    @Override
    public String getResult() {
        return String.format("arg1 * arg2 = %+.4f", getAgr1()*getAgr2());
    }
}
