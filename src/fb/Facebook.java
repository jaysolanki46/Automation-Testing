/**
 * 
 */
package fb;

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
public class Facebook {

	private WebDriver driver;
	
	public Facebook(String email, String pass) {
		// Initialized drivers & libraries
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\libs\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("pass")).sendKeys(pass);
		
		driver.findElement(By.name("login")).click();
		
	}
}
