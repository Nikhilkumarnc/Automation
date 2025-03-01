package com.selenium.course;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticatedPopup {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");	// injecting username(admin) and password(admin) aling with the website
		driver.manage().window().maximize();
		
		
	}

}
