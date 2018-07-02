package com.epam.cdp.tests;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MinCalcTest extends BaseTest {

    @Test
    public void twoMinusOneTest(){
        long result = calculator.sub(2,1);
        Assert.assertTrue(result==1);
    }

}


