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
}
