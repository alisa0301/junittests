import org.junit.*;
import org.junit.rules.ExpectedException;

import java.text.spi.NumberFormatProvider;

public class CalculatorDivideTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    Calculator calculator;

    @BeforeClass
    public static void beforeClassInit() {
        System.out.println("Какое-то действие перед всеми тестами!");
    }

    @Before
    public void init() {
        calculator = new Calculator();
        System.out.println("Калькулятор создан!");
    }

    @Test
    public void dividePositiveTest() {
        int result = calculator.divide(6, 3);
        Assert.assertEquals("Деление работает некорректно!", 2, result);
    }

    @Test
    public void divideOnZeroTest() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Не дели на ноль, дурачок!");
        calculator.divide(6, 0);
    }

  //  @Ignore
    @Test(expected = NumberFormatException.class)
    public void divideOnStringTest() {
        calculator.divide(6, Integer.parseInt("Леонид"));
    }

    @After
    public void tearDown() {
        System.out.println("Какое-то действие после каждого теста");
    }
}
