package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class SpaceValue {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumDrivers\\chromedriver.exe");
		DesiredCapabilities capabilities= new DesiredCapabilities();
		  capabilities.setCapability("deviceName", "moto");
		  capabilities.setCapability("platformVersion", "6.0");
		  capabilities.setCapability("platformName", "ANDROID");
		  capabilities.setCapability("browserName", "Chrome");
		  AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		//driver.manage().window().maximize();
		driver.get("http://connsecommdev-1365538477.us-east-1.elb.amazonaws.com/conns_rwd/");
		
/*		Point point =driver.findElement(By.xpath("html/body/div[2]/div/div[4]/div[1]/div/div[2]/div/div[1]/img")).getLocation();
		System.out.println(point.x+" "+point.y);
		
		int elementHeight1 =driver.findElement(By.xpath("html/body/div[2]/div/div[4]/div[1]/div/div[2]/div/div[1]/img")).getSize().getHeight();
		System.out.println(elementHeight1);
		int element1endpoint =point.x+elementHeight1;
		System.out.println("End point of a is :"+element1endpoint);
		
		Point point2 =driver.findElement(By.xpath("html/body/div[2]/div/div[4]/div[1]/div/div[3]/div[1]")).getLocation();
		System.out.println(point2.x+" "+point2.y);
		int diff = point2.x-element1endpoint;
		System.out.println("White space is : "+diff);*/
		/* JavascriptExecutor js = (JavascriptExecutor)driver;
		System.out.println( js.executeAsyncScript("function(document.getElementsByClassName('header_slider').offsetTop)"));
		*/
		/*String elementHeight1 =driver.findElement(By.xpath("//*[@class='header_slider']")).getCssValue("margin");
		String elementHeight2 =driver.findElement(By.xpath("//*[@class='home-banners']")).getCssValue("margin");
		System.out.println(elementHeight1+" "+elementHeight2);
		*/
		driver.findElement(By.xpath("(//*[@id='slide-nav']//button)[1]")).click();
		driver.findElement(By.xpath(".//*[@id='a-primary-furniture---mattresses']")).click();
		driver.findElement(By.linkText("Sofas & Loveseats")).click();
		Thread.sleep(10000);
	}

}
