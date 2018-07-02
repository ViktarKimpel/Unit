package com.epam.cdp;


import com.epam.tat.module4.Calculator;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SumCalcTest {

@Test
    public void OnePlusTwoTest(){
    Calculator calc = new Calculator();
long result = calc.sum(1,2);
Assert.assertEquals(result,3);
    }
}

