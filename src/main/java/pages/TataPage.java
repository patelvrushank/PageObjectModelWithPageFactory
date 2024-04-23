package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class TataPage extends BasePage {

	public TataPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath= "//h1[@class='o-dOKno o-bNCMFw o-fzoTzs o-dKUdmM']")
	WebElement tataList;
	
	public void Cars() {
		System.out.println(tataList.getText());
		//tataList.getText().AssertEquels("Tata Cars");
		
	}
}
