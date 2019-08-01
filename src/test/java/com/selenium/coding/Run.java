package com.selenium.coding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Run {
@Test
public void get() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KUNAL BHATTA\\Desktop\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://jio.com");
	String s=driver.getTitle();
	System.out.println(s);
	System.out.println("get result");
	System.out.println("get show");
	System.out.println("get cappacino");
}
}
