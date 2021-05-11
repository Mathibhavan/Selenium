package Concepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\721901\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		WebElement file = driver.findElement(By.xpath("//input[@type=\"file\"]"));
		file.sendKeys("C:\\Users\\721901\\Desktop\\mathi.txt");
		WebElement upload = driver.findElement(By.xpath("//span[text()=\"Start upload\"]"));
		upload.click();
		
		

	}

}
