package pages;

/***
 * @author Xavier Arque
 *
 *
 * This Class will store all the locators and methods for the More Information page
 *
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.ConfigReader;

public class MoreInformationPage
{
    WebDriver driver;
    ConfigReader configura = new ConfigReader(); // instance the object with all the config data

    /**
     * Identify page locators
     */


    // I do not use the config file for the xpaths


    /**
     * create methods for this page
     */

    public MoreInformationPage(WebDriver driver)
    {
        this.driver=driver;
    }


}
