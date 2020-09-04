package org.phi.naruto.model.factory.downloader;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Downloader {
	
	public String download(String url) {
		System.setProperty("webdriver.gecko.driver","geckodriver"); // Setting system properties of FirefoxDriver
	    
	    FirefoxOptions options = new FirefoxOptions();
	    options.setHeadless(true);
		WebDriver driver = new FirefoxDriver(options);
		
		try {
			URL validUrl = new URL(url);
		} catch (MalformedURLException e) {
			e.printStackTrace();
			return "";
		}
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        
        String content=driver.getPageSource();                
        driver.close();
        
        return content;
	}

}
