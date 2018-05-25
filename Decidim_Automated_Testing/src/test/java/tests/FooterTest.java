package tests;

/***
 * @author Xavier Arque
 *
 * REQUIEREMENTS:
 * PARTIC-1-REG : Registration, verification and Navigate
 *
 * TEST CASE:
 * DEC-V1-TC-FOOTER-MENU
 *
 * This Class will test all the functionalities of the login page
 * It uses the config.property file to obtain the values needed
 *
 * Feature: Test how the footer works
 *
 * In order to know what links the footer has
 * I want it to behave in an expected way
 *
 * Scenario: Test all links and icons
 * Given Open Driver
 * And Navigate to Decidim Home Page
 * When I click on the links and icons
 * Then new window should open and user will be redirected to this new page
 *
 */


import org.testng.annotations.Test;
import pages.FooterPage;
import pages.HomePage;
import utilities.BaseClass;

public class FooterTest extends BaseClass
{

    FooterPage footer;

    @Test(description = "This TC will check out all the links and icons")
    public void FooterTest()
    {
            System.out.println("===== Initialize Tests========");

            driver.get(configura.getApplicationUrl_Home());

            //  home = new HomePage(driver);

            System.out.println("===== Closed Tests========");
    }

}