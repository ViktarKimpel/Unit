package com.epam.cdp;

import com.epam.tat.module4.Calculator;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class DivCalcTest {

    @Test
    public void ThreeDivThreeTest(){
        Calculator calc = new Calculator();
        long result = calc.div(3,3);
        Assert.assertEquals(result,1);
    }
}
