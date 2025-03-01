package com.selenium.course;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();

		// switching to frame1
		WebElement frame1 = driver.findElement(By.xpath("/html[1]/frameset[1]/frame[1]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//*[@id=\"id1\"]/div/input")).sendKeys("welcome");

		// switching back to the web page
		driver.switchTo().defaultContent();

		// switching to frame2
		WebElement frame2 = driver.findElement(By.xpath("/html/frameset/frameset/frame[1]"));
		driver.switchTo().frame(frame2).getCurrentUrl();
		driver.findElement(By.xpath("/html/body/form/div/input")).sendKeys("Selenium");

		driver.switchTo().defaultContent();

		// switching to frame3
		WebElement frame3 = driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//*[@id=\"id3\"]/div/input")).sendKeys("Java");

		// switching to inner frame using index. use index, only if there is only one frame inside frame/web page
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id=\"i8\"]")).click();

		driver.switchTo().defaultContent();

		Thread.sleep(4000);
		driver.quit();
		System.out.println("Browser closed successfully😊");
	}

}
