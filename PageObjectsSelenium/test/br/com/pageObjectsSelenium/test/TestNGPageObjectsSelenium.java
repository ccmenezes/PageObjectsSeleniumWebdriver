package br.com.pageObjectsSelenium.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import br.com.pageobjectsselenium.OlxPaginaInicial;

public class TestNGPageObjectsSelenium {
	private static WebDriver driver;
	private static OlxPaginaInicial pgInicial;
	
	@BeforeTest
    public void setup(){
		        
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.olx.com.br/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
	
	@Test
	public void test() throws InterruptedException {
		pgInicial = new OlxPaginaInicial(driver);
		pgInicial.clicarNoBotaoInserirAnuncio();
		Thread.sleep(1000);
		String paginaDeLogin = "Minha Conta | bomnegócio agora é OLX.com.br";
		Assert.assertEquals(paginaDeLogin, pgInicial.receberTitleDaPaginaMinhaConta());
	}
	
	@AfterTest
	public void finalizar() {
		if(driver != null) {
			driver.close();
			driver.quit();
			driver = null;
		}
	}
}
