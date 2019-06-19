package org.facebook.functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	
	public static WebDriver driver(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Eclipse 2018\\SeleniumPractice\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	return driver;
}
public static void loadurl(String url) {
	driver.get(url);
}
public static void type(WebElement element,String name) {
	element.sendKeys(name);
}
public static void btnclick(WebElement element) {
	element.click();
}
public static void quitBrowser() {
	driver.quit();
}
}