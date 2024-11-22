package baseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseClass {

	public WebDriver driver;
	public HomePage homePage;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.com.driver",
				"C:\\Users\\ifzal\\eclipse-workspace\\com.geico\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		// maximize method is used to maximize the window ---> mostly used
		driver.manage().window().maximize();

		// HTTP cookies are small blocks of data created by a web server while a user is
		// browsing a website
		// deleteAllCookies do delete the cookies
		driver.manage().deleteAllCookies();
		// get() is used to access the url
		driver.get("https://www.geico.com/");
		// PageLoadTimeout is used for wait to load the page for certain amount of time
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		// Implicitly wait is used to wait for each web element
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		homePage = new HomePage(driver);// why driver? because its parameterized constructor and driver will access all
										// methods.
	}

	@AfterMethod
	public void tearUp() {// name of the method
		driver.quit(); // will close the window
	}

}
