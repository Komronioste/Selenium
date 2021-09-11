package com.neotech.lesson06;

import java.util.List;

import javax.swing.Scrollable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Homework02 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {

setUp();

driver.manage().window().maximize();

Thread.sleep(2000);


JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,1400)", "");




WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div"));
dropdown.click();

Thread.sleep(2000);

Select selDD = new Select(driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/select")));
List<WebElement> ddEl = selDD.getOptions();
System.out.println(ddEl.size());
System.out.println(selDD.isMultiple());


//List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div"));
List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/div[2]"));
//selDD.selectByIndex(1);
for (int i = 0 ; i < elements.size(); i++)
{
//	if(el.getText().equals("CSS") || el.getText().equals("HTML"))
	
	elements.get(i).click();
	

}
	
	




//tearDown();

		
	}

}
