package Concepts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\721901\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		 WebElement alertA = driver.findElement(By.name("alert"));
		 alertA.click();
		 Thread.sleep(3000);
		 Alert alert1 =driver.switchTo().alert();
		 alert1.accept();
		 Thread.sleep(3000);
		 
		 WebElement alertB = driver.findElement(By.name("confirmation"));
		 alertB.click();
		 Thread.sleep(3000);
		 Alert alert2 =driver.switchTo().alert();
		 alert2.dismiss();
		 Thread.sleep(3000);
		 
		 WebElement alertC = driver.findElement(By.name("prompt"));
		 alertC.click();
		 Thread.sleep(3000);
		 Alert alert3 =driver.switchTo().alert();
		 alert3.sendKeys("Mathilalitha");
		 alert3.accept();
		 Thread.sleep(3000);

	}

}
