package com.tamzeveloper.problems;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Tahmina Khan
 */
/*

  Smallest multiple
Problem 5
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?



 */
public class Problem5 {



    @Test(timeout=50)
    public void TestSumOfSquareDifference_10(){
        // System.out.println("Incorrect Sum square difference of the first ten natural numbers  ");
        assertThat("Incorrect Smallest number divisible by 1 to 10", smallestDivisible(10) , is(2520));
    }

    private int smallestDivisible(int i) {
        return 0;
    }
}
