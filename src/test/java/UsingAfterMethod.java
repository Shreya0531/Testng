import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UsingAfterMethod {

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

    @Test
    private void subtractionOfTwoNumbers(){
        //1.Arrange
        int number1 = 10;
        int number2 = 5;

        //2.Act
        int subtract = calculator.subtract(number1,number2);

        //3.Assert
        Assert.assertEquals(subtract,5);
    }

    @Test
    private void multipleTwoNumbers(){
        //1.Arrange
        int number1 = 5;
        int number2 = 5;

        //2.Act
        int multiplication = calculator.multiply(number1,number2);

        //3.Assert
        Assert.assertEquals(multiplication,25);
    }

    @Test
    private void percentageCalculation(){
        //1.Arrange
        int number = 432;
        int total = 600;

        //2/Act
        double percent = calculator.percentage(number,total);

        //3.Assert
        Assert.assertEquals(percent,72);
    }

    @Test
    private void squareOfTwoNumbers(){
        //1.Arrange
        int number = 2;

        //2.Act
        int square = calculator.square(number);

        //3.Assert
        Assert.assertEquals(square,4);
    }

    @AfterMethod
    private  void tearDown(){
        System.out.println("Running after each and every tests");
    }
}
