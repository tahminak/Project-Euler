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

         int largestPalindrom=largestPalindromNum(3);
         System.out.println("\nLargest palindrom of 2- digits = "+largestPalindrom);
         assertThat("Incorrect Largest Palindrom of 2-digit numbers",largestPalindrom, is(9009));


    }



    private int largestPalindromNum(int num) {

        //9 or 99 or 999
        int largestNumberOfNum;

        String nDigitsStr="";

        for(int i=1;i<=num;i++){
            nDigitsStr+="9";
        }

        largestNumberOfNum=Integer.valueOf(nDigitsStr);

        for(int i=largestNumberOfNum*largestNumberOfNum;largestNumberOfNum>0;largestNumberOfNum--){

            if(isPalindrome(i+"")){
                return i;
            }
        }


        return largestNumberOfNum;
    }

    public boolean isPalindrome(String s) {
        int n = s.length();
        for (int i=0;i<(n / 2) + 1;++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
