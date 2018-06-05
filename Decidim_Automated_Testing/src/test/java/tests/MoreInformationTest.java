package tests;

/***
 * @author Xavier Arque
 * DATE:
 *
 * REQUIEREMENTS:
 *PARTIC-1-REG : Registration, verification and Navigate
 *

 *
 * This Class will test the functionalities of the More Information page
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
 * TEST CASE:
 * DEC-21:DEC-V1-TC-MORE-INFORMATION-PAGE
 *
 */


import org.testng.annotations.Test;
import utilities.BaseClass;

public class MoreInformationTest extends BaseClass
{

    @Test(description = "This TC will check out all the buttons in the More Information Page")
    public void MoreInformationPageTest()
    {
            System.out.println("===== Initialize Tests========");

        driver.get(configura.getApplicationUrl_MoreInformation());

            System.out.println("===== Closed Tests========");
    }

}
