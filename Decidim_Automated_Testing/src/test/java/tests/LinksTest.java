package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.BaseClass;
import utilities.ToolsBox;

public class LinksTest extends BaseClass {

      @Test(dataProvider="decidimDataSmall")
      public void Testlinks(String Path)
      {
            ToolsBox links2 = new ToolsBox(driver);
                System.out.println("- Rview Broken links for page : " + Path + "---");
            links2.BrokenLinks(Path);
                System.out.println("XXXXXXXXXXXXX- Next Page-XXXXXXXXXXXXXXXX");
       }

    // add more pages as requiered

    @DataProvider(name="decidimDataSmall")
    public Object[] passDataSmall()
    {
        Object[] data = new  Object[4];
        data[0]= configura.getApplicationUrl_Home();
        data[1]= configura.getApplicationUrl_Processess();
        data[2]= configura.getApplicationUrl_Assemblies();
        data[3]= configura.getApplicationUrl_MoreInformation();
        return data;
    }
}
