package org.decidim.webdriver.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 *
 * Created by xavier arque on 18/04/18.
 * This class checks out that the current home page is the user home page an not the default one
 */

public class DecidimHomeUser {

    WebDriver driver;
    By homePageUserName = By.xpath("//a[@href='/account']");
    String Decidim_URL = "http://staging.decidim.codegram.com/";

public DecidimHomeUser(WebDriver driver){
    this.driver = driver;
}

        //Get the User name from Home Page
    public String getHomePageDashboardUserName()
    {
        String userHomepage= driver.findElement(homePageUserName).getText();
        String URL = driver.getCurrentUrl();
            // assert that the home address it's the correct address
        System.out.println("The Home Page URL address is : " + URL);
        Assert.assertEquals(URL, Decidim_URL );
            // get the user account
        System.out.println("And the user's name in the Home Page is : " + userHomepage);

        return driver.findElement(homePageUserName).getText();
    }
}
