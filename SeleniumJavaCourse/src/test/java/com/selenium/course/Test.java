package com.selenium.course;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		WebElement check1 = driver.findElement(By.xpath("//*[@id=\"sunday\"]"));

		// scrolling Web age
		((ChromiumDriver) driver).executeScript("arguments[0].scrollIntoView();", check1);

		check1.click();
	}

}
