package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundsVerify {

	@FindBy(id="btn_submit")
	private WebElement submitBtn;
	
	public TransferFundsVerify(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickSubmit() {
		submitBtn.click();
	}
}
