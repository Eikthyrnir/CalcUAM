package calculator;


import com.mycompany.calculator.Calculator;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeClass
    public static void init() {
        calculator = new Calculator();
    }

    @Test
    public void addTwoNumbersTest() {
        Assert.assertEquals(8, calculator.CalculateRectCirc(2,2));
    }

   
}
