package proves_delete;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage_deprecated;
import utilities.BaseClass;
import utilities.ToolsBox;

import java.io.IOException;

public class test2 extends BaseClass {

  //  LoginPage_deprecated login;

   /* @Test(description = "This TC will check out all the buttons and perform a valid login")
    public void loginPageTest()
    {
        System.out.println("===== Initialize Tests========");
        driver.get(configura.getApplicationUrl_Login());
        login = new LoginPage_deprecated(driver);
        login.loginPageDecidim(configura.getUser(), configura.getPassword());
        System.out.println("===== Closed Tests========");
    }*/

      @Test(dataProvider="decidimDataSmall")
      public void Testlinks(String Path)
      {
            ToolsBox links2 = new ToolsBox(driver);
            links2.BrokenLinks(Path);
                System.out.println(Path);

       }

    // add more pages as requiered

    @DataProvider(name="decidimDataSmall")
    public Object[] passDataSmall()
    {
        Object[] data = new  Object[4];

        data[0]= configura.getApplicationUrl_Home();
        data[1]= configura.getApplicationUrl_Processess();
        data[2]= configura.getApplicationUrl_MoreInformation();
        data[3]= configura.getApplicationUrl_Assemblies();
        return data;
    }


       /*
          @Test
          public void TestImages() throws IOException
          {
              ToolsBox links2 = new ToolsBox(driver);
              links2.allImagesLoaded();
          }
*/
}
