package com.SawagLabs_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	WebDriver driver;

	@FindBy(xpath = "//input[@id='user-name']")
	WebElement userNameFieldElement;

	@FindBy(xpath = "//input[@id='password']")
	WebElement passwordFieldElement;

	@FindBy(xpath = "//input[@id='login-button']")
	WebElement loginButtonElement;

	public LogInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void insertUserName(String userName) {
		userNameFieldElement.sendKeys(userName);

	}

	public void insertPassWord(String password) {
		passwordFieldElement.sendKeys(password);

	}

	public void loginClick() {
		loginButtonElement.click();

	}

}
