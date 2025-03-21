package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hotelReservation {
WebDriver driver;
String browserType = "Chrome";
String city = "New York, NY";
String checkIn = "04/18/2019";
String numofGuests = "4";
	
	@Test
	public void reservationsExpedia() {
		//1. Search
		
		driver.findElement(By.id("tab-hotel-tab-hp")).click();
		driver.findElement(By.id("hotel-destination-hp-hotel")).clear();
		driver.findElement(By.id("hotel-destination-hp-hotel")).sendKeys(city);
		driver.findElement(By.id("hotel-checkin-hp-hotel")).clear();
		driver.findElement(By.id("hotel-checkin-hp-hotel")).sendKeys(checkIn);
		driver.findElement(By.id("hotel-checkout-hp-hotel")).click();
	    driver.findElement(By.id("hotel-checkout-hp-hotel")).clear();
	    driver.findElement(By.id("hotel-checkout-hp-hotel")).sendKeys("04/26/2019");
		driver.findElement(By.xpath("//*[@id=\"traveler-selector-hp-hotel\"]/div/ul/li/button")).sendKeys(numofGuests);
		driver.findElement(By.xpath("//*[@id=\"gcw-hotel-form-hp-hotel\"]/div[10]/label/button")).click();
		
	
		//2. Modify search results page, give criteria
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/form/div[1]/fieldset[3]/div/span[4]/label")).click();
		
		//3.Analyze the results and make our selection
		
		//4. Book reservation
		
		//5.Fill out contact/billing
		
		//6.Get confirmation

	}
	
	@BeforeMethod
	public void setUp() {
		driver = utilities.DriverFactory.open(browserType);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.expedia.com/");
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
	}


