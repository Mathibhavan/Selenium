package Concepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Methods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\721901\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("mlatha2896@gmail.com");
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath(" //button[@value=\"1\"]"));
		login.click();
		Thread.sleep(2000);
		
		boolean enabled = login.isEnabled();
		System.out.println("Login is selected ? " +enabled);

	}

}
