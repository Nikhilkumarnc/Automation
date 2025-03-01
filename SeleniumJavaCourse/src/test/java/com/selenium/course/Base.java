package com.selenium.course;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/");
		String act_title = driver.getTitle();

		if (act_title.equals("OpenCart - Open Source Shopping Cart Solution"))
			System.out.println("true");
		else
			System.out.println("false");
		
		//driver.close();
	}
}
