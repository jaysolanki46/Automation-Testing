package init;

import java.awt.AWTException;

import crowdpie.CrowdPie;

public class InitMain {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		// www.crowdpie.com
		new CrowdPie("Git@test.com", "MyPassword", 998877);
		
	}
}
