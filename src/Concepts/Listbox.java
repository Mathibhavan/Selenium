package Concepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\721901\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://techcanvass.com/Examples/multi-select.html");
		WebElement x1 = driver.findElement(By.xpath("//option[@value=\"audi\"]"));
		x1.click();
		Thread.sleep(2000);
		WebElement x2 = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		x2.click();
		
		

	}

}
