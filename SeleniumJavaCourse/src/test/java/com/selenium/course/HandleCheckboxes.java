package com.selenium.course;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

//		// Scrolling webpage
		WebElement check1 = driver.findElement(By.xpath("//*[@id=\"sunday\"]"));
		((ChromiumDriver) driver).executeScript("arguments[0].scrollIntoView();", check1);
//		check1.click();

		// 1. select multiple check box
		// sp1: capture all the check boxes
		// sp2: use for loop and select each and every check box

		List<WebElement> checkboxes = driver
				.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		// enhanced 'for' loop for selecting all the check boxes
//			for (WebElement checkbox : checkboxes) {
//				checkbox.click();
//			}
//		}

		// 2. select last 3 check boxes.
		System.out.println("Total checkboxes are: " + checkboxes.size());
		for (int i = 4; i < checkboxes.size(); i++) {
			checkboxes.get(i).click();
		}

		Thread.sleep(3000);
		// 3. uns-elect the check boxes if they are selected.
		for (int i = 0; i < checkboxes.size(); i++) {
			if (checkboxes.get(i).isSelected())
				checkboxes.get(i).click();
		}

		Thread.sleep(2000);
		driver.quit();
		System.out.println("Driver closed successfully😊");
	}
}
