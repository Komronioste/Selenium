package com.neotech.lesson02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterToFacebook {

	String firstName;
	String lastName;
	String phoneNumber;

	String dayOfBirth;
	String monthOfBirth;
	String yearOfBirth;
	String pass;
	
	
	public static void registerFB(String firstName, String lastName, String phoneNumber, String pass, String dayOfBirth, String monthOfBirth, String yearOfBirth)
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg/?rs=3&privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjMwMzAyNjE3LCJjYWxsc2l0ZV9pZCI6NzMxOTQxNDIwNzMyOTEwfQ%3D%3D");
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys(firstName);
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys(lastName);
		
		WebElement phonenumber = driver.findElement(By.name("reg_email__"));
		phonenumber.sendKeys(phoneNumber);
		
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys(pass);
		
						
		WebElement monthButton = driver.findElement(By.id("month"));
		monthButton.click();
		
		
		Select selectMonth = new Select(driver.findElement(By.id("month")));
		List<WebElement> monthOptions = selectMonth.getOptions();
		selectMonth.selectByValue(monthOfBirth);
		
		
		WebElement dayButton = driver.findElement(By.id("day"));
		dayButton.click();
		
		Select selectDay = new Select(driver.findElement(By.id("day")));
		List<WebElement> dayOptions = selectDay.getOptions();
		selectDay.selectByValue(dayOfBirth);
		
		WebElement yearButton = driver.findElement(By.id("year"));
		
		Select selectYear = new Select(driver.findElement(By.id("year")));
		List<WebElement> yearOptions = selectYear.getOptions();
		selectYear.selectByValue(yearOfBirth);
		
		
		List<WebElement> sex = driver.findElements(By.name("sex"));
		sex.get(1).click();
		
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			System.out.println("you interrupted my SLEEP!!!");
			e.printStackTrace();
		}
		
		WebElement submitButton = driver.findElement(By.name("websubmit"));
		submitButton.click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			System.out.println("you interrupted my SLEEP!!!");
			e.printStackTrace();
		}
		
		driver.close();
	}
	
	public static void main(String[] args) {
		
//		registerFB("Kom", "Baba", "123456789", "helloWorld", "1", "1", "1999");
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement firstName = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		firstName.click();
	}
}
