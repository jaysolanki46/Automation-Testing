package init;

import java.awt.AWTException;

import crowdpie.CrowdPie;
import gmail.Gmail;

public class InitMain {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		// Test case 1: www.crowdpie.com
		new CrowdPie("Git@test.com", "MyPassword", 998877);
		
		// Test case 2: www.gmail.com
		new Gmail("gmail@test.com", "MyPassword");
	}
}
