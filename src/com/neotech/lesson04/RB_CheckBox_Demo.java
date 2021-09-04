package com.neotech.lesson04;

import java.lang.module.FindException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RB_CheckBox_Demo {

	public final static String url = "https://demoqa.com/automation-practice-form";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(url);
		
	

		WebElement male = driver.findElement(By.cssSelector("label[for='gender-radio-1']"));
		male.click();
		
		List<WebElement> gender = driver.findElements(By.cssSelector("label[for^='gender-radio']"));
		gender.get(2).click();
		
		
		
	}
}
