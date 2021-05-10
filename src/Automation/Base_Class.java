package Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	public static void DriverMax() {
		driver.manage().window().maximize();
	}
	public static void Implicitwait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void Explicitwait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
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
	public static void getTitle() {
		driver.getTitle();
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
	public static void Multiple(WebElement element) {
	Select s = new Select(element);
	List<WebElement> list = s.getOptions();
	System.out.println(list);
	}
	public static void FirstSelected(WebElement element) {
		Select s = new Select(element);
		System.out.println(s.getFirstSelectedOption());
	}
	public static void AllSelected(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getAllSelectedOptions();
		System.out.println(options);
	}
	public static void Alert(WebElement element) {
		element.click();
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	public static void ConformAlert(WebElement element, String option){
		
		if (option.equalsIgnoreCase("ok")) {
			element.click();
			Alert a = driver.switchTo().alert();
			a.accept();
		}else {
			element.click();
			Alert a = driver.switchTo().alert();
			a.dismiss();
		}
	}
	public static void PromptAlert(WebElement element,String value) {
		element.click();
		Alert a = driver.switchTo().alert();
		a.sendKeys(value);
		a.accept();
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
	public static void Windows_Handle(WebElement element) {
		String s=driver.getWindowHandle();
		System.out.println(s +element.getText());
	}
	public static void Windows_Handles(WebElement element) {
		String s=driver.getWindowHandle();
		System.out.println(s +element.getText());
	}
	public static void Enabled(WebElement element) {
		System.out.println(element.isEnabled());
	}
	public static void Displayed(WebElement element) {
		System.out.println(element.isDisplayed());
	}
	public static void Selected(WebElement element) {
		System.out.println(element.isSelected());
	}
	public static void Frame_ID(int frame) {
		try {
			driver.switchTo().frame(frame);
			System.out.println("Navigated to frame " +frame);
		} catch (Exception e) {
			System.out.println("Unable to locate the frame " +frame);
		}
	}
	public static void Frame_STR(String frame) {
		try {
			driver.switchTo().frame(frame);
			System.out.println("Navigated to frame " +frame);
		} catch (Exception e) {
			System.out.println("Unable to locate the frame " +frame);
		}
	}
	public static void Frame_Element(WebElement element) {
		try {
			driver.switchTo().frame(element);
			System.out.println("Navigated to frame " +element);
		} catch (Exception e) {
			System.out.println("Unable to locate the frame " +element);
		}
	}
	public static void SwitchtoFrame(String Parentframe, String Childframe) {
		try {
			driver.switchTo().frame(Parentframe).switchTo().frame(Childframe);
			System.out.println("Navigated to innerframe  " + Childframe
					+ "which is present on frame " + Parentframe);
		} catch (NoSuchFrameException  e) {
			System.out.println("Unable to locate frame  " + Parentframe
					+ " or " + Childframe + e.getStackTrace());
		}
		catch (Exception e) {
			System.out.println("Unable to navigate to innerframe with id "
					+ Childframe + "which is present on frame with id"
					+ Parentframe );
		}
	}
	public static void ScrollDown() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("Window.scrollBy(0-250)", "");
	}
	public static void ScrollHorizontally(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
	}
	}

//Robot






















