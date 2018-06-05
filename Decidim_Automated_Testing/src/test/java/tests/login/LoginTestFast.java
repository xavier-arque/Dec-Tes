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
 * This Class will test just the basic login in the page page
 * It uses the config.property file to obtain the values needed
 *
 * Feature: Test login/Sing In with correct credentials
 *
 * Scenario: Test basic login
 * Given Open Driver
 * And Navigate to LoginPage_deprecated
 * When I enter valid "username"
 * And valid "password"
 * And click on the login BUTTON
 * Then user should be able to login succesfully
 *
 * TEST CASE:
 * DEC-6: DEC-V1-TC-SIGN-IN-POSITIVE
 *
 */


import org.testng.annotations.Test;
import pages.LoginPage_v1;
import utilities.BaseClass;

public class LoginTestFast extends BaseClass
{

    LoginPage_v1 login;

    @Test(description = "This TC will perform a valid login")
    public void loginPageTest_Fast()
    {
            System.out.println("===== Initialize Tests========");
        driver.get(configura.getApplicationUrl_Login());
        login = new LoginPage_v1(driver);
        try {
            login.loginPageDecidim_Fast(configura.getUser(), configura.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("===== Closed Tests========");
    }

}
