package Basic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotation_Hierarchy_Example {
  @Test
  public void Test() {
	  System.out.println("Test");
  }
  
	  @Test
	  public void Test_1() {
		  System.out.println("Test_1");
		  
  }
	  @Test
	  public void Test_2() {
		  System.out.println("Test_2");
	  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AfterClass");
  }

  
  @BeforeClass
  public void beforeClass1() {
	  System.out.println("BeforeClass1");
  }

  @AfterClass
  public void afterClass1() {
	  System.out.println("AfterClass1");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest");
  }


  @AfterTest
  public void afterTest() {
	  System.out.println("AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite");
  }

}
