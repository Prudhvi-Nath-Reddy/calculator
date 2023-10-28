import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Main calculator;
    @Before
    public void setup(){ calculator = new Main();}
    @Test
    public void test_add_positive(){
        double a = 1.0;
        double b = 2.0;
        double expectedResult = 3.0;
        double actualResult = calculator.add(a,b) ;

        Assert.assertEquals(expectedResult,actualResult,0.001);
    }
    @Test
    public void test_add_negative(){
        double a = 1.0;
        double b = 2.0;
        double expectedResult = 2.0;
        Assert.assertNotEquals(expectedResult, calculator.add(a,b));
    }
}
