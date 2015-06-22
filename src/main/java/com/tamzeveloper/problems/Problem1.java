package com.tamzeveloper.problems;

import org.junit.Assert;
import org.junit.Test;



import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by tahmina on 15-05-29.
 */
public class Problem1 {

/*
Problem 1

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.

 */


    public  int getSumOfMultiples3and5(int num){


        int sum=0;


        for (int i=1;i<num;i++){
            if(i%3==0||i%5==0){
                sum+=i;
            }

        }



        return sum;
    }


    @Test(timeout=50)
    public void TestSumOfMultiples3and5(){

        int sumOfMultiples = getSumOfMultiples3and5(1_000);

        System.out.println(getSumOfMultiples3and5(1000));
        Assert.assertEquals("Incorrect sum of multiples of 3 or 5 below 1,000", 233168, getSumOfMultiples3and5(1000));

        assertThat("Incorrect sum of multiples of 3 or 5 below 1,000",sumOfMultiples, is(233168));
        Assert.assertEquals( "Incorrect sum of multiples of 3 or 5 below 10,000",23331668, getSumOfMultiples3and5(10000));


    }
}
