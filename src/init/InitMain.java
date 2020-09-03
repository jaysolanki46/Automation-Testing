package init;

import java.awt.AWTException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import fb.Facebook;

public class InitMain {
	
	public static void main(String[] args) throws InterruptedException, AWTException, FileNotFoundException {
		
		String credentialsDetails = "";
		File file = new File(System.getProperty("user.dir") + "\\credentials.txt"); 
		Scanner sc = new Scanner(file); 

		while (sc.hasNextLine()) 
		     credentialsDetails = sc.nextLine(); 
		
		String[] currencies = credentialsDetails.split(";");
		String username = currencies[0];
		String pass = currencies[1];
		System.err.println(username + "=" + pass);
		
		// Test case 1: www.crowdpie.com
		//new CrowdPie("Git@test.com", "MyPassword", 998877);
		
		// Test case 2: www.facebook.com
		new Facebook(username, pass);
		
		// Test case 3: www.gmail.com
		//new Gmail("jaysolanki46@gmail.com", "");
	}
}
