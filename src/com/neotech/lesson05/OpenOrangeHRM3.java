package com.neotech.lesson05;

import com.neotech.utils.BaseClass;

public class OpenOrangeHRM3 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {

		//This line will open the browser and navigate to the specific url
		setUp();
		
		String title = driver.getTitle();
		System.out.println("title: " + title);
		Thread.sleep(3000);
		
		
		// This line will quit the browser
		tearDown();
		
	}

}
