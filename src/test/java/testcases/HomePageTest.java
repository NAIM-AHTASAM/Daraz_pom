package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.DarazHomePage;
import utilities.DriverSetup;

public class HomePageTest extends DriverSetup {
	
	DarazHomePage darazhomepage = new DarazHomePage();
	
	@Test
	public void TestHomePageTitle() {
		
		getDrive().get("https://www.daraz.com.bd/");
		assertEquals(getDrive().getTitle(), darazhomepage.HOMEPAGE_TITLE);
		
		
	}

}
