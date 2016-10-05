package br.com.pageobjects.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import br.com.pageobjects.Omayo;
import br.com.pageobjects.utilites.Browser;

public class OmayoTestComboBox {
	
	private static WebDriver driver;
	private static Omayo page;
	private static Browser browser;

	@Before
	public void setUp() throws Exception {
		browser = new Browser();
		driver = browser.browserChoice("chrome");
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com.br/");
		page = new Omayo(driver);
	}

	@After
	public void tearDown() throws Exception {
		browser.endDriver();
	}

	@Test
	public void test() throws InterruptedException {
		String option = "doc 2";
		page.selectComboboxOldNews(option);
		Thread.sleep(500);
	}

}
