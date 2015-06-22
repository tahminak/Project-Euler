package com.tamzeveloper.problems;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by tahmina on 15-05-30.
 */

/*

  The prime factors of 13195 are 5, 7, 13 and 29.

  What is the largest prime factor of the number 600851475143 ?

 */
public class Problem3 {

    /*
    Generating a List of Primes: The Sieve of Eratosthenes

    The Sieve of Eratosthenes is a highly efficient way to generate a list of primes. It works by
    recognizing that all non-prime numbers are divisible by a prime number.
    We start with a list of all the numbers up through some value max. First, we cross off
    all numbers divisible by 2. Then, we look for the next prime (the next non-crossed off
    number) and cross off all numbers divisible by it. By crossing off all numbers divisible
    by 2,3, 5,7,11, and so on, we wind up with a list of prime numbers from 2 through max.

     */



    public int getLargestPrimeFactor2(long num){

        List<Integer> listOfPrimes=new ArrayList<>();


        List<Boolean> flags=sieveOfEratosthenes(num);


       for(int i=3;i<flags.size();i++){
           if(flags.get(i) && num%i==0){

               listOfPrimes.add(i);

           }
       }




        return Collections.max(listOfPrimes);
    }

    private List<Boolean> sieveOfEratosthenes(long max) {

        List<Boolean> flags=new ArrayList<>();

     //   boolean[] flags = new boolean[max+1];
         int count = 0;

        // Set all flags to true other than 0 and 1

        flags.add(false);
        flags.add(false);
        for(int i=2;i<=max;i++){
            flags.add(true);
        }


        int prime = 2;

        while (
                prime <= Math.sqrt(max)) {
          /* Cross off remaining multiples of prime */
            crossOff(flags, prime);

           /* Find next value which is true */
          prime = getNextPrime(flags, prime);

           if (prime >= flags.size()) {
               break;
               }
            }

       return flags;


    }


    void crossOff(List<Boolean> flags, int prime) {
        /* Cross off remaining multiples of prime. We can start with
        * (prime*prime), because if we have a k * prime, where
        26 * k < prime, this value would have already been crossed off in
        27 * a prior iteration. */
        for (int i = prime * prime; i < flags.size(); i += prime) {
            flags.set(i,false);
           }
       }



    int getNextPrime(List<Boolean> flags, int prime) {
        int next = prime + 1;
        while (next < flags.size() && !(flags.get(next))) {
           next++;
        }
        return next;
       }

    public  int getLargestPrimeFactor(long num){
        List<Integer> primes=new ArrayList<>();
        for (int i=2;i<=num;i++){

            if(isPrime(i) && num %i==0){
                primes.add(i);
            }

        }

        //System.out.println(primes.toString());

        System.out.println(primes.toString());

        return Collections.max(primes);
    }


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

    private int getLargest(){

        return 0;
    }


    public long largestPrimeFactor(long product) {
        long[] factors = factors(product);
        return factors[factors.length-1];
    }

    private long[] factors(long longNumber) {
        long[] factors = new long[100];
        int freePosition = 0, candidateFactor;
        long product = longNumber;

        // Find all the factors of 2.
        while (product % 2 == 0) {
            factors[freePosition] = 2;
            freePosition += 1;
            product /= 2;
        }

        candidateFactor = 3;
        int largestPossibleFactor = (int) Math.sqrt(product) + 1;
        while ( candidateFactor <= largestPossibleFactor ) {
            if (product % candidateFactor == 0) {
                factors[freePosition++] = candidateFactor;
                product = removeFactorFromProduct(candidateFactor, product);
            } else {
                candidateFactor += 2;
            }
        }

        // Do not include 1 as a factor.  This happens with prime numbers
        // like 13 that only have 1 factor. So 13/13 leaves a 1 in num.
        if (product > 1) {
            factors[freePosition++] = product;
        }

        long[] trimmedCopy = Arrays.copyOf(factors, freePosition);
        return trimmedCopy;
    }

    private long removeFactorFromProduct(int candidateFactor, long product) {
        product /= candidateFactor;
        return product;
    }


    @Test(timeout=50)
    public void TestgetLargestPrimeFactorOf_13195(){

        int largestPrimeFactorOf_13195=getLargestPrimeFactor(13195);

        //System.out.println("\nSum of fibonnachi = "+largestPrimeFactorOf_13195);

        assertThat("Incorrect largest prime factor of  13195", largestPrimeFactorOf_13195, is(29));

    }

    @Test(timeout=50)
    public void TestgetLargestPrimeFactor2Of_13195(){

        int largestPrimeFactorOf_13195=getLargestPrimeFactor2(13195);

        System.out.println("\nLargest prime factor of "+largestPrimeFactorOf_13195);

        assertThat("Incorrect largest prime factor of  13195", largestPrimeFactorOf_13195, is(29));

    }

    @Test(timeout=50)
    public void TestlargestPrimeFactorOf_600851475143(){

        long largestPrimeFactorOf_600851475143=largestPrimeFactor(600851475143L);
        System.out.println("\nLargest prime factor of 600851475143l :"+largestPrimeFactorOf_600851475143);
        assertNotEquals("Incorrect largest prime factor of  600851475143L", largestPrimeFactorOf_600851475143, 0);
        assertThat("Incorrect largest prime factor of  600851475143L",largestPrimeFactorOf_600851475143,is(6857L));


    }

    @Test(timeout=2000)
      public void TestgetLargestPrimeFactor2Of_600851475143(){

     //   int largestPrimeFactorOf_600851475143=getLargestPrimeFactor2(600851);
       // System.out.println("\nLargest prime factor of "+largestPrimeFactorOf_600851475143);
        //
    // System.out.println("Largest prime factor of 600851475143L : "+largestPrimeFactorOf_600851475143);
//
//        assertNotEquals("Incorrect largest prime factor of  600851475143L", largestPrimeFactorOf_600851475143, 0);



    }


}
