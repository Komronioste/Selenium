package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class FrameDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {


		setUp();
		
		driver.switchTo().frame(0);
		WebElement nameText = driver.findElement(By.id("name"));
		nameText.sendKeys("Elion");
		
		
		Thread.sleep(3000);
		
		tearDown();

	}

}
