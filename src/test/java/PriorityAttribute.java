import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.IOException;

public class PriorityAttribute {
    Calculator calculator;

    @BeforeMethod
    private void setUp(){
        calculator = new Calculator();
    }
    @Test(priority = 1)
    private void testAdditionOfTwoNumbers(){
        //Arrange
        int number1 = 1;
        int number2 = 2;

        //Act
        int addition = calculator.add(number1, number2);

        //Assert
        Assert.assertEquals(addition, 3);
    }

    @Test (priority = 2)
    private void subtractionOfTwoNumbers(){
        //1.Arrange
        int number1 = 10;
        int number2 = 5;

        //2.Act
        int subtract = calculator.subtract(number1,number2);

        //3.Assert
        Assert.assertEquals(subtract,5);
    }

    @Test(priority = 3)
    private void squareOfTwoNumbers(){
        //1.Arrange
        int number = 2;

        //2.Act
        int square = calculator.square(number);

        //3.Assert
        Assert.assertEquals(square,4);
    }

    @Test (expectedExceptions = {IOException.class})
    private void testForException() throws IOException {
        throw new IOException();
    }

}
