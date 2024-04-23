package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class NewLaunches  extends BasePage {

	public NewLaunches(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//h1[@class='o-fzoHBq o-fzoHFO o-fzoHCA o-dOKno o-bNCMFw']")
	WebElement title;
	public void title() {
		System.out.println(title.getText());
	}
	
	
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[3]/div[1]/section[1]/div/ul/li/div/div/div/a/h3")
	public List<WebElement> carName;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[3]/div[1]/section[1]/div/ul/li/div/div/div/div[1]/div/span/span[1]")
	public List<WebElement> carPrice;
	public void getNameAndPrice() {
		
		for (int i=0;i<carName.size();i++) {
			
			System.out.println("Car Name = "+carName.get(i).getText()+"Car Price = "+carPrice.get(i).getText());
		}
		
	}

}
