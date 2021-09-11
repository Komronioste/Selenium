package com.neotech.lesson06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class Homework03 extends BaseClass
{

	
 public static void main(String[] args) throws InterruptedException {
	
	 
	 setUp();
	 
	 driver.manage().window().maximize();
	 
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]")).click();
	 
	 Thread.sleep(10000);

	 driver.findElement(By.id("item-1")).click();
	 
	 driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
	 
	 Alert al = driver.switchTo().alert();
	 
	 al.accept();
}
	
}
