import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();

    }

    @Test
    public void add() {
        assertEquals(4, calculator.add(2, 2));
    }
    @Test
    public void subtract(){
        assertEquals(2, calculator.subtract(6, 4));
    }
    @Test
    public void multiply(){
        assertEquals(10, calculator.multiply(2, 5));
    }
    @Test
    public void divide(){
        assertEquals(3, calculator.divide(9, 3), 0.01);
    }
}