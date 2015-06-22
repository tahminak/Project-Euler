import com.tamzeveloper.problems.Problem3;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;
/**
 * Created by tahmina on 15-05-30.
 */
public class Problem3Test {


    private FakePrintStream stream;

    /*

    The prime factors of 13195 are 5, 7, 13 and 29.

    What is the largest prime factor of the number 600851475143 ?


     */

    @Before
    public void setUpStreams() {
        stream=new FakePrintStream();
    }


    @Test(timeout=100)
    public void problem3Test(){

        Problem3 problem3=new Problem3();

        assertTrue("failure - should be true", true);

        assertEquals("failure -  The Largest prime factors of 13195 is 29 are 5, 7, 13 and 29.", problem3.getLargestPrimeFactor(13195),29);
       // problem3.getLargestPrimeFactor(13195);
        //assertEquals("[5, 7, 13, 29]\n",stream.getPrintedString());
        //assertEquals("failure -  The Largest prime factors of 13195 is 29 are 5, 7, 13 and 29.", problem3.getLargestPrimeFactor(60000000),5);


    }

    @Test
    public void out() {

        //System.out.print("hello");
       // assertEquals("hello", stream.getPrintedString());
    }


}
