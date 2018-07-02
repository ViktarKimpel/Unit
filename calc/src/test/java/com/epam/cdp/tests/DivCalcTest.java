package com.epam.cdp.tests;


import org.testng.annotations.Test;


public class DivCalcTest extends BaseTest {

    @Test(expectedExceptions = {NumberFormatException.class})
    public void threeDivZeroTest(){
        long result = calculator.div(3,0);
        System.out.println("Error with dividing on 0");

    }

}