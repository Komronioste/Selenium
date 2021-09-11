package com.neotech.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class DropDownDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

setUp();

driver.findElement(By.id("txtUsername")).sendKeys("Admin");
driver.findElement(By.id("txtPassword")).sendKeys("admin123");
driver.findElement(By.id("btnLogin")).click();

driver.findElement(By.id("menu_directory_viewDirectory")).click();
WebElement ddTitle = driver.findElement(By.id("searchDirectory_job_title"));
Select selDDTitle = new Select(ddTitle);

ddTitle.click();

Thread.sleep(2000);

selDDTitle.selectByValue("8");

List<WebElement> options = selDDTitle.getOptions();
System.out.println(options.size());

for ( int i = 0; i< options.size(); i++)
{
	selDDTitle.selectByIndex(i);
	Thread.sleep(1000);
}

Select selDDLocation = new Select(driver.findElement(By.id("searchDirectory_location")));
selDDLocation.selectByIndex(2);

driver.findElement(By.id("searchBtn")).click();

Thread.sleep(2000);

tearDown();

		
	}

}
