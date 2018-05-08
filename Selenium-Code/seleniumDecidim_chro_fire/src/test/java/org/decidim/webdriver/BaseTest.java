package org.decidim.webdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by xavier arque on 18/04/18.
 * Base Test for all Decidim tests
 */

public class BaseTest {
    public RemoteWebDriver driver;
    public WebDriverWait wait;
    public Actions act;

    @BeforeMethod
    public void setUp ()throws IOException
    {
        //System.setProperty("webdriver.gecko.driver", "src" + File.separator + "main" + File.separator + "resources" + File.separator + "geckodriver-macos");
        //driver = new FirefoxDriver();

       System.setProperty("webdriver.chrome.driver", "src" + File.separator + "main" + File.separator + "resources" + File.separator + "chromedriver-macos");
       driver = new ChromeDriver();
       act = new Actions(driver);
       wait = new WebDriverWait(driver, 10);
    }

    @AfterMethod
    public void tearDown()
    {
        driver.manage().deleteAllCookies();
        driver.quit();
        System.out.println("s'acabo bien!");
    }

}
