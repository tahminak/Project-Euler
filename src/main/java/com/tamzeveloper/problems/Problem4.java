package com.tamzeveloper.problems;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Tahmina Khan
 */
/*      A palindromic number reads the same both ways.
        The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
        Find the largest palindrome made from the product of two 3-digit numbers.

 */

public class Problem4 {


    @Test(timeout=80)
    public void TestLargestPalindromOf_3Digits(){

         int largestPalindrom=largestPalindromNum(3);
         System.out.println("\nLargest palindrom of 2- digits = "+largestPalindrom);
         assertThat("Incorrect Largest Palindrom of 2-digit numbers",largestPalindrom, is(906609));


    }

    @Test(timeout=80)
    public void TestLargestPalindromOf_2Digits(){

        int largestPalindrom=largestPalindromNum(2);
        System.out.println("\nLargest palindrom of 2- digits = "+largestPalindrom);
        assertThat("Incorrect Largest Palindrom of 2-digit numbers",largestPalindrom, is(9009));


    }


    @Test(timeout=50)
    public void TestIsPalindrom(){


        assertTrue("Incorrect Palindrom number", isPalindrome(9009 + ""));

        assertFalse("Incorrect Palindrom number", isPalindrome(9109 + ""));

    }


    private int largestPalindromNum(int num) {

        //9 or 99 or 999
        int largestNumberOfNum;

        // 1 or 10 or 100
        int smalledNumOfNum;

        String nDigitsStr="";

        for(int i=1;i<=num;i++){
            nDigitsStr+="9";
        }

      largestNumberOfNum=Integer.valueOf(nDigitsStr);

       //create smallest number
       nDigitsStr="1";

       for(int i=1;i<num;i++){
           nDigitsStr+="0";
       }

      smalledNumOfNum=Integer.valueOf(nDigitsStr);

      //System.out.println(largestNumberOfNum+" "+smalledNumOfNum);

        int x, y, product, max = 0;

        for (x = smalledNumOfNum; x <= largestNumberOfNum; x++) {
            for (y = x; y <= largestNumberOfNum; y++) {
                product = x * y;
                if (isPalindrome(Integer.toString(product))) {
                    if( max < product ) { // this is new
                        max = product;

                    }
                }
            }
        }


        return max;
    }

    public boolean isPalindrome(String str) {


        StringBuilder reverese=new StringBuilder(str).reverse();

        //Reverse of a palindrom string is equal to the originial one
        return str.equals(reverese.toString());
    }
}
