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
import pages.LoginPage_v1;
import utilities.BaseClass;

public class LoginTest_old extends BaseClass
{

    LoginPage_v1 login;

    @Test(description = "This TC will check out all the buttons and perform a valid login")
    public void loginPageTest() throws Exception
    {
            System.out.println("===== Initialize Tests========");
        driver.get(configura.getApplicationUrl_Login());
        login = new LoginPage_v1(driver);
        login.loginPageDecidim(configura.getUser(), configura.getPassword());
        Thread.sleep(1000);
            System.out.println("===== Closed Tests========");
    }

}
