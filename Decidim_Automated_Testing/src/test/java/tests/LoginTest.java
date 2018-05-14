package tests;

/***
 * @author Xavier Arque
 *
 *
 * This Class will test all the functionalities of the login page
 * It uses the config.property file to obtain the values needed
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
