package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Shopping_Site extends Base_Class {

		public static WebDriver driver;
		public static void main(String[] args) {
			driver=BrowserLaunch("Chrome");
			getURL("http://automationpractice.com/index.php");
			
			Click_Element(driver.findElement(By.xpath("//a[@class=\"login\"]")));
			Input_Element(driver.findElement(By.xpath("//input[@id=\"email\"]")), "mlatha2896@gmail.com");
			Input_Element(driver.findElement(By.xpath("//input[@id=\"passwd\"]")), "Bhavan$2002");
			Click_Element(driver.findElement(By.xpath("//button[@id=\"SubmitLogin\"]")));
			Click_Element(driver.findElement(By.xpath("(//a[@title=\"T-shirts\"])[2]")));
			Click_Element(driver.findElement(By.xpath("//input[@id=\"layered_id_attribute_group_2\"]")));
			Click_Element(driver.findElement(By.xpath("//input[@id=\"layered_id_attribute_group_13\"]")));
			DropDown(driver.findElement(By.xpath("//select[@id=\"selectProductSort\"]")), "text", "Price: Lowest first");
			Move_ToElement(driver.findElement(By.xpath("(//a[@title=\"Faded Short Sleeve T-shirts\"])[2]")));
			Click_Element(driver.findElement(By.xpath("//a[@title=\"Add to cart\"]")));
			Click_Element(driver.findElement(By.xpath("(//a[@rel=\"nofollow\"])[6]")));
			Implicitwait();
			Click_Element(driver.findElement(By.xpath("//a[@title=\"Proceed to checkout\"]")));
			Implicitwait();
			Click_Element(driver.findElement(By.xpath("(//a[@title=\"Proceed to checkout\"])[2]")));
			Implicitwait();
			Click_Element(driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")));
			Click_Element(driver.findElement(By.xpath("//div[@id=\"uniform-cgv\"]")));
			Implicitwait();
			Click_Element(driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")));
			Click_Element(driver.findElement(By.xpath("//a[@class=\"bankwire\"]")));
			Click_Element(driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")));
			
	}

}
