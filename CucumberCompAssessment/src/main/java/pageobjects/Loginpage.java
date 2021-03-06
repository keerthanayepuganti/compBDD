package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class Loginpage {

	public WebDriver driver;
	public ExtentTest test;
	public Loginpage(WebDriver driver,ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//header//a[@href='/account/login']")
	WebElement login;
	
	@FindBy(xpath="//input[@id='CustomerEmail']")
	WebElement emailid;
	
	@FindBy(xpath="//input[@id='CustomerPassword']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit'][1]")
	WebElement signinbutton;
	
//	@FindBy(xpath="//h3[contains(text(),'Account details')]")
//	WebElement login_validate;
	//https://www.bigsmall.in/challenge
	
	public WebElement Login_click()
	{
		return login;
	}
	
	public WebElement Email()
	{
		return emailid;
		
	}
	public WebElement Password()
	{
		return password;
		
	}
	
	public WebElement Sign_in()
	{
		return signinbutton;
		
	}
//	public WebElement Login_validate()
//	{
//		return login_validate;
//		
//	}
}
