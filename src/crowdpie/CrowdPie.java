package crowdpie;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrowdPie {

	private Integer digit = 0;
	private Integer reverseCode = 0;
	private WebDriver driver;
	private Robot robot;
	
	public CrowdPie(String email, String pass, Integer code) throws InterruptedException, AWTException {
		
		// Initialized drivers & libraries
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+ "\\libs\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.crowdpie.com/scp/");
		robot = new Robot();
		
		// Reading web elements email
		WebElement emailField = driver.findElement(By.tagName("vaadin-email-field"));
		emailField.sendKeys(email);

		// Reading web element password
		WebElement passwordField = driver.findElement(By.tagName("vaadin-password-field"));
		passwordField.sendKeys(pass);
		
		// Reading web element login button
		WebElement loginBtn = driver.findElement(By.tagName("vaadin-button"));
		Thread.sleep(2000);
		loginBtn.click();
		
		/* Unable to caught web elements? No problem, 
		Use `Robot` class to access keyboard keys right away*/ 
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		
		while(code > 0) {
			digit = code % 10;
			reverseCode = (reverseCode * 10) + digit;
			code = code / 10;
		}
		
		digit = 0;
		
		while(reverseCode > 0) {
			digit = reverseCode % 10;
			
			switch (digit) {
			case 0:
				robot.keyPress(KeyEvent.VK_0); Thread.sleep(500);
				break;
			case 1:
				robot.keyPress(KeyEvent.VK_1); Thread.sleep(500);
				break;
			case 2:
				robot.keyPress(KeyEvent.VK_2); Thread.sleep(500);
				break;
			case 3:
				robot.keyPress(KeyEvent.VK_3); Thread.sleep(500);
				break;
			case 4:
				robot.keyPress(KeyEvent.VK_4); Thread.sleep(500);
				break;
			case 5:
				robot.keyPress(KeyEvent.VK_5); Thread.sleep(500);
				break;
			case 6:
				robot.keyPress(KeyEvent.VK_6); Thread.sleep(500);
				break;
			case 7:
				robot.keyPress(KeyEvent.VK_7); Thread.sleep(500);
				break;
			case 8:
				robot.keyPress(KeyEvent.VK_8); Thread.sleep(500);
				break;
			case 9:
				robot.keyPress(KeyEvent.VK_9); Thread.sleep(500);
				break;
			default:
				break;
			}
			
			reverseCode = reverseCode / 10;
		}
		
	    robot.keyPress(KeyEvent.VK_ENTER);
	}
}
