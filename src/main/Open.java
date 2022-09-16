package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Open {
	WebDriver driver;
	
	public Open(WebDriver driver){
		// TODO Auto-generated method stub
			this.driver=driver;
			PageFactory.initElements(driver,this);	
		}
	@FindBy(css="button[type='submit']")
	WebElement button; //applied for signin button
	@FindBy(id="username")
	WebElement usernameele;
	
	@FindBy(id="password")
	WebElement passwordele;
	
	@FindBy(linkText="Log In")
	WebElement submit;
	@FindBy(id="home")
	WebElement text;
	@FindBy(id="home")
	WebElement Home;
	public void signin(String username,String password) throws InterruptedException {
		button.click();
		delay();
		usernameele.sendKeys(username);
		delay();
		passwordele.sendKeys(password);
		delay();
		submit.click();
		text.getText();
		quit();
	}
	@FindBy(id="home")
	WebElement home1;
	@FindBy(id="navbarDropdown")
	WebElement latest;//before lenovo and before apple repeated
	@FindBy(partialLinkText="Samsung")
	WebElement samsung;
	@FindBy(partialLinkText="More Details")
	WebElement MoreDetails;
	
	@FindBy(className="nav-link")
	WebElement buy;//for apple also
	
	@FindBy(partialLinkText="Lenovo")
	WebElement lenovo;
	
	@FindBy(partialLinkText="Apple")
	WebElement apple;
	
	@FindBy(xpath="//a[@id='navbarDropdown'][contains(.,'Support')]")
	WebElement support;
	
	@FindBy(partialLinkText="Order")
	WebElement order;
	
	@FindBy(partialLinkText="Contact Us")
	WebElement contactus;
	
	@FindBy(className="footeer")
	WebElement footer;
	
	@FindBy(xpath="//footer//a[@href=\"index.html\"]")
	WebElement footerhome;
	
	@FindBy(xpath="//footer//a[@href=\"mobile.html\"]")
	WebElement footermobile;
	
	
	@FindBy(xpath="//footer//a[@href=\"order.html\"]")
	WebElement footerorder;
	@FindBy(partialLinkText="Terms & Conditions")
	WebElement Footerterms;
	@FindBy(partialLinkText="Privacy Policy")
	WebElement Privacy;
	
	@FindBy(partialLinkText="Contact Us")
	WebElement FoContact;
	
	@FindBy(xpath="//footer//a[@href=\"sign.html\"]")
	WebElement footersignin;
	
	public void home() throws InterruptedException {
		System.out.println(home1.getText());
		latest.click();
		delay();
		samsung.click();
		MoreDetails.click();
		delay();
		buy.click();
		latest.click();
		lenovo.click();
		delay();
		latest.click();
		apple.click();
		delay();
		buy.click();
		support.click();
		delay();
		Set<String> windowHandles = driver.getWindowHandles();//parentid.child
		List<String> windowHandlesList = new ArrayList<>(windowHandles);
		System.out.println(driver.getWindowHandle());
		order.click();
		System.out.println(driver.getWindowHandle());
		System.out.println("Total window number: " + windowHandlesList.size() + "\n");
		//driver.switchTo().window(windowHandlesList.get(1));
		home1.click();
		support.click();
		delay();
		contactus.click();
		footerhome.click();
		footermobile.click();
		delay();
		footerorder.click();
		System.out.println(driver.getWindowHandle());
		Footerterms.click();
		Privacy.click();
		delay();
		FoContact.click();
		footersignin.click();
		delay();
		quit();
		
	}
	
	
    
    @FindBy(partialLinkText="Sign up") 
    WebElement signup;
    
    @FindBy(id="myName")
    WebElement firstname;
    
    @FindBy(css="input[placeholder='Last Name']")
    WebElement lastname;
    
    @FindBy(css="input[placeholder='Enter Email']")
    WebElement email;
    
    @FindBy(css="input[placeholder='Password']")
    WebElement singuppassword;
    
    @FindBy(css="input[type='date']")
    WebElement date;
    @FindBy(css="div[class='col-md-2'] input[name='gender']")
    WebElement male;
    
    @FindBy(css="div[class='col-md-3'] input[name='gender']")
    WebElement lady;
    
    @FindBy(css="input[placeholder='91XXXXXXXXXX']")
    WebElement mobile;
    
    @FindBy(css="textarea[placeholder='Short Bio']")
    WebElement shortbio;
    
    @FindBy(xpath="//button[normalize-space()='Register']")
    WebElement register;
    @FindBy(xpath="//button[normalize-space()='Sign In']")
    WebElement regsignin;
    
    
    
    @BeforeTest
    public void signup(String fname,String lname,String mail,String uppwd,String gender,String dob,String phone,String bio) throws InterruptedException
    {	
    	
    	String gen="female";
    	String x=gender;
        button.click();
        signup.click();
        delay();
        firstname.sendKeys(fname);
        lastname.sendKeys(lname);
        delay();
        email.sendKeys(mail);
        singuppassword.sendKeys(uppwd);
        delay();
        date.sendKeys(dob);
        System.out.println(x.equalsIgnoreCase(gen));
        if(x.equalsIgnoreCase(gen))
        	lady.click();
        else
        	male.click();
        
        mobile.sendKeys(phone);
        delay();
        shortbio.sendKeys(bio);
        register.click();
        alert();
        delay();
        regsignin.click();
        driver.switchTo().alert().accept();
        quit();
        //alert();
        
        //alert();
        
        
    }
	public void quit() {
		driver.quit();
	}
	public void delay() throws InterruptedException {
		Thread.sleep(1000);
	}
	public void alert() {
		
		driver.switchTo().alert().accept();	
	}
	public void checkequals() {
		
	}
	
}


