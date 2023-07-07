package com.bootcamp_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_Product_Test {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[1]/h4/a")).sendKeys("HP LP3065");
		driver.findElement(By.id("search")).click();
		driver.quit();
		
		

	}

}
