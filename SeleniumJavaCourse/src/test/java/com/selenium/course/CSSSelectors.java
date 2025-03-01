package com.selenium.course;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectors {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/search");
		driver.manage().window().maximize();
		
		// tag id
//		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		
		// tag class
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");

		//tag attribute
		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-shirts");
	}

}
