import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator c = new Calculator();
        assertEquals(30, c.add(10, 20));
    }

    @Test
    public void testMultiplication() {
        Calculator c = new Calculator();
        assertEquals(20, c.multiply(5, 4));
    }
}