package com.selenium.course;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class HandleMultipleWindows {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("OrangeHRM, Inc"));

		// Capturing multiple windows IDs
		Set<String> windowsIDs = driver.getWindowHandles(); // getWindowHandles(); returns set of collection in the
															// format of string

		// Using for loop to extract set collection values
		for (String winID : windowsIDs) {
			String title = driver.switchTo().window(winID).getTitle();
			if (title.equals("OrangeHRM")) {
				System.out.println(driver.getTitle());
			}
		}
	}
}