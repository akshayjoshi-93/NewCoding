package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentakshita {

	public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			
			driver.get("https://www.google.co.in/");
			
			WebElement serchbox = driver.findElement(By.className("gLFyf"));
			serchbox.sendKeys("upwork.com");
			serchbox.sendKeys(Keys.ENTER);
			driver.get("https://www.upwork.com/nx/signup/?dest=home");
			driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/div/div/div[1]/fieldset/div/div[2]/div/div[1]/label/span")).click();
			driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/div/div/div[2]/button")).click();
			driver.findElement(By.xpath("//*[@id=\"first-name-input\"]")).sendKeys("akshay");
			driver.findElement(By.xpath("//*[@id=\"last-name-input\"]")).sendKeys("joshi");
			driver.findElement(By.xpath("//*[@id=\"redesigned-input-email\"]")).sendKeys("joshiakshay2310@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"password-input\"]")).sendKeys("Akshay@#321");
			driver.findElement(By.xpath("//*[@id=\"dropdown-label-7\"]/div/span")).sendKeys("india");
			WebElement radioButton = driver.findElement(By.xpath("//div[@class='up-checkbox']//span[@class='up-checkbox-replacement-helper']"));
			radioButton.click();
			
			
			
			
			
			
			
			

			

	}

}
