package tests.account.notifications;

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
import pages.LoginPage;
import utilities.BaseClass;

public class NotificationsTest extends BaseClass
{

    LoginPage login;

    @Test(description = "This TC will ")
    public void conversations()
    {
            System.out.println("===== Initialize Tests========");
        driver.get(configura.getApplicationUrl_Login());
        login = new LoginPage(driver);
            System.out.println("===== Closed Tests========");
    }

}
