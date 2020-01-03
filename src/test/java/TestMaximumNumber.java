import com.bridgelabz.MaximumNumber;
import org.junit.Assert;
import org.junit.Test;

public class TestMaximumNumber {

    // Test Cases For Integer Number
    @Test
    public void whenGivenFirstNumber_IfItsMax_ShouldReturnSameNo() {

        MaximumNumber maximumNumber = new MaximumNumber();
        int maxNo = maximumNumber.findMaxValue(400, 200, 100);
        Assert.assertEquals(400, maxNo);
    }

    @Test
    public void whenGivenSecondNumber_IfItsMax_ShouldReturnSameNo() {

        MaximumNumber maximumNumber = new MaximumNumber();
        int maxNo = maximumNumber.findMaxValue(100, 300, 150);
        Assert.assertEquals(300, maxNo);
    }

    @Test
    public void whenGivenThirdNumber_IfItsMax_ShouldReturnSameNo() {

        MaximumNumber maximumNumber = new MaximumNumber();
        int maxNo = maximumNumber.findMaxValue(400, 200, 500);
        Assert.assertEquals(500, maxNo);
    }


    // Test Cases For Float Number
    @Test
    public void whenGivenFirstFloatNumber_IfItsMax_ShouldReturnSameNo() {

        MaximumNumber maximumNumber = new MaximumNumber();
        float maxNo = maximumNumber.findMaxValue(400.0f, 200.0f, 100.0f);
        Assert.assertEquals(400.0, maxNo,0.0);
    }

    @Test
    public void whenGivenSecondFloatNumber_IfItsMax_ShouldReturnSameNo() {

        MaximumNumber maximumNumber = new MaximumNumber();
        float maxNo = maximumNumber.findMaxValue(100.0f, 300.0f, 150.0f);
        Assert.assertEquals(300.0, maxNo,0.0);
    }

    @Test
    public void whenGivenThirdFloatNumber_IfItsMax_ShouldReturnSameNo() {

        MaximumNumber maximumNumber = new MaximumNumber();
        float maxNo = maximumNumber.findMaxValue(400.0f, 200.0f, 500.0f);
        Assert.assertEquals(500.0, maxNo,0.0);
    }


    // Test Cases For String
    @Test
    public void whenGivenFirstString_IfItsMax_ShouldReturnSameString() {

        MaximumNumber maximumNumber = new MaximumNumber();
        String maxString = maximumNumber.findMaxValue("Peach","Apple","Banana");
        Assert.assertEquals("Peach",maxString);
    }

    @Test
    public void whenGivenSecondString_IfItsMax_ShouldReturnSameString() {

        MaximumNumber maximumNumber = new MaximumNumber();
        String maxString = maximumNumber.findMaxValue("Apple","Peach","Banana");
        Assert.assertEquals("Peach",maxString);
    }

    @Test
    public void whenGivenThirdString_IfItsMax_ShouldReturnSameString() {

        MaximumNumber maximumNumber = new MaximumNumber();
        String maxString = maximumNumber.findMaxValue("Banana","Apple","Peach");
        Assert.assertEquals("Peach",maxString);
    }

    // Test Cases For Generic Type Integer
    @Test
    public void whenGivenFirstIntegerNo_IfItsMax_ShouldReturnSameNo() {

        MaximumNumber maximumNumber = new MaximumNumber(40,20,30);
        Comparable comparable = maximumNumber.testMaximum();
        Assert.assertEquals(40,comparable);
    }

    @Test
    public void whenGivenSecondIntegerNo_IfItsMax_ShouldReturnSameNo() {

        MaximumNumber maximumNumber = new MaximumNumber(20,40,30);
        Comparable comparable = maximumNumber.testMaximum();
        Assert.assertEquals(40,comparable);
    }

    @Test
    public void whenGivenThirdIntegerNo_IfItsMax_ShouldReturnSameNo() {

        MaximumNumber maximumNumber = new MaximumNumber(20,30,40);
        Comparable comparable = maximumNumber.testMaximum();
        Assert.assertEquals(40,comparable);
    }

    //Test Cases For Generic Type Float
    @Test
    public void whenGivenFristFloatNo_IfItsMax_ShouldReturnSameNo() {

        MaximumNumber maximumNumber = new MaximumNumber(40.0f,20.0f,30.0f);
        Comparable comparable = maximumNumber.testMaximum();
        Assert.assertEquals(40.0f,comparable);
    }

    @Test
    public void whenGivenSecondFloatNo_IfItsMax_ShouldReturnSameNo() {

        MaximumNumber maximumNumber = new MaximumNumber(20.0f,40.0f,30.0f);
        Comparable comparable = maximumNumber.testMaximum();
        Assert.assertEquals(40.0f,comparable);
    }

    @Test
    public void whenGivenThirdFloatNo_IfItsMax_ShouldReturnSameNo() {

        MaximumNumber maximumNumber = new MaximumNumber(30.0f,20.0f,40.0f);
        Comparable comparable = maximumNumber.testMaximum();
        Assert.assertEquals(40.0f,comparable);
    }

    //Test Cases For Generic Type String
    @Test
    public void whenGivenFirstString_IfItsMax_ShouldReturnSameSring() {

        MaximumNumber maximumNumber = new MaximumNumber("Peach","Apple","Banana");
        Comparable comparable = maximumNumber.testMaximum();
        Assert.assertEquals("Peach",comparable);
    }

    @Test
    public void whenGivenSecondString_IfItsMax_ShouldReturnSameSring() {

        MaximumNumber maximumNumber = new MaximumNumber("Apple","Peach","Banana");
        Comparable comparable = maximumNumber.testMaximum();
        Assert.assertEquals("Peach",comparable);
    }

    @Test
    public void whenGivenThirdString_IfItsMax_ShouldReturnSameSring() {

        MaximumNumber maximumNumber = new MaximumNumber("Banana","Apple","Peach");
        Comparable comparable = maximumNumber.testMaximum();
        Assert.assertEquals("Peach",comparable);
    }

    // Test Case For Multiple Arguments
    @Test
    public void whenGivenMultipleIntegerNo_IfItsMax_ShouldReturnSameNo() {

        MaximumNumber maximumNumber = new MaximumNumber(30,20,40,50,60);
        Comparable comparable = maximumNumber.testMaximum();
        Assert.assertEquals(60,comparable);
    }

    @Test
    public void whenGivenMultipleFloatNo_IfItsMax_ShouldReturnSameNo() {

        MaximumNumber maximumNumber = new MaximumNumber(70.0f,20.0f,40.0f,50.0f,30.0f);
        Comparable comparable = maximumNumber.testMaximum();
        Assert.assertEquals(70.0f,comparable);
    }

    @Test
    public void whenGivenMultipleString_IfItsMax_ShouldReturnSameSring() {

        MaximumNumber maximumNumber = new MaximumNumber("Banana","Apple","Peach","Mango","Orange");
        Comparable comparable = maximumNumber.testMaximum();
        Assert.assertEquals("Peach",comparable);
    }
}
