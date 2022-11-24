package com.flexmoney.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondPage {
	@FindBy(css = "input.mdc-text-field__input")
	WebElement mobileLnk;

	@FindBy(css = "button#submitButton")
	WebElement submitLnk;

	public void enterMobileNo() {
		mobileLnk.click();
		mobileLnk.sendKeys("9988998899");

	}

	public void clickOnSubmitButton() {
     submitLnk.click();
     
	}

}
