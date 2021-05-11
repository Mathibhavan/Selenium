package Concepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\721901\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://techcanvass.com/examples/register.html");
		WebElement fname = driver.findElement(By.xpath("(//input[@type=\"text\"])[1]"));
		fname.sendKeys("Mathi");
		Thread.sleep(2000);
		WebElement lname = driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
		lname.sendKeys("Lalitha");
		Thread.sleep(2000);
		WebElement gender = driver.findElement(By.xpath("//input[@value=\"female\"]"));
		gender.click();
		Thread.sleep(2000);
		WebElement option = driver.findElement(By.xpath("//select[@name=\"model\"]"));
		option.click();
		WebElement drop = driver.findElement(By.xpath("//option[@value=\"Ser32\"]"));
		drop.click();
		Thread.sleep(2000);
		WebElement Add1 = driver.findElement(By.xpath("(//input[@type=\"text\"])[3]"));
		Add1.sendKeys("NO 2/3 Logaiya Naidu Street");
		Thread.sleep(2000);
		WebElement Add2 = driver.findElement(By.xpath("(//input[@type=\"text\"])[4]"));
		Add2.sendKeys("Manurrpet");
		Thread.sleep(2000);
		WebElement city = driver.findElement(By.xpath("(//input[@type=\"text\"])[5]"));
		city.sendKeys("Chennai");
		Thread.sleep(2000);
		WebElement contact = driver.findElement(By.xpath("(//input[@type=\"text\"])[6]"));
		contact.sendKeys("9176095529");
		Thread.sleep(2000);
		WebElement select = driver.findElement(By.xpath("//input[@type=\"checkbox\"]"));
		select.click();
		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		submit.click();
		Thread.sleep(2000);
	}

}
