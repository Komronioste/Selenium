package com.neotech.lesson05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Homework02 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		
		setUp();
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("adminio");
	    driver.findElement(By.cssSelector("#txtPassword")).sendKeys("");
	    driver.findElement(By.cssSelector("#btnLogin")).submit();
	    
	  boolean msgDis =  driver.findElement(By.cssSelector("#spanMessage")).isDisplayed();
	  System.out.println("Is empty password message displayed? " + msgDis);
	    Thread.sleep(2000);
   
	    tearDown();
	}

}
