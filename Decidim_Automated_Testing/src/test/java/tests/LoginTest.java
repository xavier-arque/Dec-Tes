package tests;

/***
 * @author Xavier Arque
 *
 * REQUIEREMENTS:
 * PARTIC-1-REG : Registration, verification and Navigate
 *  GENER-1-SII : Sign in
 *
 * TEST CASE:
 * DEC-6: DEC-V1-TC-SIGN-IN-POSITIVE
 *
 * This Class will test all the functionalities of the login page
 * It uses the config.property file to obtain the values needed
 *
 * Feature: Test login/Sing In with correct credentials
 *
 * In order to know ...
 *
 * Scenario: Test all links and icons
 * Given Open Driver
 * And Navigate to Login Page
 * When I enter valid username
 * And valid password
 * And click on the login Button
 * Then user should be able to login succesfully
 *
 */


import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.BaseClass;

public class LoginTest extends BaseClass
{

    LoginPage login;

    @Test(description = "This TC will check out all the buttons and perform a valid login")
    public void loginPageTest()
    {
            System.out.println("===== Initialize Tests========");
        driver.get(configura.getApplicationUrl_Login());
        login = new LoginPage(driver);
        login.loginPageDecidim(configura.getUser(), configura.getPassword());
            System.out.println("===== Closed Tests========");
    }

}
