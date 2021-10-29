import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator=new Calculator();
    @Test
    public void add() {
        Assert.assertEquals(7,calculator.add(2,3));
    }

    @Test
    public void sub() {
        Assert.assertEquals(1,calculator.sub(2,3));
    }

    @Test
    public void mul() {
        Assert.assertEquals(4,calculator.mul(2,3));
    }

    @Test
    public void div() {
        Assert.assertEquals(1,calculator.div(8,4));
    }
}