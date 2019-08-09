package Basic;

import org.testng.annotations.Test;

public class Method_Dependencies {

	@Test(enabled=false)//skip the Test
	public void loginEmail() {
		System.out.println("login successful");
	}
	@Test(dependsOnMethods="loginEmail")//depend on above Test
	public void composeEmail() {
		System.out.println("Email drafted successfully");
	}
	@Test(dependsOnMethods="composeEmail")//depend on above Test
	public void attachFile() {
		System.out.println("File attached successfully");
	}
	@Test(dependsOnMethods="attachFile")//depend on above Test
	public void sendEMail() {
		System.out.println("EMail sent successfully");
	}
	
	
	
}
