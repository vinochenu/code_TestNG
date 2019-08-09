package Basic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class ArithmeticOperation {
	
	int a=2,b=2,c;
	
	@BeforeMethod
	
	public void info_Before()
	{
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void info_After()
	{
		System.out.println("After Method");	
	}
	
	
	
	@BeforeTest
	public void Before()
	{
		System.out.println("Program started");
	}
	
  /*@Test(priority=2)
  public void add() {
	 c=a+b;
	 System.out.println("addition is"+" "+c);
  }
  @Test(priority=1)
  public void sub() {
	  c=a-b;
	  System.out.println("subtraction is"+" "+c);
  }*/
  

  @Test(priority=0)
  public void multiply() {
	  c=a*b;
	  System.out.println("multiply is"+" "+c);
  }

  @AfterTest
	public void After()
	{
		System.out.println("Program Ended");
	}
  
}
