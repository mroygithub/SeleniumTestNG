package listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.io.File;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import java.io.IOException;
import org.apache.commons.io.*;
import org.testng.ITestContext;
import TestNGPKG.utilsClass;

import org.openqa.selenium.OutputType;




public class ItestListeners extends utilsClass implements ITestListener {


    public static String filePath = "/Users/mithunroy/Downloads/delete/";


    public void onTestStart(ITestResult testresult) {

        System.out.println("Test Started" +"  " +testresult.getName());

    }

    public void onTestSuccess(ITestResult testresult) {

        System.out.println("Test Success"+"  " +testresult.getName());

    }

    public void onTestFailure(ITestResult testresult) {

        System.out.println("Test Failed"+"  " +testresult.getName());
        // This is very important as test got failed ....
        // Write Code to capture Selenium WebDriver Screenshot
        // Take screenshot and store as a file format

        ITestContext context = testresult.getTestContext();
        captureScreenshot(testresult.getName());


    }

    public void captureScreenshot(String testName) {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //The below method will save the screen shot in d drive with test method name
        try {
            FileUtils.copyFile(scrFile, new File(filePath+testName+".png"));
            System.out.println("Screenshot is Saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onTestSkipped(ITestResult testresult) {

        System.out.println("Test Skipped"+"  " +testresult.getName());
        // This is very important as test got failed ....
        // Write Code to capture Selenium WebDriver Screenshot

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult testresult) {

        System.out.println("Test Failed but within success percentage"+"  " +testresult.getName());

    }

    public void onStart(ITestContext testcontext) {


        System.out.println("This is onStart method"+"  " +testcontext.getOutputDirectory());

    }

    public void onFinish(ITestContext testcontext) {

        System.out.println("This is onFinish method"+"  " +testcontext.getPassedTests());
        System.out.println("This is onFinish method"+"  " +testcontext.getFailedTests());
    }



}
