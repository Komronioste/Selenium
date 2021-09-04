package com.neotech.lesson02;

public class Chromedriver implements Webdriver{

	
	public Chromedriver() {
		System.out.println("Opening chrome browser");
	}
	
	
	@Override
	public void get(String url) {
		System.out.println("chrome navigates to " + url);
		
	}

	@Override
	public String getTitle() {
		System.out.println("Chrome gets the title of the page");
		return "Page Title";
	}

	@Override
	public String getCurrentUrl() {
		System.out.println("Chrome gets the current URL");
		return "Page url";
	}

	@Override
	public void close() {
		System.out.println("Chrome closing current tab");
		
	}


	@Override
	public void quit() {
		System.out.println("Chrome closing ALL tabs");
		
	}

}
