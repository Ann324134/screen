package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {
	public WebDriver driver;
	@FindBy(xpath="//input[@placeholder='Email address or phone number']")
	private WebElement usernameTextField;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement passwordTextField;
	
	@FindBy(xpath="//button[@type='submt']")
	private WebElement loginButton;
	
	public FacebookLoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void loginMethod(){
		usernameTextField.sendKeys("annie");
		passwordTextField.sendKeys("cnj");
		loginButton.click();
	}


}
