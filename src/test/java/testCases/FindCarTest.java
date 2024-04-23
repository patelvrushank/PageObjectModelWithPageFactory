package testCases;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import pages.HomePage;

public class FindCarTest extends BaseTest{
	@Test
	public void findCarTest() {
		HomePage home = new HomePage(driver);
		home.findNewCar().tata().Cars();
	}
	
	
	@Test
	public void newLaunchesTest() {
		HomePage home = new HomePage(driver);
		home.newLaunches().title();
	}
	@Test
	public void newLaunchesNameAndPriceTest() {
		HomePage home = new HomePage(driver);
		home.newLaunches().getNameAndPrice();
	}
	

}
