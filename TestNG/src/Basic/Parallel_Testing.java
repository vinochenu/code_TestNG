package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Testing {
	@Test
	public void w3Schools()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		WebDriver Object=new ChromeDriver();
		Object.get("https://www.w3schools.com/sql/");	
		Object.close();
	}
	@Test
	public void selenium()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		WebDriver Object=new ChromeDriver();
		Object.get("https://www.seleniumhq.org/");
		Object.close();
	}

}
