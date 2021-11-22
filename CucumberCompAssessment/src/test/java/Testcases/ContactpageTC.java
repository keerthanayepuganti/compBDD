package Testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Contactpage;
import utilities.BaseTest;

public class ContactpageTC extends BaseTest{
	public static Logger log= LogManager.getLogger(BaseTest.class.getName());
	@Test
	public void ContactPage() throws InterruptedException
	{
		
		driver.get(baseURL);
		Contactpage cp=new Contactpage(driver,test);
		cp.Contact_us().click();
		log.info("contact page loaded successfully");
		test.info("contact page loaded successfully");
		cp.Name().sendKeys("Raj");
		cp.EmailID().sendKeys("s4romitraj@gmail.com");
		cp.MessageBox().sendKeys("issue with the product");
		test.info("detailed entered successfully");
		Thread.sleep(2000);
		cp.Send().click();
		Thread.sleep(3000);
		Assert.assertTrue(cp.Sending_confirmation().isDisplayed());
		log.info("message sent successfully");
		test.info("message sent successfully");
	}
}
