package tests.account.my_account;

/***
 * @author Xavier Arque
 * DATE: 29-V-2018
 *
 * REQUIEREMENTS:
 *
 *
 *
 * SUMMARY:
 * This Class will test
 * It uses the config.property file to obtain the values needed
 *
 * Feature: Test login/Sing In with correct credentials
 *
 * Scenario: Test
 * Given Open Driver
 * And Navigate to
 * When I
 * And
 * And
 * Then user should be able to
 *
 * TEST CASE:
 *
 *
 */


import org.testng.annotations.Test;
import pages.LoginPage_deprecated;
import utilities.BaseClass;

public class MyAccountTest extends BaseClass
{

    LoginPage_deprecated login;

    @Test(description = "This TC will ")
    public void loginPageTest_Fast()
    {
            System.out.println("===== Initialize Tests========");
        driver.get(configura.getApplicationUrl_Login());
        login = new LoginPage_deprecated(driver);
            System.out.println("===== Closed Tests========");
    }

}
