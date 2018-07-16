import calculator.*;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests {

    @Test
    public void positiveSumResultTesting() {
        Operation operation = new Sum(1,2);
        Assert.assertEquals("arg1 + arg2 = +3,0000",operation.getResult());
    }

    @Test
    public void negativeFormatSumResultTesting() {
        Operation operation = new Sum(1,2);
        Assert.assertNotEquals("arg1 + arg2 = +3,0",operation.getResult());
    }

    @Test
    public void negativeSumResultTesting() {
        Operation operation = new Sum(1,2);
        Assert.assertNotEquals("arg1 + arg2 = +2,0000",operation.getResult());
    }

    @Test
    public void positiveSubResultTesting() {
        Operation operation = new Subtraction(1,2);
        Assert.assertEquals("arg1 - arg2 = -1,0000",operation.getResult());
    }

    @Test
    public void negativeFormatSubResultTesting() {
        Operation operation = new Subtraction(1,2);
        Assert.assertNotEquals("arg1 - arg2 = -1,0",operation.getResult());
    }

    @Test
    public void negativeSubResultTesting() {
        Operation operation = new Subtraction(1,2);
        Assert.assertNotEquals("arg1 - arg2 = +1,0000",operation.getResult());
    }

    @Test
    public void positiveMultiplicateResultTesting() {
        Operation operation = new Multiplication(1,2);
        Assert.assertEquals("arg1 * arg2 = +2,0000",operation.getResult());
    }

    @Test
    public void negativeFormatMultiplicateResultTesting() {
        Operation operation = new Multiplication(1,2);
        Assert.assertNotEquals("arg1 * arg2 = +2,0",operation.getResult());
    }

    @Test
    public void negativeMultiplicateResultTesting() {
        Operation operation = new Multiplication(1,2);
        Assert.assertNotEquals("arg1 * arg2 = +1,0000",operation.getResult());
    }

    @Test
    public void positiveDivisionResultTesting() {
        Operation operation = new Division(1,2);
        Assert.assertEquals("arg1 / arg2 = +0,5000",operation.getResult());
    }

    @Test
    public void negativeFormatDivisionResultTesting() {
        Operation operation = new Division(1,2);
        Assert.assertNotEquals("arg1 / arg2 = +0,5",operation.getResult());
    }

    @Test
    public void negativeDivisionResultTesting() {
        Operation operation = new Division(1,2);
        Assert.assertNotEquals("arg1 / arg2 = +0,0500",operation.getResult());
    }
}
