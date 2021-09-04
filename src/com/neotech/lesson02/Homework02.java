package com.neotech.lesson02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework02 {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg/?rs=3&privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjMwMzAyNjE3LCJjYWxsc2l0ZV9pZCI6NzMxOTQxNDIwNzMyOTEwfQ%3D%3D/");
		
//		WebElement registerButton = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
//		registerButton.click();
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.click();
		firstname.sendKeys("Elion");
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Limanaj");
		
		WebElement phonenumber = driver.findElement(By.name("reg_email__"));
		phonenumber.sendKeys("jamesbond@neotech.com");
		
		Thread.sleep(1000);
		
		WebElement phonenumberConf = driver.findElement(By.name("reg_email_confirmation__"));
		phonenumberConf.sendKeys("jamesbond@neotech.com");
		
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("MI6");
		
						
		WebElement monthButton = driver.findElement(By.id("month"));
		monthButton.click();
		
		
		Select selectMonth = new Select(driver.findElement(By.id("month")));
		List<WebElement> monthOptions = selectMonth.getOptions();
		selectMonth.selectByValue("12");
		
		
		WebElement dayButton = driver.findElement(By.id("day"));
		dayButton.click();
		
		Select selectDay = new Select(driver.findElement(By.id("day")));
		List<WebElement> dayOptions = selectDay.getOptions();
		selectDay.selectByValue("31");
		
		WebElement yearButton = driver.findElement(By.id("year"));
		
		Select selectYear = new Select(driver.findElement(By.id("year")));
		List<WebElement> yearOptions = selectYear.getOptions();
		selectYear.selectByValue("1945");
		
		
		List<WebElement> sex = driver.findElements(By.name("sex"));
		sex.get(1).click();
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("you interrupted my SLEEP!!!");
			e.printStackTrace();
		}
		
		WebElement submitButton = driver.findElement(By.name("websubmit"));
		submitButton.click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("you interrupted my SLEEP!!!");
			e.printStackTrace();
		}
		
		driver.navigate().to("https://ibb.co/fFWp1FC");
		
		Thread.sleep(4000);
		
		driver.close();
		
		System.out.println("Test Passed!");
		
		
	}

}
