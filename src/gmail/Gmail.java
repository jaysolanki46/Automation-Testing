/**
 * 
 */
package gmail;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author jayso
 *
 */
public class Gmail {

	private WebDriver driver;
	
	public Gmail(String email, String pass) {
		// Initialized drivers & libraries
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\libs\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin");
		
		driver.findElement(By.id("identifierId")).sendKeys(email);
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();        

		// Password field coming soon .........
		
	}
}
