package tests;

/***
 * @author Xavier Arque
 *
 * REQUIEREMENTS:
 *
 *
 * TEST CASE:
 *
 *
 * This Class will test the functionalities of the Processess page
 * It uses the config.property file to obtain the values needed
 *
 * Feature:
 *
 * In order to know ...
 *
 * Scenario: Test all links and icons
 * Given Open Driver
 * And Navigate to More Information Page
 * When I
 * And
 * And
 * Then
 *
 */


import org.testng.annotations.Test;
import utilities.BaseClass;

public class ProcessessTest extends BaseClass
{

    @Test(description = "This TC will check out all the buttons in the Processess Page")
    public void ProcessessPageTest()
    {
            System.out.println("===== Initialize Tests========");

        driver.get(configura.getApplicationUrl_Processess());

            System.out.println("===== Closed Tests========");
    }

}
