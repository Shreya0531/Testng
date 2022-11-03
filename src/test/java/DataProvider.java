import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProvider {
    Calculator calculator;

    @BeforeMethod
    private void setUp(){
        calculator = new Calculator();

    }




    @Test(dataProvider = "additionData",dataProviderClass = DataProvider.class)
    private void testAdditionOfTwoNumbers(int number1,int number2,int result){


        //Act
        int addition = calculator.add(number1, number2);

        //Assert
        Assert.assertEquals(addition,result);
    }
}
