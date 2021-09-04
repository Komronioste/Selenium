package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {

	public final static String url = "https://www.facebook.com/";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		Keys.chord(Keys.CONTROL + "T");
		
		Thread.sleep(1200);
		driver.get(url);
		
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("trinity@neotech.com");
		driver.findElement(By.cssSelector("input[class$='9npi']")).sendKeys("morphius");
		driver.findElement(By.cssSelector("button[id^='u_0']")).submit();
		
	String id=	driver.findElement(By.cssSelector("input#email")).getAttribute("class");
		System.out.println(id);
		Thread.sleep(2222);
		
		
		driver.close();
		

	}

}
