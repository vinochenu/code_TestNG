package Basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Suite_Verification_2 {
	 @Test
	  public void f() {
		  System.out.println("Test 2");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("BeforeMethod2");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("AfterMethod2");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("BeforeSuite2");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("AfterSuite2");
	  }
	  
	  @BeforeClass
	  public void beforeclass2() {
		  System.out.println("beforeclass2");
	  }

	  @AfterClass
	  public void afterclass2() {
		  System.out.println("afterclass2");
	  }
		  
		  @BeforeTest
		  public void beforeTest2() {
			  System.out.println("beforeTest2");
		  }

		  @AfterTest
		  public void afterTest2() {
			  System.out.println("afterTest2");
		  }
	  
  }

