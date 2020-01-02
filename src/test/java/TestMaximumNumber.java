import com.bridgelabz.MaximumNumber;
import org.junit.Assert;
import org.junit.Test;

public class TestMaximumNumber {

    @Test
    public void whenGivenFirstNumber_IfItsMax_ShouldReturnSameNo() {

        MaximumNumber maximumNumber = new MaximumNumber();
        int maxNo = maximumNumber.findMaxNo(400, 200, 100);
        Assert.assertEquals(400, maxNo);
    }

    @Test
    public void whenGivenSecondNumber_IfItsMax_ShouldReturnSameNo() {

        MaximumNumber maximumNumber = new MaximumNumber();
        int maxNo = maximumNumber.findMaxNo(100, 300, 150);
        Assert.assertEquals(300, maxNo);
    }

    @Test
    public void whenGivenThirdNumber_IfItsMax_ShouldReturnSameNo() {

        MaximumNumber maximumNumber = new MaximumNumber();
        int maxNo = maximumNumber.findMaxNo(400, 200, 500);
        Assert.assertEquals(500, maxNo);
    }
}
