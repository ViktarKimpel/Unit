package com.epam.cdp.tests;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;


public class BaseTest {


    protected Calculator calculator;

    @BeforeClass
    public void setUp (){
        calculator = new Calculator ();
    }

    @AfterTest
    public void tearDown(){
        calculator = null;
    }
}