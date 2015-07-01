package com.tamzeveloper.problems;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Tahmina Khan
 */

/*

  By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

  What is the 10 001st prime number?


 */
public class Problem7 {


    public boolean isPrime(int num){

        if(num==2)
            return true;

        int i=2;
        int sqrtNum= (int) Math.sqrt(num);
        // System.out.println("The sqrt is : "+sqrtNum +" Num is :"+num);
        while(i<=sqrtNum){
            if(num%i==0) {
                return false;
            }
            i++;
        }

        return true;

    }


     public int nThPrime_1(int n){

         List<Integer> nLsit=new ArrayList<>();

          nLsit.add(2);

         int i=3;

         while(nLsit.size()<=n){

             if(isPrime(i)){
                 nLsit.add(i);
             }

             //Check the odd numbers only
            i=i+2;
         }

        // System.out.println(nLsit.toString());

         // get the nth prime
         return nLsit.get(n-1);
     }

    @Test(timeout=50)
    public void Test6thPrime(){
        int _6_thPrime=nThPrime_1(6);
       assertThat("Incorrect 6Th Prime number", _6_thPrime, is(13));

    }

    @Test(timeout=50)
    public void Test10001thPrime(){
        int _10001_thPrime=nThPrime_1(10001);
        assertThat("Incorrect 10001Th Prime number", _10001_thPrime, is(104743));

    }
}
