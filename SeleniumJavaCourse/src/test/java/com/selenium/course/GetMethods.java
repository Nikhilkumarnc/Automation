package com.selenium.course;

//import java.sql.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);

//		String windowID = driver.getWindowHandle();
//		System.out.println("window ID: " + windowID); 	// every time browser id will change(Dynamic)

		driver.findElement(By.linkText("OrangeHRM, Inc"));

	}

}
