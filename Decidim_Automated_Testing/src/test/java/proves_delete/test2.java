package proves_delete;

import utilities.ExcelReader;

public class test2 {


    public static void main(String[] args)

    {
        ExcelReader excel = new ExcelReader("./Configuration/DecidimLoginData.xlsx");

        System.out.println(excel.getData("Full1",1,1));
    }
}
