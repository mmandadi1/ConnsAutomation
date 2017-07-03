package com.etouch.connsPages;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import com.etouch.taf.core.exception.PageException;
import com.etouch.taf.util.LogUtil;
import com.etouch.taf.webui.selenium.WebPage;

public class ConnsStoreLocatorPage {
	
	static Log log = LogUtil.getLog(ConnsStoreLocatorPage.class);
	
	/**
	 * @author Name - Deepak Bhambri
	 * The method used to click element using linkText 
	 * Any structural modifications to the display of the link should be done by overriding this method.
	 * @throws PageException  If an input or output exception occurred
	 **/
	
	public void closeLocationPopup(WebPage webPage, SoftAssert softAssert){
		try{
			log.info("Checking if Chrome browser pop-up is present.");
			Thread.sleep(2000);
			if(webPage.getDriver().findElement(By.xpath("//*[@class='modal-footer']//button")).isDisplayed()){
				JavascriptExecutor executor = (JavascriptExecutor)webPage.getDriver();
				WebElement abc = webPage.getDriver().findElement(By.xpath("//*[@class='modal-footer']//button"));
				executor.executeScript("arguments[0].click();", abc);
				Thread.sleep(2000);
				log.info("Chrome browser pop-up handled.");
			}
		}catch(Exception e){
			log.error("Chrome browser pop-up not present.");
		}
	}

}