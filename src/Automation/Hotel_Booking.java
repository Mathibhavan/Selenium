package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.BrowserType;

import Automation.Base_Class;

public class Hotel_Booking extends Base_Class {

	public static void main(String[] args) {
		driver=BrowserLaunch("Chrome");
		getURL("http://adactinhotelapp.com/index.php");
		
		Input_Element(driver.findElement(By.xpath("//input[@id=\"username\"]")), "PavithraN");
		Input_Element(driver.findElement(By.xpath("//input[@id=\"password\"]")), "Pavi@2426");
		Click_Element(driver.findElement(By.xpath("//input[@id=\"login\"]")));
		DropDown(driver.findElement(By.xpath("//select[@id=\"location\"]")), "text", "London");
		DropDown(driver.findElement(By.xpath("//select[@id=\"hotels\"]")), "text", "Hotel Sunshine");
		DropDown(driver.findElement(By.xpath("//select[@id=\"room_type\"]")), "text", "Super Deluxe");
		DropDown(driver.findElement(By.xpath("//select[@id=\"room_nos\"]")), "text", "1 - One");
		DropDown(driver.findElement(By.xpath("//select[@id=\"adult_room\"]")), "text", "2 - Two");
		Click_Element(driver.findElement(By.xpath("//input[@id=\"Submit\"]")));
		Click_Element(driver.findElement(By.xpath("//input[@id=\"radiobutton_0\"]")));
		Click_Element(driver.findElement(By.xpath("//input[@id=\"continue\"]")));
		Input_Element(driver.findElement(By.xpath("//input[@id=\"first_name\"]")), "Mathi");
		Input_Element(driver.findElement(By.xpath("//input[@id=\"last_name\"]")), "Lalitha");
		Input_Element(driver.findElement(By.xpath("//textarea[@id=\"address\"]")), "No 2/3 Logaiya Naidu street");
		Input_Element(driver.findElement(By.xpath("//input[@id=\"cc_num\"]")), "1234567809123698");
		DropDown(driver.findElement(By.xpath("//select[@id=\"cc_type\"]")), "text", "Master Card");
		DropDown(driver.findElement(By.xpath("//select[@id=\"cc_exp_month\"]")), "text", "August");
		DropDown(driver.findElement(By.xpath("//select[@id=\"cc_exp_year\"]")), "text", "2018");
		Input_Element(driver.findElement(By.xpath("//input[@id=\"cc_cvv\"]")), "999");
		Click_Element(driver.findElement(By.xpath("//input[@id=\"book_now\"]")));

	}

}
