package Concepts;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabels {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\721901\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//List<WebElement> list = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td"));
		//for (WebElement data : list) {
		//System.out.println(data.getText());
		//}
		//List<WebElement> Table = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th"));
		//for (WebElement data1 : Table) {
		//System.out.println(data1.getText());
		//}
		List<WebElement> Table1 = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/td"));
		for (WebElement data2 : Table1) {
			System.out.println(data2.getText());
		}
}}
