package Concepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\721901\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		WebElement account = driver.findElement(By.xpath("//a[text()=\"Create New Account\"]"));
		account.click();
		Thread.sleep(2000);
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("Mathi");
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("lalitha");
		WebElement mail = driver.findElement(By.name("reg_email__"));
		mail.sendKeys("mlatha2896a@gmail.com");
		WebElement psw = driver.findElement(By.id("password_step_input"));
		psw.sendKeys("bhavan2568");
		WebElement day = driver.findElement(By.id("day"));
		day.click();
		Select sc = new Select(day);
		sc.selectByIndex(28);
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.id("month"));
		month.click();
		Select sc1 = new Select(month);
		sc1.selectByValue("4");
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.id("year"));
		year.click();
		Select sc2 = new Select(year);
		sc2.selectByVisibleText("1996");
		Thread.sleep(2000);
		WebElement gender = driver.findElement(By.xpath("//label[text()=\"Female\"]"));
		gender.click();
		Thread.sleep(2000);
		
	}

}
