package Login_Dataprovider_JXL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Login_DataProvider_JXL {
	
	WebDriver Object;
	
	@org.testng.annotations.DataProvider(name="Login_DataProvider")
	public Object[] [] DataProvider() throws BiffException, IOException
	{
		Object[][] TestData = getExcelData();
		return TestData;
	}
	
	
	//to get excel data
	public Object[] [] getExcelData() throws BiffException, IOException
	{
		//get excel file location
		FileInputStream excel=new FileInputStream("C:\\vinoth\\Selenium\\TestNG\\Test Data\\Login_TestData_JXL.xls");
		//to get the workbook
		Workbook workbook=Workbook.getWorkbook(excel);
		//to get the sheet under workbook
		Sheet sheet=workbook.getSheet(0);
		//to get rows
		int rows=sheet.getRows();
		//to get columns
		int columns=sheet.getColumns();
		
		//to allocate memory for rows & columns
		String value[] []=new String [rows-1] [columns];
		//to get the content from sheet
		for(int i=1;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
			value[i-1] [j]=sheet.getCell(j, i).getContents();
			}
		}
		
		return value;
	}
	
	
	
	/*@BeforeTest
	public void browserOpen()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\e3027405\\\\Downloads\\\\chromedriver.exe");
		 Object=new ChromeDriver();
	}
	
	@AfterTest
	public void closeBrowser()
	{
		Object.close();
	}
	*/
	
	@Test(dataProvider="Login_DataProvider")
	public void Login_App_Dataprovider(String username,String password)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\e3027405\\\\Downloads\\\\chromedriver.exe");
		 Object=new ChromeDriver();
		
		Object.get("https://opensource-demo.orangehrmlive.com/");
	

Object.findElement(By.id("txtUsername")).clear();
Object.findElement(By.id("txtUsername")).click();
Object.findElement(By.id("txtUsername")).sendKeys(username);

Object.findElement(By.id("txtPassword")).clear();
Object.findElement(By.id("txtPassword")).click();
Object.findElement(By.id("txtPassword")).sendKeys(password);

Object.findElement(By.id("btnLogin")).click();
Object.close();

	}


}

