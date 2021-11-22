package Testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Hoveraction;
import utilities.BaseTest;

public class HoveractionTC extends BaseTest {
	
	public static Logger log= LogManager.getLogger(BaseTest.class.getName());
	
	@Test
	public void Hover() throws IOException, InterruptedException{
		driver.get(baseURL);
		Hoveraction ha=new Hoveraction(driver,test);
		Actions a=new Actions(driver);
		WebElement move=ha.Hover_select();
		a.moveToElement(move).build().perform();
		log.info("Hover performed successfully");
		test.info("Hover performed successfully");
		Thread.sleep(3000);
		ha.Select_Item().click();
		Thread.sleep(3000);
		Assert.assertTrue(ha.Page_Loaded().isDisplayed());
		log.info("desired page loaded successfully");
		test.info("desired page loaded successfully");
  }
}

