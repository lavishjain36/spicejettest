package testcase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.RoundTripPage;

public class RoundTripTest extends BaseClass {

	@Test
	public void getsearchroundtripFlight() throws InterruptedException {
		RoundTripPage round=new RoundTripPage(driver);
		round.RoundTripButton();
		Thread.sleep(2000);
		round.Onboarding(prop.getProperty("From"));
		Thread.sleep(2000);
		round.DestinationTo(prop.getProperty("To"));
		Thread.sleep(2000);
		round.DepartureDate();
		Thread.sleep(2000);
		round.ReturnDate();
		Thread.sleep(2000);
		round.SearchFlight();
	}
}
