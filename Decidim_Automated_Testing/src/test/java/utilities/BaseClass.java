package utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


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

        //System.setProperty("webdriver.gecko.driver", configura.getFirefoxPath());
        //driver = new FirefoxDriver();

            System.out.println("===== Finish SetUp========");
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
            System.out.println("that's all folks!");
    }
}
