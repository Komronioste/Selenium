package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCSSSelectorDemo {

	public final static String url = "https://signal-telecom.net/";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(url);
		
		driver.findElement(By.cssSelector("li.authorization-link")).click();

		driver.findElement(By.cssSelector("input[title='Email']")).sendKeys("roni.cost@example.com");
		
		driver.findElement(By.cssSelector("input#pass")).sendKeys("1224325");
		
	}

}
