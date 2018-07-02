package com.epam.cdp.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class MultCalcTest extends BaseTest {

    @Test(dataProvider = "valuesForTest")
    public void twoMultTwoTest(long a, long b, long expectedValue){
        long result = calculator.mult(a,b);
            Assert.assertEquals(result, expectedValue, "Invalid result of multiple operation!");
    }
        @DataProvider(name = "valuesForTest")
        public Object [][] valuesForMult(){
            return new Object [][]{
                    {10,2,20},
                    {10,-1,-10},
                    {0,0,0},
                    {-1,-5,5}
            };
        }
}