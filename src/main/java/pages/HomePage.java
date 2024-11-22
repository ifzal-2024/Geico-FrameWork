package pages;
//Geico FrameWork HomePage
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


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
	
	
	public void clickLogo() throws InterruptedException {
		Thread.sleep(3000);
		logo.click();
		Thread.sleep(3000);
		
	}

}
