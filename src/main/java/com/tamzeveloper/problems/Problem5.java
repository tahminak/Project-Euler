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
    public void TestSmallestDivisible1_10(){

        int smallesDivisibleNum=smallestDivisible(10);


        System.out.println("\nSmallest number divisible by 1 to 10 : "+smallesDivisibleNum);
        assertThat("Incorrect Smallest number divisible by 1 to 10", smallesDivisibleNum , is(2520));
    }

    @Test(timeout=50)
    public void TestSmallestDivisible1_20(){

        int smallesDivisibleNum=smallestDivisible(20);


        System.out.println("\nSmallest number divisible by 1 to 20 : "+smallesDivisibleNum);
        assertThat("Incorrect Smallest number divisible by 1 to 20", smallesDivisibleNum , is(232792560));
    }

    //LCM(a,b,c,d) = LCM(LCM(LCM(a,b),c),d).
    private int smallestDivisible(int num) {
    int smallesDivisible=1;
        for(int i=1;i<num-1;i++){

            smallesDivisible=lcm(smallesDivisible,i+1);

        }


        return smallesDivisible;

    }



    public int gcd(int a,int b){

        if(b==0)
            return a;
        else
            return gcd(b,a%b);


    }


    /*

      Find LCM by GCD

      LCM(a,b) = (a*b)/GCD(a,b).

     */
    public int lcm(int a,int b){

        return (a*b)/gcd(a,b);

    }


    @Test(timeout=50)
    public void TestGCD(){

        int gcd=gcd(54,24);


       // System.out.println("\nGCD of (54,24) : "+gcd);
        assertThat("Incorrect GCD of (54,24)",gcd , is(6));
        assertThat("Incorrect GCD of (8,12)",gcd(8,12) , is(4));
    }

    @Test(timeout=50)
    public void TestLCM(){

        int lcm=lcm(6, 10);


        // System.out.println("\nGCD of (54,24) : "+gcd);
        assertThat("Incorrect LCM of (6,10)",lcm , is(30));
        assertThat("Incorrect LCM of (12,30)",lcm(12,30) , is(60));
        assertThat("Incorrect LCM of (1,2)",lcm(1,2) , is(2));
    }
}
