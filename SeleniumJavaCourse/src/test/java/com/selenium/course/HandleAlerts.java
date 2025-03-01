package com.selenium.course;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();

//------// 1. Normal Alert.
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
//		Thread.sleep(1000);
//
//		Alert myAlert = driver.switchTo().alert();
//		System.out.println(myAlert.getText());
//		myAlert.accept();

////-----// 2. Confirmation Alert.
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
//		Thread.sleep(1000);
////		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
		
//------// 3. Prompt Alert
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		Thread.sleep(1000);
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Hello");
		promptAlert.accept();
		
		Thread.sleep(3000);
		driver.quit();
		System.out.println("Browser closed successfully😊");
	}

}
