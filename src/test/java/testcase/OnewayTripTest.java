package testcase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.OnewayTripPage;

public class OnewayTripTest extends BaseClass {

	@Test
	public void getsearchFlight() throws InterruptedException {
		OnewayTripPage oneway=new OnewayTripPage(driver);
		oneway.Oneway();
		oneway.Onboarding(prop.getProperty("From"));
		Thread.sleep(2000);
		oneway.DestinationTo(prop.getProperty("To"));
		Thread.sleep(2000);
		oneway.DepartureDate();
		Thread.sleep(2000);

		oneway.SearchFlight();
		Thread.sleep(1000);

	}
}
