import com.torryharris.model.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void  addTest(){
        Calculator cal=new Calculator();
        Assert.assertEquals(5, cal.add(2,3));
    }
    @Test
    public void  subTest(){
        Calculator cal=new Calculator();
        Assert.assertEquals(-1, cal.sub(2,3));
    }
    @Test
    public void  mulTest(){
        Calculator cal=new Calculator();
        Assert.assertEquals(6, cal.mul(2,3));
    }@Test
    public void  divTest(){
        Calculator cal=new Calculator();
        Assert.assertEquals(1, cal.sub(4,3));
    }
}
