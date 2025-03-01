package com.selenium.course;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");

		// name
//		driver.findElement(By.name("search")).sendKeys("Mac");

		// id
//		boolean isDisplayedLogo = driver.findElement(By.id("logo")).isDisplayed();
//		System.out.println(isDisplayedLogo);

		// linkText
//		driver.findElement(By.linkText("Tablets")).click();

		// className
//		List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));
//		System.out.println("total header links: " + headerLinks.size());
		
		// tagName
//		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
//		System.out.println("total links: " + totalLinks.size());
		
		
	}

}
