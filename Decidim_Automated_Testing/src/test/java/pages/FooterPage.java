package pages;

/***
 * @author Xavier Arque
 *
 *
 * This Class will store all the locators and methods for the Footer Area of all the pages
 *
 */

import org.openqa.selenium.WebDriver;
import utilities.ConfigReader;

public class FooterPage
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

    public FooterPage(WebDriver driver)
    {
        this.driver=driver;
    }


}
