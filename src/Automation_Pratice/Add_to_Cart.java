package Automation_Pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Add_to_Cart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\721901\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=my-account");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement tshirt = driver.findElement(By.xpath("(//a[@title=\"T-shirts\"])[2]"));
		tshirt.click();
		WebElement size = driver.findElement(By.xpath("//input[@id=\"layered_id_attribute_group_2\"]"));
		size.click();
		WebElement color = driver.findElement(By.xpath("//input[@id=\"layered_id_attribute_group_13\"]"));
		color.click();
		WebElement prize = driver.findElement(By.xpath("//select[@id=\"selectProductSort\"]"));
		Select s = new Select(prize);
		s.selectByVisibleText("Price: Lowest first");
		WebElement view = driver.findElement(By.xpath("(//a[@title=\"Faded Short Sleeve T-shirts\"])[2]"));
		Actions a = new Actions(driver);
		a.moveToElement(view).click();
		WebElement add_to_cart=driver.findElement(By.xpath("//a[@title=\"Add to cart\"]"));
		add_to_cart.click();
		WebElement check_out = driver.findElement(By.xpath("//a[@title=\"Proceed to checkout\"]"));
		check_out.click();
		WebElement check_out1 = driver.findElement(By.xpath("(//a[@title=\"Proceed to checkout\"])[2]"));
		check_out1.click();
		WebElement email = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		email.sendKeys("mlatha2896@gmail.com");
		WebElement psw = driver.findElement(By.xpath("//input[@id=\"passwd\"]"));
		psw.sendKeys("Bhavan$2002");
		WebElement login = driver.findElement(By.xpath("//button[@id=\"SubmitLogin\"]"));
		login.click();
		WebElement check_out2 = driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]"));
		check_out2.click();
		WebElement agree = driver.findElement(By.xpath("//input[@id=\"cgv\"]"));
		agree.click();
		WebElement check_out3 = driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]"));
		check_out3.click();
		WebElement pay = driver.findElement(By.xpath("//a[@title=\"Pay by bank wire\"]"));
		pay.click();
		WebElement confirm = driver.findElement(By.xpath("//span[text()='I confirm my order']"));
		confirm.click();
	}

}
