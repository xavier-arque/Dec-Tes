package proves_delete;

import org.testng.annotations.Test;
import pages.LoginPage_deprecated;
import utilities.BaseClass;

public class test2 extends BaseClass {

    LoginPage_deprecated login;

    @Test(description = "This TC will check out all the buttons and perform a valid login")
    public void loginPageTest()
    {
        System.out.println("===== Initialize Tests========");
        driver.get(configura.getApplicationUrl_Login());
        login = new LoginPage_deprecated(driver);
        login.loginPageDecidim(configura.getUser(), configura.getPassword());
        System.out.println("===== Closed Tests========");
    }

  /*  public static void main(String[] args)

    {
        ExcelReader excel = new ExcelReader("./Configuration/DecidimLoginData.xlsx");

        System.out.println(excel.getData("Full1",1,1));
    }*/
}
