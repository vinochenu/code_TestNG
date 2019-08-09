package Basic;

import org.testng.annotations.Test;

public class Group_Examples {
	@Test(groups= {"car"})
	public void polo() {
		System.out.println("polo");
	}
	@Test(groups= {"car"})
	public void verna() {
		System.out.println("verna");
	}
	@Test(groups= {"bike"})
		public void kTM() {
			System.out.println("kTM");
		}
	@Test(groups= {"bike"})
		public void bullet() {
			System.out.println("bullet");
	}
	@Test(groups= {"bus"})
		public void scania() {
			System.out.println("scania");
		}
	@Test(groups= {"bus"})
		public void volvo() {
			System.out.println("volvo");
	}
		
}
