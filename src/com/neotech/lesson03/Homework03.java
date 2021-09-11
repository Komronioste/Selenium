package com.neotech.lesson03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework03 {

	public final static String url = "http://demo.guru99.com/test/newtours/";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
	

		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@href='register.php']")).click();

		driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"))
				.sendKeys("James");

		driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input"))
				.sendKeys("Bond");

		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("007");

		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("bondJamesBond@mi6.uk");

		driver.findElement(By.xpath("//input[contains(@name, 'addre')]")).sendKeys("Baker Street 05");

		driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[8]/td[2]/input"))
				.sendKeys("London");

		driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input"))
				.sendKeys("Chelsea");

		driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input"))
				.sendKeys("000777");

		Select select = new Select(driver.findElement(By.name("country")));
		driver.findElement(By.name("country")).click();
		List<WebElement> options = select.getOptions();
		select.selectByValue("UNITED KINGDOM");

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("BondJames");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("3123123");

		driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input"))
				.sendKeys("3123123");

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
		
		

//		driver.close();

	}

}
