package br.com.pageObjectsSelenium.test;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.pageobjectsselenium.OlxPaginaInicial;

public class TestOlxPageObjectsSelenium {
	
	private static WebDriver driver;
	private static OlxPaginaInicial pgInicial;

	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.olx.com.br/");
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
	public void clicarNoBotaoInserirAnuncioDeslogado() throws InterruptedException {
		pgInicial = new OlxPaginaInicial(driver);
		pgInicial.clicarNoBotaoInserirAnuncio();
		
		Thread.sleep(1000);
		String paginaDeLogin = "Minha Conta | bomnegócio agora é OLX.com.br";
		String minhaConta =  pgInicial.receberTitleDaPaginaMinhaConta();
		System.out.println(minhaConta);
		assertEquals(paginaDeLogin, pgInicial.receberTitleDaPaginaMinhaConta());
	}

}
