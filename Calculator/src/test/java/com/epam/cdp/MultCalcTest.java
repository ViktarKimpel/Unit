package com.epam.cdp;

import com.epam.tat.module4.Calculator;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MultCalcTest {

    @Test
    public void ThreeMultThreeTest(){
        Calculator calc = new Calculator();
        long result = calc.mult(3,3);
        Assert.assertEquals(result,9);
    }
}