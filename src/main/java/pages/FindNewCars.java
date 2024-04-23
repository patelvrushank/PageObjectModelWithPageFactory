package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class FindNewCars extends BasePage{

	public FindNewCars(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/section[1]/div/div/div[1]/div/ul/li[2]/a/div[1]/div/img")
	WebElement tataCars;
	
	
	public TataPage tata() {
		tataCars.click();
		return new TataPage(driver);
		
	}
	
	
	
	
}
