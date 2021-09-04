package com.neotech.lesson04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework01 {

	public final static String url = "https://amazon.com/";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(url);
		int i = 0;
		List<WebElement> links = driver.findElements(By.cssSelector(".nav-a"));
		System.out.println(links.size());
		
		for( WebElement el : links)
		{
			if(el.getText().length()>=1)
			System.out.println(el.getText());
			else
				i++;
		}
		System.out.println("Number of links with no text: " + i);
		System.out.println("Number of links with text: " + (links.size()-i));
	}

}
