package pages;
//Geico FrameWork HomePage




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static common.CommonActions.*;

import java.time.Duration;
import java.util.Set;

import javax.xml.xpath.XPath;

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
	WebElement menuBar;
	
	@FindBy(xpath = "//input[@class='zip-code-input' and @id='ssp-service-zip']")
	WebElement zipCode;
	
	@FindBy(xpath = "//button[text()='Go']")
	  WebElement zipCodeButton;
	
	
		
	// Partial LinkText
	//@FindBy(partialLinkText = "privacy pol")
	//WebElement privacyPolicy;
	
	@FindBy(xpath = "//a[text()='Start My Quote']")
	WebElement startMyQuotElement;
	
	@FindBy(xpath = "(//span[@class='icon-confirmation'])[1]")
	WebElement rentersCheckBox;
	
	//Xpath with compound Class Works.
	@FindBy(xpath = "//input[@class='btn btn--primary btn--full-mobile']")
	WebElement continueButtonInner;
	
    //Link Text
	@FindBy(linkText = "terms and conditions")
	WebElement termsCondition; 
	
	@FindBy(xpath = "//a[text()='privacy policy']")
	WebElement privacyPolicy;
	
	@FindBy(xpath = "//h1[text()='Terms and Conditions of Website Use']")
	WebElement termsConditionHeader;
	
	@FindBy(xpath = "//input[@id='Id_GiveFirstName_25511']")
	WebElement firstNam;
	
	@FindBy(xpath = "//input[@id='Id_GiveLastName_70811']")
	WebElement lastName;
	
	@FindBy(xpath = "//input[@id='Id_GiveDateOfBirth_28533']")
	WebElement dateOfBirth;
	
	@FindBy(id="Id_Next_77123")
	WebElement nextButton;
	
	
	
	//Inner ZipCOde        //input[@id='Id_GiveInitialZipCode_55126-label']
	public void clickLogo() throws InterruptedException {
		//common method pause used here
		pause(3000);
		// common method "clickElement" is used here
		clickElement(logo);
		pause(3000);
			}
	
	public void clcikMenu() throws InterruptedException {
		
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		menuBar.click();
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
	clearTextFromTheField(zipCode);
	pause(3000);
	inputText(zipCode, "75060");
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
	
	public void clickStartMyQuote() {
		pause(3000);
	clickElement(startMyQuotElement);
		pause(3000);
		
	}
	
	// CC Selector Using ID 
	public void acceptPrivacyPolicy() {
		driver.findElement(By.cssSelector("input#cookie-notice-close")).click();
		pause(3000);
		
	}
	
	public void isEnabledMenuBar() { 
		elementEnabled(menuBar);
		pause(3000);
		elementDisplayed(menuBar);
		pause(3000);
		clickElement(menuBar);
		pause(3000);
		
	}
	
	public void getmyQuoteFillUp() {
		pause(1000);
		inputText(zipCode, "75060");
		pause(2000);
		clickElement(startMyQuotElement);
		pause(3000);
		clickElement(continueButtonInner);
		pause(3000);
		elementDisplayed(firstNam);
		pause(2000);
		firstNam.sendKeys("John");
		pause(2000);
		inputTextThenClickTab(lastName, "Smith");
		pause(2000);
		inputText(dateOfBirth, "05081985");
		pause(2000);
		clickElement(nextButton);
	}

	public void pennEnrollment() { // HoverOver, Navigate, verifyUrl, 
		pause(2000);
		driver.navigate().to("https://www.enrollnow.net/en");
		pause(2000);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		driver.manage().window().fullscreen();
		WebElement choose=driver.findElement(By.xpath("//span[text()='Choose']"));
		choose.isDisplayed();
		Actions actions = new Actions(driver);
		actions.moveToElement(choose).build().perform();
		pause(10000);
		driver.findElement(By.xpath("//a[text()='Find a hospital']")).click();
		pause(3000);
	verifyCurrentUrl(driver,"https://www.enrollnow.net/en/find-hospital");
		pause(2000);
		driver.findElement(By.xpath("//p[text()='Enroll in or change a health plan, or check your case']")).click();
		pause(2000);
		driver.findElement(By.xpath("//u[text()='Get started']")).click();
		pause(5000);
	}
	
	//Switch Between Windows
	public void switch_between_window() {  
		elementDisplayed(termsCondition); 
		clickElement(termsCondition); // a child window will open
		pause(3000);
		// getWindowHandle() method handle only one window [parent]
		// getWindowHandles() method handle more than one window
		Set<String> allWindowHandles = driver.getWindowHandles(); 
		// Extract Parent and child window from all window handles
		String parent = (String)allWindowHandles.toArray()[0]; 
		String child = (String)allWindowHandles.toArray()[1];
		driver.switchTo().window(child); // how switch to a child window
		pause(3000);
		verifyTextOfTheWebElement(termsConditionHeader, "Ter and Conditions of Website Use");
		pause(3000);
	}
	
}
