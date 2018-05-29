package pages;

/***
 * @author Xavier Arque
 *
 * This Class will store all the locators and methods for the Home page
 *
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.ConfigReader;

public class HomePage
{
    WebDriver driver;
    ConfigReader configura = new ConfigReader(); // instance the object with all the config data

    /**
     * Identify page locators
     */

    By registerButton = By.linkText(configura.getWebElement_Login("signUpButton"));


    // I do not use the config file for the xpaths
    By homePageUserName = By.xpath("//a[@href='/account']");
    By cookieWarning = By.xpath("//*[@class='cookie-warning']");
    By agreeCookieButton = By.xpath("//*[@class='cookie-warning__action']");

    /**
     * create methods for this page
     */

    public HomePage(WebDriver driver)
    {
        this.driver=driver;
    }

    public String getHomePageDashboardUserName()
    {
        String userHomepage= driver.findElement(homePageUserName).getText();
        // assert that the home address it's the correct address
            System.out.println("The Home Page URL address is : " + driver.getCurrentUrl());
        Assert.assertEquals(configura.getApplicationUrl_Home(), "http://staging.decidim.codegram.com/" );
        // get the user account
            System.out.println("And the user's name in the Home Page is : " + userHomepage);
        return driver.findElement(homePageUserName).getText();
    }

    public void clickButtonSignUp() {
        try {
            driver.findElement(registerButton).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error message while going to sing Up page after click: " + e.getMessage());
        }
    }

    public void clickagreeCookieButton()
    {
        try {
            driver.findElement(agreeCookieButton).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error message while going to confirmation instructions page after click: " + e.getMessage());
        }
    }
    /**
     *
     * Create an action that uses locators and methods
     *
     */

    public void homePageDecidim(String user, String password)
    {
        String actualTitle = driver.getTitle(); // get the actual value of the title and print it
            System.out.println("the page-title is : " + actualTitle );
        System.out.println("The Flash message says: " + driver.findElement(cookieWarning).getText());

        clickagreeCookieButton();
            System.out.println("after login the actual page-title is: " + driver.getTitle());// get the actual value of the title and print it to check out that you are out
    }
}
