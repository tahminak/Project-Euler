import com.tamzeveloper.problems.Problem1;
import org.junit.Assert;
import org.junit.Test;
/**
 * Created by tahmina on 15-05-29.
 */
public class Problem1Test {


    @Test(timeout=50)
    public void TestSumOfMultiples3and5(){



        Assert.assertEquals( "Incorrect sum of multiples of 3 or 5 below 1,000",233168, Problem1.getSumOfMultiples3and5(1000));

        Assert.assertEquals( "Incorrect sum of multiples of 3 or 5 below 10,000",23331668, Problem1.getSumOfMultiples3and5(10000));


    }

    @Test
    public void testAssertTrue() {
        org.junit.Assert.assertTrue("failure - should be true", true);
    }
}
