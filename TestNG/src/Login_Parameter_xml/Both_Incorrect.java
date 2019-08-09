package Login_Parameter_xml;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Both_Incorrect {
	
	@Test
	@Parameters({"USERNAME","PASSWORD"})
	public void login_Both_Incorrect(String username,String password)
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
