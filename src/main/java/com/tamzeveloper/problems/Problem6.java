package com.tamzeveloper.problems;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


/**
 * Created by Tahmina Khan
 */

/*



   Sum square difference

    Problem 6
    The sum of the squares of the first ten natural numbers is,

    12 + 22 + ... + 102 = 385
    The square of the sum of the first ten natural numbers is,

    (1 + 2 + ... + 10)2 = 552 = 3025
    Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

    Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.


 */

public class Problem6 {


    private long sumSquareDifference(int num) {
        return squaresOfSum(num)-sumOfSqaures(num);
    }

    //Return sum of the squares
    //Sum of squares of first n numbers = n(n+1)(2n+1)/6
    private long sumOfSqaures(int num) {


        return (num*(num+1)*(2*num+1))/6;
    }


    //Return square of the sum
    // Sum of first n numbers = n(n+1)/2
    private long squaresOfSum(long num) {

        long result=((num*(num+1))/2);

        return result*result;
    }




    @Test(timeout=50)
   public void TestSumOfSquareDifference_10(){
     // System.out.println("Incorrect Sum square difference of the first ten natural numbers  ");
      assertThat("Incorrect Sum square difference of the first ten natural numbers", sumSquareDifference(10) , is(2640L));
  }


    @Test(timeout=50)
    public void TestSquaresOfSum_10(){
        //System.out.println("Incorrect Sum square difference of the first ten natural numbers  ");
        assertThat("Incorrect Square of the sum", squaresOfSum(10) , is(3025L));
    }

    @Test(timeout=50)
    public void TestSumOfSqaures_10(){
       // System.out.println("Incorrect Sum square difference of the first ten natural numbers  ");
        assertThat("Incorrect Sum of the Squares", sumOfSqaures(10) , is(385L));
    }

    @Test(timeout=50)
    public void TestSumOfSquareDifference_100(){
        long sumSquareOfDifference=sumSquareDifference(100);
        System.out.println("Sum square difference : "+sumSquareOfDifference);
        assertThat("Incorrect Sum square difference of the first 100 natural numbers", sumSquareOfDifference , is(25164150L));
    }


}
