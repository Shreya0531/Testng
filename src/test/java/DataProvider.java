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
    private void testAdditionOfTwoNumbers(int num1,int num2,int result){

        //Act
        int addition = calculator.add(num1, num2);

        //Assert
        Assert.assertEquals(addition,result);
    }
}
