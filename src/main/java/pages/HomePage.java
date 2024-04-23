package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/header/div/nav/ul/li[1]/div")
	WebElement newCars;
	@FindBy(xpath = "//div[contains(text(),'Find New Cars')]")
	WebElement findNewCars;
	@FindBy(xpath = "//div[contains(text(),'New Launches')]")
	WebElement newLaunches;
	
	public FindNewCars findNewCar() {
		new Actions(driver).moveToElement(newCars).perform();
		findNewCars.click();
		return new FindNewCars(driver);
	}
	public NewLaunches newLaunches() {
		
		new Actions(driver).moveToElement(newCars).perform();
		newLaunches.click();
		return new NewLaunches(driver);
		
	}
	
}
