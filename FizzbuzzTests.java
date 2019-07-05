package com.spartaglobal.challenge3Tests;


import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class FizzbuzzTests {



    @Test
    public void divisibleByTest(){
        Assert.assertTrue(fizzBuzz.divisibleBy(2,1));
        Assert.assertFalse(fizzBuzz.divisibleBy(3,2));
    }



    @Test
    public void fizzBuzzIteratorTest(){
        List<String> minFizzBuzzList = List.of("1","2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
        Assert.assertEquals(minFizzBuzzList, fizzBuzz.getFizzBuzzList());
    }
}
