package main;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class signin {
	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kasi.annapurna\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(" https://mobileworld.azurewebsites.net");
		driver.findElement(By.linkText("Log In")).click();
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.id("username")).sendKeys("anu");
		driver.findElement(By.id("password")).sendKeys("anu@123");
		driver.findElement(By.linkText("Log In")).click();
		driver.close();
	}

}
