package Concepts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Action {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\721901\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://webdriveruniversity.com/Actions/index.html");
        Thread.sleep(5000);
        
        WebElement target = driver.findElement(By.xpath("//b[text()='DROP HERE!']"));
        WebElement source = driver.findElement(By.xpath("//b[text()='DRAG ME TO MY TARGET!']"));
        Actions ac = new Actions(driver);
        ac.dragAndDrop(source, target).build().perform();
        Thread.sleep(5000);
        
        WebElement doubleclick = driver.findElement(By.id("double-click"));
		Actions ac1 = new Actions(driver);
		ac1.doubleClick(doubleclick).build().perform();
		Thread.sleep(5000);
		
		WebElement hover1 = driver.findElement(By.xpath("//button[text()='Hover Over Me First!']"));
		Actions ac2 = new Actions(driver);
		ac2.moveToElement(hover1).build().perform();
		WebElement link1 = driver.findElement(By.xpath("(//a[text()='Link 1'])[1]"));
		link1.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		
		WebElement hover2 = driver.findElement(By.xpath("//button[text()='Hover Over Me Second!']"));
		Actions ac3 = new Actions(driver);
		ac3.moveToElement(hover2).build().perform();
		WebElement link2 = driver.findElement(By.xpath("(//a[text()=\"Link 1\"])[2]"));
		link2.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		Thread.sleep(2000);
		
		WebElement hover3 = driver.findElement(By.xpath("//button[text()='Hover Over Me Third!']"));
		Actions ac4 = new Actions(driver);
		ac4.moveToElement(hover3).build().perform();
		WebElement link3 = driver.findElement(By.xpath("(//a[text()=\"Link 1\"])[3]"));
		link3.click();
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		Thread.sleep(2000);
		
		WebElement hold = driver.findElement(By.id("click-box"));
		Actions ac5 = new Actions(driver);
		ac5.clickAndHold(hold).build().perform();
		Thread.sleep(5000);
	}

}
