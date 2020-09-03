package init;

import java.awt.AWTException;

import crowdpie.CrowdPie;
import fb.Facebook;
import gmail.Gmail;

public class InitMain {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		// Test case 1: www.crowdpie.com
		//new CrowdPie("Git@test.com", "MyPassword", 998877);
		
		// Test case 2: www.facebook.com
		new Facebook("######", "********");
		
		// Test case 3: www.gmail.com
		//new Gmail("jaysolanki46@gmail.com", "");
	}
}
