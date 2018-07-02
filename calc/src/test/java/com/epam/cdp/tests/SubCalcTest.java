package com.epam.cdp.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SubCalcTest extends BaseTest {


    @Test(dataProvider = "valuesForTest")
    public void TwoMinOneTest(long a, long b, long expectedValue) {
        long result = calculator.sub(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid result of sum operation!");
    }
    @DataProvider(name = "valuesForTest")
    public Object [][] valuesForSub(){
        return new Object [][]{
                {20,10,10},
                {10,-30,40},
                {0,0,0},
                {-10,25,-35}
        };
    }
}


