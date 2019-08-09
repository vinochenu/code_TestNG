package Basic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Listener_Implementation {
	@Test
	public void classPass() {
		System.out.println("class Pass executed");
	
	}
	/*@Test(enabled=false)
	public void classSkip() {
		System.out.println("class Skip executed");
	
	}*/
	@Test
	public void classFail() {
	int a=10;int b=0;
	int c=a/b;
		System.out.println("class Fail executed");
	
	}

}
