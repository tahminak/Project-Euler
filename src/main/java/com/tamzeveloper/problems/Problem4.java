package com.tamzeveloper.problems;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 * Created by Tahmina Khan
 */
/*

        A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

            Find the largest palindrome made from the product of two 3-digit numbers.


 */

public class Problem4 {


    @Test(timeout=50)
    public void TestLargestPalindrom(){

         int largestPalindrom=largestPalindromNum(2);
         System.out.println("\nLargest palindrom of 2- digits = "+largestPalindrom);
         assertThat("Incorrect Largest Palindrom of 2-digit numbers",largestPalindrom, is(9009));


    }



    private int largestPalindromNum(int num) {




        return 0;
    }
}
