package br.com.pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Omayo {
	
	WebDriver driver;
	
	@FindBy(id = "radio1")
	private WebElement radioButtonMale;
	
	@FindBy(id = "radio2")
	private WebElement radioButtonFemale;
	
	@FindBy(id = "alert1")
	private WebElement buttonClickToGetAlert;
	
	@FindBy(id = "drop1")
	private WebElement comboboxOlderNews;
	
	@FindBy(id = "but1")
	private WebElement button1;
	
	@FindBy(id = "but2")
	private WebElement button2;
	
	
	private Alert alertToGetAlert;
	private String alertString;
		
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
		alertString = alertToGetAlert.getText();
		alertToGetAlert.accept();		
	}
	
	public String goBackPopUpToGetAlertString (){
		return alertString;
	}
	
	public void selectComboboxOldNews(String option) {
		Select select = new Select(comboboxOlderNews);
		select.selectByVisibleText(option);
	}
	
	public boolean verifyButton1(){
		boolean enable = true;
		enable = button1.isEnabled();
		return enable;
	}
	
	public void clickButton2(){
		button2.click();
	}
	
}
