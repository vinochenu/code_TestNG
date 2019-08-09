package Login_Dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login_Application_Dataprovider {
	
	
	String [] [] TestData= {
			{"Admin","admin123"},	
			{"Admin","abc"},
			{"abc","admin123"},
			{"abc","abc"}
	};
	
	@DataProvider(name="login_data")
	public Object[] [] dataProvider_login()
	{
		return TestData;
	}
	@Test(dataProvider="login_data")
	public void Login_App_Dataprovider(String username,String password)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\e3027405\\\\Downloads\\\\chromedriver.exe");
		ChromeDriver Object=new ChromeDriver();
		
		Object.get("https://opensource-demo.orangehrmlive.com/");
	

Object.findElement(By.id("txtUsername")).clear();
Object.findElement(By.id("txtUsername")).click();
Object.findElement(By.id("txtUsername")).sendKeys(username);

Object.findElement(By.id("txtPassword")).clear();
Object.findElement(By.id("txtPassword")).click();
Object.findElement(By.id("txtPassword")).sendKeys(password);

Object.findElement(By.id("btnLogin")).click();

Object.quit();
	}


}
