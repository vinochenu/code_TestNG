package Basic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Mercury_Homepage {
	
	
	
  @Test(priority=1,enabled=false)//skip the Test
  public void a() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		WebDriver Object=new ChromeDriver();
		Object.get("https://www.seleniumhq.org/");
		  String Expected_Title="Selenium - Web Browser Automation";
		  String Actual_Title=Object.getTitle();
		  System.out.println(Actual_Title);
		  Assert.assertEquals(Actual_Title, Expected_Title);
		  Object.close();
	  
  }
  
  @Test(priority=0)
  public void b()
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		WebDriver Object=new ChromeDriver();
		Object.get("https://www.seleniumhq.org/");
		 Object.navigate().to("https://www.w3schools.com/sql/");
		 Object.navigate().back();
		 String url=Object.getCurrentUrl();
		 System.out.println(url);
		  Object.close();
  }
  @BeforeTest
  public void beforeTest() {
	  
	System.out.println("Program started");  
  }

  @AfterTest
  public void afterTest() {
	
	  System.out.println("Program ended");   
  }

}
