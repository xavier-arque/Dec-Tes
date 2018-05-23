package tests;

/***
 * @author Xavier Arque
 *
 * A class to launch a data driven login test
 * This Class will test the main functionalities of the login page
 * It uses the config.property file to obtain the values needed and
 * an excel file to load all the users.
 *
 *It uses a short login method instead of the normal one.
 */


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.BaseClass;
import utilities.ExcelReader;

import java.util.concurrent.TimeUnit;

public class DataDrivenLoginTest extends BaseClass
{
    LoginPage login;

    @Test(dataProvider="decidimData")
    public void DataDrivenloginPageTest(String username, String password)
    {
            System.out.println("===== Initialize Tests========");

        driver.get(configura.getApplicationUrl_Login());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        login = new LoginPage(driver);

        login.loginPageDecidimShort(username, password);

        driver.close(); // we close it to load a fresh new one for a different user

            System.out.println("===== Close Tests========");

        driver = new ChromeDriver();
        //driver = new FirefoxDriver();

            System.out.println("===== New Driver Created ========");
    }


    // function to load all the users and paswords

    @DataProvider(name="decidimData")
    public Object[][] passData()
    {
        //ExcelReader excelData = new ExcelReader("./Configuration/DecidimLoginData.xlsx");
        ExcelReader excelData = new ExcelReader(configura.getExcelPath());

        int rows = excelData.getRowCount(configura.getDecidimLoginsExcelSheet());

        Object[][] data = new  Object[rows][2];

        for(int i=1; i<rows;i++)
        {
            data[i][0]= excelData.getData(configura.getDecidimLoginsExcelSheet(), i,0);
            data[i][1]= excelData.getData(configura.getDecidimLoginsExcelSheet(), i,1);
        }


        return data;
    }


    @DataProvider(name="decidimDataSmall")
    public Object[][] passDataSmall()
    {
        Object[][] data = new  Object[3][2];

        data[0][0]= "admin@example.org";
        data[0][1]= "decidim123456";
        data[1][0]= "user@example.org";
        data[1][1]= "decidim";
        data[2][0]= "admin@example.org";
        data[2][1]= "decidim123456";


        return data;
    }

}
