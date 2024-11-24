package common;
//CommonActions Geico
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import reports.Loggers;

public class CommonActions {
	// common method for click ()
		public static void clickElement(WebElement element) {
			try {
				element.click();
				Loggers.logTheTest(element + "<-------- has been clicked");
			} catch (NoSuchElementException | NullPointerException e) {
				Loggers.logTheTest(element + "<---------- has not been found\n" + e.getMessage()); 
				// e.getMessage() and e.printStackTrace() give similar outcome
			}		
		}
		
		// common method for sleep()
		public static void pause(long millis) {
			try {
				Thread.sleep(millis);
				Loggers.logTheTest("Sleeping ... zZz " + millis);
			} catch (InterruptedException e) {
				Loggers.logTheTest("Sleep interrupted because of ... " + e.getMessage());
			}		
		}
		
		
		// common method for sendKeys()
		public static void inputText(WebElement element, String input) {
			try {
				element.sendKeys(input);
				Loggers.logTheTest(input + " <----- has been put into <-----> " + element);
			} catch (NoSuchElementException | NullPointerException e) {
				Loggers.logTheTest(element + "<---------- has not been found becuase of ...\n" + e.getMessage() );
			}		
		}
		
		//Common method for isDisplayed
		public static void elementDisplayed(WebElement element) {
			try {
				boolean flag = element.isDisplayed();
				Loggers.logTheTest(element + "<---------> is Displayed, " + flag);
			} catch (NoSuchElementException | NullPointerException e) {
				Loggers.logTheTest(element + "<----------> is not Displayed\n" + e.getMessage() );
			}		
		}
		
		
		//Common Method for isEnabled
		public static void elementEnabled(WebElement element) {
			try {
				boolean flag = element.isEnabled();
				Loggers.logTheTest(element + "<---------> is Enabled, " + flag);
			} catch (NoSuchElementException | NullPointerException e) {
				Loggers.logTheTest(element + "<----------> is not Displayed\n" + e.getMessage() );
			}
		}
		
		//Common Method for isSelected
		public static void elementSelected (WebElement element){
			try {
				boolean flag = element.isSelected();
				Loggers.logTheTest(element + "<---------> is Selected, " + flag);
			} catch (NoSuchElementException | NullPointerException e) {
				Loggers.logTheTest(element + "<----------> is not Displayed\n" + e.getMessage() );
			}
		}
			

}
