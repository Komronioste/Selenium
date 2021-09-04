package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("neotech@gmail.com");  //finding login text bar on that website and inputing email in that box
		
		driver.findElement(By.id("pass")).sendKeys("NeoTechAcademy2020"); //typing password
		
//		driver.findElement(By.id("u_0_d_Zu")).click(); // wont work because facebook always changes id for loging button with every refresh
		
//		driver.findElement(By.name("login")).click();
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		driver.findElement(By.linkText("Forgot Password?")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
