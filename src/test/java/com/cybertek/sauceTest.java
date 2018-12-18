package com.cybertek;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class sauceTest {

	public static final String USERNAME = "polit123";
    public static final String ACCESS_KEY = "8b56da5e-f887-424e-a05b-efadaa921c5f";
    public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	
	
	@Test
	public void login() throws MalformedURLException {
		
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 7");
		caps.setCapability("version", "56.0");
		
		RemoteWebDriver driver=new RemoteWebDriver(
				new URL(URL),caps);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
	
}
