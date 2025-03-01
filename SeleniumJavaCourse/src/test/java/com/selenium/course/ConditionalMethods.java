package com.selenium.course;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://materializecss.com/radio-buttons.html");

		// isDisplayed();
		boolean isDisplayed = driver.findElement(By.xpath("//*[@id=\"carbonads\"]/span/span/a[1]/img")).isDisplayed();
		System.out.println(isDisplayed);

		// isEnabled();
		boolean isEnabled = driver.findElement(By.xpath("//*[@id=\"radio\"]/form/p[1]/label/span")).isEnabled();
		System.out.println(isEnabled);

		boolean isSelected = driver.findElement(By.xpath("//*[@id=\"radio\"]/form/p[2]/label/span")).isSelected();
		System.out.println(isSelected);
	}

}

//1. isDisplayed()
//Purpose: Checks if a web element is visible on the page.
//Context: Useful for confirming that an element (like a button or a message) is present and visible to the user.


//2. isEnabled()
//Purpose: Checks if a web element is enabled (i.e., not disabled).
//Context: Commonly used to verify if a button or input field is actionable. For instance, before trying to click a button, you might want to ensure it is enabled.


//3. isSelected()
//Purpose: Checks if a checkbox or a radio button is selected.
//Context: Typically used in scenarios where you need to verify the state of form elements. For example, ensuring a checkbox is checked before proceeding with an action.
