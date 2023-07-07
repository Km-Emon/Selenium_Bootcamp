package com.bootcamp_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.name("email")).sendKeys("kmemon.it07@gmail.com");
		driver.findElement(By.name("password")).sendKeys("SparkMax$917305");
		driver.findElement(By.name("password")).click();
		
		
		

	}

}
