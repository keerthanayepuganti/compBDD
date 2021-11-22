package Testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Homepage;
import utilities.BaseTest;

public class HomepageTC extends BaseTest
{
	public static Logger log= LogManager.getLogger(BaseTest.class.getName());
	@Test
	public void Homepage() throws InterruptedException
	{
		
		driver.get(baseURL);
		Homepage hp=new Homepage(driver,test);
		log.info("Homepage loaded successfully");
		test.info("Homepage loaded successfully");
		Assert.assertTrue(hp.Homepage_logo().isDisplayed());
		
		
	}
	
}
