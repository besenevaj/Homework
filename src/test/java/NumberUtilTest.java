import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NumberUtilTest {
    NumberUtil util = new NumberUtil();
    @Test
    public void testFactorial() {
        int result = util.factorial(5);
        assertEquals(120, result);
    }

    @Test
    public void testZero() {
        int result = util.factorial(0);
        assertEquals(1, result);
    }

    @Test
    public void testNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            util.factorial(-1);
        });
    }
}



