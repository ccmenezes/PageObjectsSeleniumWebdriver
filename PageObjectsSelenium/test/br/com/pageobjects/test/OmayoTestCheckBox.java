package br.com.pageobjects.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import br.com.pageobjects.Omayo;
import br.com.pageobjects.utilites.Browser;

public class OmayoTestCheckBox {

	private static WebDriver driver;
	private static Omayo page;
	private static Browser browser;
	
	@BeforeClass
	public static void setUp() throws Exception {
		browser = new Browser();
		driver = browser.browserChoice("chrome");
		driver.get("http://omayo.blogspot.com.br/");
		page = new Omayo(driver);		
	}

	@AfterClass
	public static void tearDown() throws Exception {
		browser.endDriver();
	}

	@Test
	public void testclickCheckboxOrange() throws InterruptedException {
		page.clickCheckboxOrange();
		page.clickCheckboxOrange();
		Thread.sleep(1000);
	}
	
	@Test
	public void testclickCheckboxBlue() throws InterruptedException {
		page.clickCheckboxBlue();
		Thread.sleep(1000);
	}

}
