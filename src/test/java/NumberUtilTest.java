import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberUtilTest {
    NumberUtil util = new NumberUtil();
    @Test
    public void testFactorial() {
        int result = util.factorial(5);
        Assert.assertEquals(120, result);
    }

    @Test
    public void testZero() {
        int result = util.factorial(0);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testNegativeNumber() {
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            util.factorial(-1);
        });
    }
}



