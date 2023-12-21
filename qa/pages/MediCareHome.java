package com.ninjaDemo.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class MediCareHome {

	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//input[@id='name'][@name='name'][@class='form-control']")
	WebElement registerPageWithName;
	
	
	
	@FindBy(xpath = "//input[@id='email'][@name='email'][@class='form-control']")
	WebElement registerPageWithEmail;
	
	

	@FindBy(xpath = "//input[@id='password'][@name='password'][@class='form-control']")
	WebElement registerPageWithPassword;
	
	

	@FindBy(xpath = "//button[@class='btn btn-success'][normalize-space()='Register']")
	WebElement registerPage;
	
	

	@FindBy(xpath = "//*[@id='cart102']")
	WebElement addingCart;
 

	public MediCareHome(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	// Actions
	public void RegisterToMediCareAccountWithName() {

		registerPageWithName.sendKeys("PPPS");
	}
	
	
	public void RegisterToMediCareAccountWithEmail() {

		registerPageWithEmail.sendKeys("ranganayakigluck@gmail.com");
	}
	
	
	public void RegisterToMediCareAccountWithPassword() {

		registerPageWithPassword.sendKeys("Happy@20R_");
	}
	
	
	
	public void RegisterToMediCareAccountWithRegister() {

		registerPage.click();
	}
	public void AddToCart() {
		addingCart.click();
	}
	

//
}
