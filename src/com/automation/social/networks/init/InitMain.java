package com.automation.social.networks.init;

import com.automation.social.networks.Gmail;

public class InitMain {
	
	public static void main(String[] args) {
		
		Gmail gmail = new Gmail();
		gmail.login();
	}
}
