package com.neotech.lesson02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework01 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/newtours/");

		driver.manage().window().maximize();

		driver.findElement(By.linkText("REGISTER")).click();

		driver.findElement(By.name("firstName")).sendKeys("James");

		driver.findElement(By.name("lastName")).sendKeys("Bond");

		driver.findElement(By.name("phone")).sendKeys("007");

		driver.findElement(By.id("userName")).sendKeys("bondJamesBond@mi6.uk");

		driver.findElement(By.name("address1")).sendKeys("Baker Street 05");

		driver.findElement(By.name("city")).sendKeys("London");

		driver.findElement(By.name("state")).sendKeys("Chelsea");

		driver.findElement(By.name("postalCode")).sendKeys("000777");

		Select select = new Select(driver.findElement(By.name("country")));
		driver.findElement(By.name("country")).click();
		List<WebElement> options = select.getOptions();
		select.selectByValue("UNITED KINGDOM");

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("BondJames");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("3123123");

		driver.findElement(By.name("confirmPassword")).sendKeys("3123123");

		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		driver.findElement(By.name("submit")).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		driver.close();

	}

}
