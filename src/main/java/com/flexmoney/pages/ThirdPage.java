package com.flexmoney.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThirdPage {
	@FindBy(css ="div#emi")
	WebElement CardlessEmiLnk;
	@FindBy(css = "body > div.paymentContainer__YshLL > div.paymentLayout__2Ax3X > div.paymentBody__1FVzI > div > div:nth-child(4) > div:nth-child(3) > div > div.emiContainer__OcIih > div > div.lenderName__1enKc.bold-text")
	WebElement kotakBankLnk;
	@FindBy(css = "#emi-panel-0 > div:nth-child(2) > div > div > div.monthlyInstallment__1IaNm")
	WebElement EMILnk;
	@FindBy(css = "button#submitButton")
	WebElement ConfirmLnk;

	public void CardlessemiLnk() {
		CardlessEmiLnk.click();

	}

	public void KotakBank() {
		kotakBankLnk.click();

	}
	public void EMILnk() {
	  EMILnk.click();

	}
	public void ConfirmLnk() {
		ConfirmLnk.click();

	}

}
