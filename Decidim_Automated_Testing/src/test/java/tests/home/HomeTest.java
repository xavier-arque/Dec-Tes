package tests.home;

/***
 * @author Xavier Arque
 *
 *
 * This Class will test all the functionalities of the home page
 * It uses the config.property file to obtain the values needed
 *
 */


import org.testng.annotations.Test;
import pages.HomePage;
import utilities.BaseClass;

public class HomeTest extends BaseClass
{

    HomePage home;

    @Test(description = "This TC will check out all the buttons and elements from the Home Page")
    public void homePageTest()
    {
            System.out.println("===== Initialize Tests========");
        driver.get(configura.getApplicationUrl_Home());
        home = new HomePage(driver);
       // home.loginPageDecidim(configura.getUser(), configura.getPassword());
            System.out.println("===== Closed Tests========");
    }

}
