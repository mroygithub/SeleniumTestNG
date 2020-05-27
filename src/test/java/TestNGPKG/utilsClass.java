package TestNGPKG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class utilsClass {

    public static WebDriver driver = null;


    public WebDriver setupDriver()
    {
        System. setProperty("webdriver.chrome.driver", "/Users/mithunroy/Downloads/chromedriver2");
        driver = new ChromeDriver();
        return driver;
    }
}
