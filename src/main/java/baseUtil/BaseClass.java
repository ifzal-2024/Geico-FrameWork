package baseUtil;
//Geico Base Class
import java.time.Duration;

import javax.naming.ldap.Rdn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;

public class BaseClass {

	public WebDriver driver;
	public HomePage homePage;

	@BeforeMethod
	public void setUp() {
		// System.setProperty("webdriver.com.driver","C:\\Users\\ifzal\\eclipse-workspace\\com.geico\\driver\\chromedriver.exe");
		// driver = new ChromeDriver();

		// 2nd way
		// System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
		// + "/driver/chromedriver.exe");
		// driver = new ChromeDriver();

		// 3rd Way
		// 3rd and Final Way
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();

		// For Firefox Driver
		// System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		// driver = new FirefoxDriver();

		// For Edge Driver
		// System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		// driver = new EdgeDriver();

		// We need to add the WebDriverManager dependency in the pom.xml file
		// When physical driver absent, or driver is not working, because of version
		// issue, then you can use WebDriverManager
		// WebDriverManager doesn't need any physical driver
		// From below line, the most updated version of Chrome browser will be
		// initialized, when no version is mentioned

		 //WebDriverManager.chromedriver().setup();
		 //driver = new ChromeDriver();

		// WebDriverManager.firefoxdriver().setup();
		// driver = new FirefoxDriver();

		// WebDriverManager.edgedriver().setup();
		// driver = new EdgeDriver();

		// driver.manage().window().fullscreen();

		// maximize method is used to maximize the window ---> mostly used
		driver.manage().window().maximize();
		driver.get("https://www.geico.com/");
		// HTTP cookies are small blocks of data created by a web server while a user is
		// browsing a website
		// deleteAllCookies do delete the cookies
		driver.manage().deleteAllCookies();
		// get() is used to access the url

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
