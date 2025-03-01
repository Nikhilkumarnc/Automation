package com.selenium.course;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException {

		WebDriver driver = new ChromeDriver();

//		driver.navigate().to("https://demo.nopcommerce.com/"); // Accepts URL in both string and URL object format
		// or
		driver.get("https://demo.nopcommerce.com/"); // Accepts URL only in the string format
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());

		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());

		driver.navigate().refresh();
	}

}
