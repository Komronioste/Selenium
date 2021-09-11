package com.neotech.lesson06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class AlertDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		setUp();
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("alert")).click();
		
		Thread.sleep(2000);
		
//		driver.findElement(By.id("confirm"));
		
		//if the alert is not handled(closed) and we try to interact with other elements, we will get UnhandledAlertException
		
		
		//handling simple alerts
		Alert simpleAlert = driver.switchTo().alert();
		String alertText = simpleAlert.getText();
		System.out.println("alert text is: " + alertText);
		simpleAlert.accept();
		tearDown();

	}

}
