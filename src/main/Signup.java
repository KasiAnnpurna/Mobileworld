package main;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Signup{
	@BeforeTest
	public void Sign_up() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kasi.annapurna\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		//open();
		//Open open=new Open(driver);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		//delay();
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.id("myName")).sendKeys("anu");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("s");
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("anu@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("anu@123");
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("07/05/2000");
		driver.findElement(By.xpath("//div[@class='col-md-3']//input[@name='gender']")).click();
		driver.findElement(By.xpath("//input[@placeholder='91XXXXXXXXXX']")).sendKeys("9876543210");
		driver.findElement(By.cssSelector("textarea[placeholder='Short Bio']")).sendKeys("hii");
		driver.findElement(By.xpath("//button[normalize-space()='Register']")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();	//alert();
		//delay();
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();	
		driver.switchTo().alert().accept();	
		driver.quit();
	}
	/*@Test
	public void signin() throws InterruptedException {
		// TODO Auto-generated method stub
		//sign in
		//open();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kasi.annapurna\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mobileworld.azurewebsites.net/");
		//open();
		Open open=new Open(driver);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.id("username")).sendKeys("anu");
		driver.findElement(By.id("password")).sendKeys("anu@123");
		//delay();
		driver.findElement(By.linkText("Log In")).click();
		System.out.println(driver.findElement(By.id("home")).getText());
		driver.quit();
	}	
	@AfterTest
	public void home() throws InterruptedException {
		//
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kasi.annapurna\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mobileworld.azurewebsites.net/");
		//open();
		Open open=new Open(driver);
		//delay();
		System.out.println(driver.findElement(By.id("home")).getText());
		driver.findElement(By.id("navbarDropdown")).click();
		//delay();
		driver.findElement(By.linkText("Samsung")).click();
		//delay();
		driver.findElement(By.linkText("More Details")).click();
		//delay();
		driver.findElement(By.className("nav-link")).click();
		
		driver.findElement(By.id("navbarDropdown")).click();
		//delay();
		driver.findElement(By.linkText("Lenovo")).click();
		driver.findElement(By.id("navbarDropdown")).click();
		//delay();
		driver.findElement(By.linkText("Apple")).click();
		//driver.findElement(By.xpath("//button[@id='btn-back-to-top'][1]")).click();
		driver.findElement(By.className("nav-link")).click();
		//delay();
		driver.findElement(By.xpath("//a[@id='navbarDropdown'][contains(.,'Support')]")).click();
		
		System.out.println("first window:"+driver.getWindowHandle());
		driver.findElement(By.linkText("Order")).click();
		Set<String> windowHandles = driver.getWindowHandles();//parentid.child
		List<String> windowHandlesList = new ArrayList<>(windowHandles);
		
		System.out.println("Total window number: " + windowHandlesList.size() + "\n");
		driver.switchTo().window(windowHandlesList.get(1));
		System.out.println("Second window:"+driver.getWindowHandle());

				
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
		System.out.println("Total window number: " + windowHandlesList.size() + "\n");
		//driver.switchTo().window(windowHandlesList.get(0));
		System.out.println(driver.getWindowHandle());
		
		System.out.println(driver.findElement(By.id("home")).getText());
		driver.findElement(By.xpath("//a[@id='navbarDropdown'][contains(.,'Support')]")).click();
		driver.findElement(By.linkText("Contact Us")).click();
		System.out.println("Total window number: " + windowHandlesList.size() + "\n");
		//driver.switchTo().window(windowHandlesList.get(0));
		System.out.println(windowHandlesList);
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.findElement(By.className("footer")).getText());
		driver.findElement(By.xpath("//footer//a[@href=\"index.html\"]")).click();
		driver.findElement(By.xpath("//footer//a[@href=\"mobile.html\"]")).click();
		System.out.println("Total window number: " + windowHandlesList.size() + "\n");
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.xpath("//footer//a[@href=\"order.html\"]")).click();
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.linkText("Terms & Conditions")).click();
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.linkText("Privacy Policy")).click();
		driver.findElement(By.linkText("Contact Us")).click();
		driver.findElement(By.xpath("//footer//a[@href=\"sign.html\"]")).click();
		System.out.println(driver.getWindowHandle());
		driver.switchTo()
		driver.quit();
		
		
	}*/

}
