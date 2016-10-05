package br.com.pageobjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Omayo {
	
	WebDriver driver;
	
	@FindBy(id = "radio1")
	private WebElement radioButtonMale;
	
	@FindBy(id = "radio2")
	private WebElement radioButtonFemale;
	
	@FindBy(id = "alert1")
	private WebElement buttonClickToGetAlert;
	
	private Alert alertToGetAlert;
		
	public Omayo(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickMaleRadioButton(){
		radioButtonMale.click();
	}
	
	public void clickFemaleRadioButton(){
		radioButtonFemale.click();
	}
	
	public void clickButtonClickToGetAlert() throws InterruptedException{
		buttonClickToGetAlert.click();
		alertToGetAlert = driver.switchTo().alert();
		Thread.sleep(300);
		String text = "Hello";
		assertEquals(text, alertToGetAlert.getText());
		alertToGetAlert.accept();		
	}
	
}
