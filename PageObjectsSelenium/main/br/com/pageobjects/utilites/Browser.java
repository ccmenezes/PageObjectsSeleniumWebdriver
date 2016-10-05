package br.com.pageobjects.utilites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {
	
	private WebDriver driver;
	
	public WebDriver browserChoice (String browser) {
			
		if(driver == null){
					
			/*
			 * Para a versão beta 3 os navegadores IE, Edge e Firefox estão na fase de implementação. 
			 * http://www.seleniumhq.org/download/ 
			 * sessão ->
			 * Third Party Drivers, Bindings, and Plugins 
			 * 05/10/2016
			 */
			switch(browser) {
			    case "firefox": System.setProperty("webdriver.gecko.driver", "configuracoes/geckodriver.exe");
								driver = new FirefoxDriver();
								break;
			    case "ie": 		System.setProperty("webdriver.ie.driver", "configuracoes/MicrosoftWebDriver.exe");
								driver = new InternetExplorerDriver();
								break;
			    case "edge": 	System.setProperty("webdriver.edge.driver", "configuracoes/MicrosoftWebDriver.msi");
			    				driver = new EdgeDriver();
			    default: 	 	
						    	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
								driver = new ChromeDriver();
								
			}
		}
		return driver;
	}
	
	public void endDriver() {
		if(driver != null) {
			driver.close();
			driver.quit(); 
			driver = null;
		}
	}

}
