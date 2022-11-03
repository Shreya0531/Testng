import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TimeoutAttribute {
    Calculator calculator;

    @BeforeMethod
    private void setUp(){
        calculator = new Calculator();
    }
    @Test
    private void testAdditionOfTwoNumbers(){
        //Arrange
        int number1 = 1;
        int number2 = 2;

        //Act
        int addition = calculator.add(number1, number2);

        //Assert
        Assert.assertEquals(addition, 3);
    }

    @Test (timeOut =200)
    private void subtractionOfTwoNumbers() throws Exception{
        //1.Arrange
        int number1 = 10;
        int number2 = 5;

        //2.Act
        int subtract = calculator.subtract(number1,number2);

        Thread.sleep(300);
        //3.Assert
        Assert.assertEquals(subtract,5);
    }
}
