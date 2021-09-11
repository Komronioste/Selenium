package com.neotech.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Homework01 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		

		driver.findElement(By.className("nav-search-scope")).click();
        Select selects = new Select(driver.findElement(By.id("searchDropdownBox")));
        List<WebElement> allOptions = selects.getOptions();
        System.out.println("Departments available: " + allOptions.size());

        Thread.sleep(2000);
        for(WebElement el : allOptions)
        {	System.out.println(el.getText());
        
        if (el.getText().equalsIgnoreCase("Computers"))
        	el.click();
        }
        
		Thread.sleep(2000);

		tearDown();
		
	}

}
