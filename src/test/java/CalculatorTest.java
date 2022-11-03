import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test
    private void testAdditionOfTwoNumbers(){
        //Arrange
        int number1 = 1;
        int number2 = 2;

        //Act
        Calculator calculator = new Calculator();
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
        Calculator calculator = new Calculator();
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
        Calculator calculator = new Calculator();
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
        Calculator calculator = new Calculator();
        double percent = calculator.percentage(number,total);

        //3.Assert
        Assert.assertEquals(percent,72);
    }

    @Test
    private void squareOfTwoNumbers(){
        //1.Arrange
        int number = 2;

        //2.Act
        Calculator calculator = new Calculator();
        int square = calculator.square(number);

        //3.Assert
        Assert.assertEquals(square,4);
    }



}
