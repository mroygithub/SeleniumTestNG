package TestNGPKG;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import java.util.concurrent.TimeUnit;

public class testNGClass1 {




    @Test
    public void testcase_1()
    {
        System.out.println(Thread.currentThread().getId());
        System. setProperty("webdriver.chrome.driver", "/Users/mithunroy/Downloads/chromedriver2");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.quit();
    }

    @Test
    public void testcase_2()
    {
        System.out.println(Thread.currentThread().getId());
        System. setProperty("webdriver.chrome.driver", "/Users/mithunroy/Downloads/chromedriver2");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.quit();
    }

    @Test
    public void testcase_3()
    {
        System.out.println(Thread.currentThread().getId());
        System. setProperty("webdriver.chrome.driver", "/Users/mithunroy/Downloads/chromedriver2");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.twitter.com");
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.quit();
    }

    @Test
    public void testcase_4()
    {
        System.out.println(Thread.currentThread().getId());
        System. setProperty("webdriver.chrome.driver", "/Users/mithunroy/Downloads/chromedriver2");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.zomato.com");
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.quit();
    }
}



