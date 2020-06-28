package crowdpie;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrowdPie {

	public CrowdPie(String email, String pass) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	  
		driver.manage().window().maximize();
		driver.get("https://www.crowdpie.com/scp/");
		
		WebElement emailField = driver.findElement(By.tagName("vaadin-email-field"));
		WebElement passwordField = driver.findElement(By.tagName("vaadin-password-field"));
		
		
		emailField.sendKeys(email);
		passwordField.sendKeys(pass);
		
		WebElement loginBtn = driver.findElement(By.tagName("vaadin-button"));
		Thread.sleep(2000);
		loginBtn.click();
		
		Robot robot = new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);    
	    robot.keyPress(KeyEvent.VK_9); Thread.sleep(500);
	    robot.keyPress(KeyEvent.VK_9); Thread.sleep(500);
	    robot.keyPress(KeyEvent.VK_8); Thread.sleep(500);
	    robot.keyPress(KeyEvent.VK_8); Thread.sleep(500);
	    robot.keyPress(KeyEvent.VK_7); Thread.sleep(500);
	    robot.keyPress(KeyEvent.VK_7); Thread.sleep(500);
	    robot.keyPress(KeyEvent.VK_ENTER);
	}
}
