package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class RoundTripPage extends Utility {
	
	public WebDriver driver;

	public RoundTripPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="	//div[contains(text(),'round trip')]")
	WebElement roundbutton;
	

	
//	@FindBy(xpath="(//*[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
//	WebElement boardingfrom;
	
//	@FindBy(xpath="(//*[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
//	WebElement destination;
	
//	relative or 
	@FindBy(xpath="(//div//div/div/input)[1]")
	WebElement boardingfrom;
	
	@FindBy(xpath="(//div//div/div/input)[2]")
	WebElement destination;
	
	
	
	@FindBy(xpath="//div[.='Departure Date']")
	WebElement departuredate;
	
	@FindBy(xpath="//div[.='Select Date']")
	WebElement returndate;
		

	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[5]/div[1]")
	WebElement dateselectreturn;
	@FindBy(xpath="//div[@data-testid=\"home-page-flight-cta\"]")
	WebElement searchflight;
	
	public void RoundTripButton() {
		roundbutton.click();
	}
	
	public void Onboarding(String Boarding) {
		boardingfrom.click();
		boardingfrom.sendKeys(Boarding);
	}
	
	public void DestinationTo(String Destination) {
		destination.click();
		destination.sendKeys(Destination);
	}
	
	public void DepartureDate() {
		departuredate.click();
	}
	
	public void ReturnDate() {
		returndate.click();
		dateselectreturn.click();
	}
	
	public void SearchFlight() {
		searchflight.click();
	}
}
