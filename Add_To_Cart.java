package com.bootcamp_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Add_To_Cart {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit .SECONDS);
		driver.manage().deleteAllCookies();
		WebElement searchbar = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		searchbar.sendKeys("iPhone 14 pro max");
		WebElement buttonSearch = driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
		buttonSearch.click();
		driver.get("https://www.amazon.com/Apple-iPhone-14-Pro-Max/dp/B0BN94DL3R/ref=sr_1_1?crid=HKBVBWEBAWAP&keywords=iphone+14+pro+max&qid=1688098336&sprefix=iphone%2Caps%2C117&sr=8-1");
		WebElement addToCart = driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]"));
		addToCart.click();
		
	
		
		
		
																															

	}

}
