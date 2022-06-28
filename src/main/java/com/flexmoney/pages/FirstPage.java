package com.flexmoney.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstPage {
	@FindBy(css = "input#CI")
	WebElement mobileLnk;
	@FindBy(css = "button#continueBtn")
	WebElement continueLnk;

	public void enterMobileNo() {
		mobileLnk.sendKeys("9988998899");

	}

	public void clickOncontinueLnk() {
		continueLnk.click();

	}

}
