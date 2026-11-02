package classPrograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.GetByRoleOptions;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class fetchingthevaluefromexcelSheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	      //step 1:
        FileInputStream f1=new FileInputStream("C:\\Users\\MKT\\eclipse-workspace\\AB71_PW\\excelsheet\\manishab71.xlsx");
        //opening teh excel sheet
        Workbook wb=        WorkbookFactory.create(f1);
        //step 3
        Sheet s1=        wb.getSheet("product");
        //step 4:
        Row r1=        s1.getRow(4);
        //step 5:
        Cell c1=        r1.getCell(0);
        
        String value1=        c1.getStringCellValue();
        System.out.println(value1);
        
        String value2=        wb.getSheet("product").getRow(1).getCell(0).getStringCellValue();
        System.out.println(value2);
        String value3=        wb.getSheet("product").getRow(2).getCell(0).getStringCellValue();
        System.out.println(value3);
		Playwright playwright=			Playwright.create();
		Browser browser=	playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=		browser.newPage();
		
		page.navigate("https://www.amazon.in");
		Locator l1=	page.getByRole(AriaRole.SEARCHBOX,new GetByRoleOptions().setName("Search Amazon.in") );
		l1.fill(value2);
		page.waitForTimeout(3000);
		l1.clear();
	}
}
