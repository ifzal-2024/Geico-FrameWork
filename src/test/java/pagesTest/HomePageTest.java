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
	
	@Test
	public void clickZipCodeTest() {
		homePage.clickZipCode();
	}
	
	@Test
   
	public void clickZipButtonTest() {
		homePage.clickZipButton();
	}
	
	
@Test
public void inputTextInZipcodeFiledTest() {
	homePage.inputTextInZipcodeFiled();
}

@Test
public void inputTextInZipcodeFiled2Test() {
	homePage.inputTextInZipcodeFiled2();
}

@Test
public void clickTermsConditionTest() {
	homePage.clickTermsCondition();
}

@Test
public void clickPrivacyPolicyTest() {
	homePage.clickPrivacyPolicy();
}

@Test
public void clickStartMyQuoteTest() {
	homePage.clickStartMyQuote();
	
	}
@Test
public void acceptPrivacyPolicyTest() {
	homePage.acceptPrivacyPolicy();
}


@Test
public void isEnabledMenuBarTest() {
	homePage.isEnabledMenuBar();
	
}

}


