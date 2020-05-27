package TestNGPKG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNGnew {

    WebDriver driver;
    public String appurl , brName , envName , RelName;


    @Test
    public void testcase_1()

    {
        appurl = System.getProperty("AppUrlValue");
        brName = System.getProperty("BrowserName");
        envName = System.getProperty("EnvironmentName");
        RelName = System.getProperty("ReleaseName");

        System.out.println("Application URL Is:==>"+appurl);
        System.out.println("Browser Name Is:==>"+brName);
        System.out.println("Environment Name Is:==>"+envName);
        System.out.println("Release Name Is:==>"+RelName);

        System. setProperty("webdriver.chrome.driver", "/Users/mithunroy/Downloads/chromedriver2");
        driver = new ChromeDriver();
        driver.get(appurl);
        Assert.assertTrue(driver.findElement(By.id("hplogo")).isDisplayed());
        driver.quit();
        System.out.println("Google Application Closed Successfully");
    }

}
