package classPrograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.GetByRoleOptions;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class fetchingthevaluefromexcelSheet2 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	      //step 1:
        FileInputStream f1=new FileInputStream("C:\\Users\\Swati\\eclipse-workspace\\AB71_PW\\excelsheet\\manishab71.xlsx");

        Workbook wb=        WorkbookFactory.create(f1);
       // String value3=        wb.getSheet("product").getRow(4).getCell(0).getStringCellValue();
        String mobileNO=	NumberToTextConverter.toText(wb.getSheet("product").getRow(4).getCell(0).getNumericCellValue());
        
        System.out.println(mobileNO);//we should never print the value that comes from excel sheet
	
	}
}
