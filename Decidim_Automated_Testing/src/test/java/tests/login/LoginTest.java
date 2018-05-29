package tests.login;

/***
 * @author Xavier Arque
 * DATE: 10-V-2018
 *
 * REQUIEREMENTS:
 * PARTIC-1-REG : Registration, verification and Navigate
 *  GENER-1-SII : Sign in
 *
 * SUMMARY:
 * This Class will test all the functionalities of the login page
 * It uses the config.property file to obtain the values needed
 *
 * Feature: Test login/Sing In with correct credentials
 *
 * Scenario: Test all links, check marks and icons
 * Given Open Driver
 * And Navigate to LoginPage
 * When I enter valid "username"
 * And valid "password"
 * And the Remember me check marck BUTTON works correctly
 * And click on the login BUTTON
 * Then user should be able to login succesfully
 *
 * Plus. Check the links to: Crete an account, Sign up, Forgot your password, did't receive confirmation instructions
 *
 *
 *
 * TEST CASES:
 * DEC-6: DEC-V1-TC-SIGN-IN-POSITIVE
 * DEC-13:DEC-V1-TC-SIGN-IN-OTHER
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
