package com.epam.cdp.listeners;

import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {

    public void onTestStart(ITestResult result) {
        System.out.println("on Test Start: " + result.getName() );
    }
    public void onTestSuccess(ITestResult result) {
        System.out.println("on Test Success: " + result.getName() );
    }
    public void onTestFailure(ITestResult result) {
    }
    public void onTestSkipped(ITestResult result) {
    }
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }
    public void onStart(ITestContext result) {
    }
    public void onFinish(ITestContext result) {
    }
}
