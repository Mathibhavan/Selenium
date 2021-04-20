package Hotel_Booking;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	
	
	public static WebDriver driver;
	public static WebDriver BrowserLaunch(String BrowserName) {
		if (BrowserName.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\721901\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		}
			return driver;
		}
	public static void Navigate(String URL) {
		driver.navigate().to(URL);
	}
	public static void Navigate_Back() {
		driver.navigate().back();
	}
	public static void Navigate_Forward() {
		driver.navigate().forward();
	}
	public static void Navigate_Refresh() {
		driver.navigate().refresh();
	}
	public static void Close() {
		driver.close();
	}
	public static void Quit() {
		driver.quit();
	}
	public static void getURL(String URL) {
		driver.get(URL);
		}
	public static void getText(WebElement element) {
		String text=element.getText();
		System.out.println(text);
	}
	public static void getAttribute(WebElement element) {
		String attribute=element.getAttribute("value");
		System.out.println(attribute);
	}
	public static void Click_Element(WebElement element) {
	element.click();
	}
	public static void Move_ToElement(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
	}
	public static void Click_Hold(WebElement element) {
		Actions a = new Actions(driver);
		a.clickAndHold(element).build().perform();
		}
	public static void Context_Click(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).build().perform();
	}
	public static void Drag_Drop(WebElement source,WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
	}
	public static void Input_Element(WebElement element, String text) {
		element.sendKeys(text);
	}
	public static void DropDown(WebElement element, String option, String value) {
		Select s = new Select(element);
		if (option.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}else if (option.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}else if (option.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));
		}
	}
	public static void Alert(WebElement element, String option) {
		
		if (option.equalsIgnoreCase("alert")) {
			Alert alert = driver.switchTo().alert();
			element.click();
			alert.accept();
		}else if (option.equalsIgnoreCase("confirmation")) {
			Alert alert = driver.switchTo().alert();
			element.click();
			alert.dismiss();
		}
		}
		public static void SnapShot() throws IOException {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\721901\\eclipse-workspace\\Concepts\\src\\Screenshot\\test.png");
			FileUtils.copyFile(src, dest);
		}
		public static void Robot() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			
		}
		
	}
























