import com.torryharris.model.ChangeString;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChangeStringTest extends TestCase {

    ChangeString string;
    @Before
    public void setUp() throws Exception {
        System.out.println("Before Test ");
        string=new ChangeString();
    }
    @After
    public void tearDown() throws Exception {
        System.out.println("After Test ");
    }
    @Test
    public void testToUpperCaseString() {
        Assert.assertEquals("ABCD",string.toUpperCaseString("abcd"));
    }
    @Test
    public void testToLowerCaseString() {
        Assert.assertEquals("abcd",string.toLowerCaseString("ABCD"));
    }

    public void testTestToUpperCaseString() {
    }

    public void testTestToLowerCaseString() {
    }
}