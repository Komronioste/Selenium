package com.neotech.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Task01 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		Select days = new Select(driver.findElement(By.id("day")));
		List<WebElement> dayz = days.getOptions();

		String daysResult = (dayz.size() == 31) ? "Month test passed" : "test failed";
		System.out.println(daysResult);
		System.out.println(dayz.size());

		Select months = new Select(driver.findElement(By.id("month")));
		List<WebElement> monthz = months.getOptions();
		String monthsResult = (monthz.size() == 12) ? "Month test passed" : "Month test failed";
		System.out.println(monthsResult);

		Select years = new Select(driver.findElement(By.id("year")));
		List<WebElement> yearz = years.getOptions();
		String yearzResult = (yearz.size() == 117) ? "Year test passed" : "Year test failed";
		System.out.println(yearzResult);

		days.selectByValue("25");
		months.selectByValue("9");
		years.selectByValue("2005");

		Thread.sleep(3000);

//		tearDown();

	}

}
