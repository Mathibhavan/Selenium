package Concepts;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snip {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\721901\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/java/java_constructors.asp");
        driver.manage().window().maximize();
        
        TakesScreenshot ts = (TakesScreenshot)driver;
        File srcfile = ts.getScreenshotAs(OutputType.FILE);
        File destfile = new File("C:\\Users\\721901\\eclipse-workspace\\Selenium\\Snip\\test.png");
        FileUtils.copyFile(srcfile, destfile);
        
	}

}
