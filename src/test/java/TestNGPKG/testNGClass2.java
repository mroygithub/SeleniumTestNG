package TestNGPKG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestNGListener;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import listeners.ItestListeners;
import TestNGPKG.utilsClass;


public class testNGClass2 extends  utilsClass{

    private  WebDriver driver;

    @BeforeSuite
    public void launchapplication()
    {
        driver = setupDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    }


    @Test
    public void sign()
    {
        Assert.assertTrue(driver.findElement(By.id("hplogo")).isDisplayed());
    }

    @Test
    public void test()
    {
        Assert.assertTrue(driver.findElement(By.id("hplogo1")).isDisplayed());
        driver.quit();
    }

    @AfterSuite
    public void closeApplication()
    {
        driver.quit();
    }

}



