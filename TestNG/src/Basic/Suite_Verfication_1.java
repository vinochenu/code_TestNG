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

public class Suite_Verfication_1 {
  @Test
  public void f() {
	  System.out.println("Test 1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterMethod");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AfterSuite");
  }
  @BeforeClass
  public void beforeclass1() {
	  System.out.println("beforeclass1");
  }

  @AfterClass
  public void afterclass1() {
	  System.out.println("afterclass1");
  }
  
  @BeforeTest
  public void beforeTest1() {
	  System.out.println("beforeTest1");
  }

  @AfterTest
  public void afterTest1() {
	  System.out.println("afterTest1");
  }
}
