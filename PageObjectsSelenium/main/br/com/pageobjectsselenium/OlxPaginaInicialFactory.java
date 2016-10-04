package br.com.pageobjectsselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OlxPaginaInicialFactory {
	
	WebDriver driver;
	 
	 @FindBy(xpath = "html/body/div[2]/header/div/div[2]/div/div[1]/div/div/a")
	 WebElement linkChat;
	 
	 @FindBy(xpath = ".//*[@id='container_not_logged']/span/a")
	 WebElement linkMinhaConta;

	 @FindBy(css = ".btn.btn-large.btn-orange")
	 WebElement botaoInserirAnuncio1;
	 	  
	 public OlxPaginaInicialFactory(WebDriver driver){
		 this.driver = driver;
		 //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
	 
	 public void clicarNoLinkChat(){
		 linkChat.click();
	 } 
	 
	 public void clicarNoLinkMinhaConta(){
		 linkMinhaConta.click();
	 }
	 
	 public void clicarNoBotaoInserirAnuncio() {
		 botaoInserirAnuncio1.click();
	 }
		 
	 public String receberTitleDaPaginaMinhaConta() {
		 return driver.getTitle();
	 }

}
