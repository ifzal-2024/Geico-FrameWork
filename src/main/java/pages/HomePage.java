package pages;
//Geico FrameWork HomePage
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static common.CommonActions.*;

public class HomePage {
	public WebDriver driver;

	// parameterized constructor initialized when class in instantiated [object created]
	public HomePage(WebDriver driver) {
		this.driver = driver;

	
		// PageFactory class help to instantiate WebElements
			// Important interview question
		PageFactory.initElements(driver, this);
			
		}

	@FindBy(xpath = "//a[@class='icon-geico']")
	WebElement logo;
	
	
	
	@FindBy(xpath = "//span[@class='header-link']")
	WebElement menu;
	
	@FindBy(xpath = "//input[@class='zip-code-input' and @id='ssp-service-zip']")
	WebElement zipCode;
	
	@FindBy(xpath = "//button[text()='Go']")
	  WebElement zipCodeButton;
	
	//Link Text
	@FindBy(linkText = "terms and conditions")
	WebElement termsCondition; 
		
	// Partial LinkText
	@FindBy(partialLinkText = "privacy pol")
	WebElement privacyPolicy;
	
	
	
	public void clickLogo() throws InterruptedException {
		//common method pause used here
		pause(3000);
		// common method "clickElement" is used here
		clickElement(logo);
		pause(3000);
			}
	
	public void clcikMenu() throws InterruptedException {
		Thread.sleep(3000);
		menu.click();
		Thread.sleep(3000);
	}

	
	public void clickZipCode() {
		pause(3000);
		clickElement(zipCode);
		pause(3000);
		
	}
	
	
	public void clickZipButton() {
		pause(3000);
		clickElement(zipCodeButton);
		pause(3000);
	}
	
	// Using sendKeys() to inputText in ZipCOde field
	public void inputTextInZipcodeFiled() {
		zipCode.sendKeys("11352");
		pause(3000);
	}
	
	//Below Using common Actions inoputText
	public void inputTextInZipcodeFiled2() {
	inputText(zipCode, "11352");
	pause(3000);
	}
	
	//LinkText
	public void clickTermsCondition() {
		pause(3000);
		clickElement(termsCondition);
		pause(3000);
	}
	
	public void clickPrivacyPolicy() {
		clickElement(privacyPolicy);
		pause(3000);
		
	}

}
