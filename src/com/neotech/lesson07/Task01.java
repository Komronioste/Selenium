package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Task01 extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.switchTo().frame("frame1");
		WebElement frameOne = driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]"));
	String frameOneTxt = frameOne.getText();
		
		System.out.println(frameOneTxt);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
	String frameTwoTxt = driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]")).getText();
		System.out.println(frameTwoTxt);
		
		driver.switchTo().defaultContent();
		
		String verify = (frameOneTxt.equals(frameTwoTxt)) ? "same" : "different";
		System.out.println(verify);
		
		Thread.sleep(3000);
		
		tearDown();
	}

}
