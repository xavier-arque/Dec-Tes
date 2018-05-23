package utilities;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader
{
    XSSFWorkbook excelArchive;
    XSSFSheet excelSheet;

    public ExcelReader(String excelPath)
    {
        try
        {
            File src=new File(excelPath);

            //File src=new File("./Configuration/DecidimLoginData.xlsx");

            FileInputStream fis = new FileInputStream(src);

            excelArchive = new XSSFWorkbook(fis);

        }
        catch (IOException e)
        {
            System.out.println("There is a problem accessing the excel file. Exception is == " + e.getMessage());
        }
    }

    public String getData(String sheetName, int rowNumber, int cellNumber)
    {

        excelSheet = excelArchive.getSheet(sheetName);

        String data = excelSheet.getRow(rowNumber).getCell(cellNumber).getStringCellValue();

        return data;


    }

    public int getRowCount(String sheetName)
    {
       int row = excelArchive.getSheet(sheetName).getLastRowNum();
        row = row+1;
        return row;
    }

}
