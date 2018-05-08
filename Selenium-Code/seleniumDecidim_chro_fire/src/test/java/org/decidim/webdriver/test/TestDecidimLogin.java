package org.decidim.webdriver.test;

import org.decidim.webdriver.BaseTest;
import org.decidim.webdriver.pages.DecidimHomeUser;
import org.decidim.webdriver.pages.DecidimLogin;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * Created by xavier arque on 18/04/18.
 * This test checks that a user can sign in and the site recognise her
 */

public class TestDecidimLogin extends BaseTest{

    private String admin = "admin@example.org";
    private String user = "user@example.org";
    private String pass = "decidim123456";
    private String baseUrl = "http://staging.decidim.codegram.com/";
    private String new_user = "jeremy"; // as admin: Grant Cruickshank - as user: Jeremy Reinger
   // private String signed_succesfully = "signed succesfully";

    @Test
    public void test_Home_Page_Appear_Correct()throws InterruptedException{
        driver.navigate().to(baseUrl);

             //Create instance Login Page class
        DecidimLogin objLogin = new DecidimLogin(driver);

            //Access the sign in page and verify the page
        objLogin.signInToDecidim();
        String loginPageTitle = objLogin.getLoginTitle();
        Assert.assertTrue(loginPageTitle.toLowerCase().contains("log"));

            //login to application with user and password
        objLogin.enterName(user);
        objLogin.enterPass(pass);

            // click check mark and login button
        objLogin.clickButtonLogin();

            // go back to home page
        Thread.sleep(1000);
        DecidimHomeUser objHomePage = new DecidimHomeUser(driver);

            //Verify home page has the new user
        Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains(new_user));

    }

}
