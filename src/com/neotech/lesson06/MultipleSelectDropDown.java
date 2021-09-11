package com.neotech.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class MultipleSelectDropDown extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		
		// change url in properties file
		
		setUp();
		
		//Let us locate multiple select drop down
		
		WebElement multiSelectDD = driver.findElement(By.id("countriesMultiple"));
		
		//create select object for that element
		
		Select selectDD = new Select(multiSelectDD);
		boolean isMulti = selectDD.isMultiple();
	System.out.println("is it multi: " + isMulti);
	
	if (isMulti) {
	List<WebElement> allOptions = selectDD.getOptions();
	
	for( WebElement option : allOptions)
	{
		String text = option.getText();
		selectDD.selectByVisibleText(text);
		
		Thread.sleep(2000);
	}
	}
	selectDD.deselectByIndex(1);
		tearDown();
		
		
		
		
	}

}
