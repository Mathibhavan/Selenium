package Automation_Pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Create_Account {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\721901\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        WebElement sigin = driver.findElement(By.xpath("//a[@class=\"login\"]"));
        sigin.click();
        WebElement email = driver.findElement(By.xpath("//input[@id=\"email_create\"]"));
        email.sendKeys("mlatha2896@gmail.com");
        WebElement create = driver.findElement(By.xpath("//button[@id=\"SubmitCreate\"]"));
        create.click();
        WebElement gender = driver.findElement(By.xpath("//input[@id=\"id_gender2\"]"));
        gender.click();
        WebElement Fname = driver.findElement(By.xpath("//input[@id=\"customer_firstname\"]"));
        Fname.sendKeys("Mathi");
        WebElement Lname = driver.findElement(By.xpath("//input[@id=\"customer_lastname\"]"));
        Lname.sendKeys("Lalitha");
        WebElement psw = driver.findElement(By.xpath("//input[@id=\"passwd\"]"));
        psw.sendKeys("Bhavan$2002");
        WebElement day = driver.findElement(By.xpath("//select[@id=\"days\"]"));
        Select s = new Select(day);
        s.selectByValue("28");
        WebElement month = driver.findElement(By.xpath("//select[@id=\"months\"]"));
        Select s1 = new Select(month);
        s1.selectByValue("4");
        WebElement year = driver.findElement(By.xpath("//select[@id=\"years\"]"));
        Select s2 = new Select(year);
        s2.selectByValue("1996");
        WebElement fname = driver.findElement(By.xpath("//input[@id=\"firstname\"]"));
        fname.sendKeys("Mathi");
        WebElement lname = driver.findElement(By.xpath("//input[@id=\"lastname\"]"));
        lname.sendKeys("Lalitha");
        WebElement company = driver.findElement(By.xpath("//input[@id=\"company\"]"));
        company.sendKeys("CTS");
        WebElement address = driver.findElement(By.xpath("//input[@id=\"address1\"]"));
        address.sendKeys("No 2/3 Logaiya Naidu street");
        WebElement city = driver.findElement(By.xpath("//input[@id=\"city\"]"));
        city.sendKeys("Chennai");
        WebElement state = driver.findElement(By.xpath("//select[@id=\"id_state\"]"));
        Select s3 = new Select(state);
        s3.selectByVisibleText("California");
        WebElement code = driver.findElement(By.xpath("//input[@id=\"postcode\"]"));
        code.sendKeys("60050");
        WebElement country = driver.findElement(By.xpath("//select[@id=\"id_country\"]"));
        Select s4 = new Select(country);
        s4.selectByVisibleText("United States");
        WebElement phone = driver.findElement(By.xpath("//input[@id=\"phone_mobile\"]"));
        phone.sendKeys("9176095529");
        WebElement asign_address = driver.findElement(By.xpath("//input[@id=\"alias\"]"));
        asign_address.sendKeys("My address");
        WebElement register = driver.findElement(By.xpath("//span[text()=\"Register\"]"));
        register.click();
        
        
        
        
        
        
}}
