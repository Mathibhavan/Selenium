package Concepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmaillogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\721901\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		
		WebElement mail = driver.findElement(By.xpath("//input[@type=\"email\"]"));
		mail.sendKeys("mlatha2896@gmail.com");
		Thread.sleep(2000);
		
		WebElement next = driver.findElement(By.xpath("//div[@class=\"VfPpkd-RLmnJb\"]"));
		next.click();
		Thread.sleep(2000);
		
		WebElement psw = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		psw.sendKeys("huyhjmhiu");
		Thread.sleep(2000);
		
		WebElement next1 = driver.findElement(By.xpath("(//div[@class=\"VfPpkd-RLmnJb\"])[1]"));
		next1.click();
		Thread.sleep(2000);
		
}}
