/**
 * 
 */
package fb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author jayso
 *
 */
public class Facebook {

	private WebDriver driver;
	
	public Facebook(String email, String pass) throws AWTException, InterruptedException {
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("start-maximized", "--start-maximized", "--disable-web-security", "--no-proxy-server");
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		
		// Initialized drivers & libraries
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\libs\\chromedriver.exe");
		driver = new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("pass")).sendKeys(pass);
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(10000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
	}
}
