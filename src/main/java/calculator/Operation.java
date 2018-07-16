package calculator;

public abstract class Operation {
    private double agr1;
    private double agr2;
    private int operation;
    private double resultOfOperation;

    protected Operation(double agr1, double agr2, int operation) {
        this.agr1 = agr1;
        this.agr2 = agr2;
        this.operation = operation;
    }

    public double getAgr1() {
        return agr1;
    }

    public double getAgr2() {
        return agr2;
    }

    public abstract String getResult();
}
