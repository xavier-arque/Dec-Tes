package utilities;

/***
 * @author Xavier Arque
 *
 *
 * This is the Base class for all the Tests. So far is adjusted only for chrome and firefox drivers
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.io.File;

public class BaseClass
{
    public WebDriver driver;
    public ConfigReader configura;

    @BeforeClass
    public void setUp()
    {
        configura = new ConfigReader();
            System.setProperty("webdriver.chrome.driver", configura.getChromePath());
        driver = new ChromeDriver();
        //  System.setProperty("webdriver.gecko.driver", configura.getFirefoxPath());
        // driver = new FirefoxDriver();
            System.out.println("===== Finish SettingUp========");
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
            System.out.println("that's all folks!");
    }
}
