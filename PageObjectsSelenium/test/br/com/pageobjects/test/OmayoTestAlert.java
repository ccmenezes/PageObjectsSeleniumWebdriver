package br.com.pageobjects.test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.pageobjects.Omayo;

public class OmayoTestAlert {
	
	private static WebDriver driver;
	private static Omayo page;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://omayo.blogspot.com.br/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
	}

	@After
	public void tearDown() throws Exception {
		if(driver != null) {
			driver.close();
			driver.quit();
			driver = null;
		}
	}

	@Test
	public void testHandlingAlert() throws InterruptedException {
		page = new Omayo(driver);
		page.clickButtonClickToGetAlert();
	}

}
