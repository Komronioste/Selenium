package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class NestedFrames extends BaseClass{

	public static void main(String[] args) throws InterruptedException {


		setUp();
		
		driver.switchTo().frame("frame1");
		
		WebElement childFrame = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(childFrame);
		
		WebElement p = driver.findElement(By.xpath("/html/body/p"));
		String pText = p.getText();
		System.out.println(pText);
		
		driver.switchTo().defaultContent();
		
		
		Thread.sleep(3000);
		tearDown();
		

	}

}
