package pagesTest;
//Geico FrameWork HomePageTest

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass{

	@Test
	public void clickLogoTest() throws InterruptedException {
		homePage.clickLogo();
	}
	
	@Test
	public void clcikMenuTest() throws InterruptedException {
		homePage.clcikMenu();
	}
}
