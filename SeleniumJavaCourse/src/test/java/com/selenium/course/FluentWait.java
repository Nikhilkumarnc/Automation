//package com.selenium.course;
//
//import java.time.Duration;
//import java.util.NoSuchElementException;
//import java.util.function.Function;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Wait;
////import org.openqa.selenium.support.ui.FluentWait;
//
//public class FluentWait {
//
//	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
//
//		// FluentWait declaration
//		Wait<WebDriver> wait = (Wait<WebDriver>) new FluentWait().withTimeout(Duration.ofSeconds(30);
//
//		driver.manage().window().maximize();
//
//		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
//			public WebElement apply(WebDriver driver) {
//				return driver.findElement(By.id("element_id")); // Your condition
//			}
//		});
//	}
//
//	private Object withTimeout(Duration ofSeconds) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//}