package com.bootcamp_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_Test {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		driver.findElement(By.id("input-firstname")).sendKeys("Km");
		driver.findElement(By.id("input-lastname")).sendKeys("Emon");
		driver.findElement(By.id("input-email")).sendKeys("kmemon@bootcamp.com");
		driver.findElement(By.id("input-telephone")).sendKeys("2027539875");
		driver.findElement(By.id("input-password")).sendKeys("kmemon$917305");
		driver.findElement(By.id("input-confirm")).sendKeys("kmemon$917305");
		driver.findElement(By.name("agree")).click();
		driver.close();
	
		
	
	}

}
