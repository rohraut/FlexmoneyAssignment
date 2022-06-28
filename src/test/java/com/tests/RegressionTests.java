package com.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.configuration.BaseTest;
import com.flexkeywords.UIKeywords;
import com.flexmoney.pages.FirstPage;
import com.flexmoney.pages.SecondPage;
import com.flexmoney.pages.ThirdPage;

public class RegressionTests extends BaseTest {
	@Test
	public static void FirstScreenCase() {
		FirstPage p1 = PageFactory.initElements(UIKeywords.driver, FirstPage.class);
		// p1.enterMobileNo();
		p1.clickOncontinueLnk();

	}

	@Test
	public static void SecondScreenCase() throws InterruptedException {
		FirstPage p1 = PageFactory.initElements(UIKeywords.driver, FirstPage.class);
		p1.clickOncontinueLnk();

		SecondPage p2 = PageFactory.initElements(UIKeywords.driver, SecondPage.class);
		//Thread.sleep(3000);
		UIKeywords.WaitForWebElement(2000);
		p2.enterMobileNo();
		p2.clickOnSubmitButton();

	}

	@Test
	public void ThirdScreenCase() throws InterruptedException {

		FirstPage p1 = PageFactory.initElements(UIKeywords.driver, FirstPage.class);
		p1.clickOncontinueLnk();

		SecondPage p2 = PageFactory.initElements(UIKeywords.driver, SecondPage.class);
		UIKeywords.WaitForWebElement(3000);
		p2.enterMobileNo();
		UIKeywords.WaitForWebElement(3000);
		p2.clickOnSubmitButton();

		ThirdPage p3 = PageFactory.initElements(UIKeywords.driver, ThirdPage.class);
		UIKeywords.WaitForWebElement(3000);
		p3.CardlessemiLnk();
		UIKeywords.WaitForWebElement(3000);
		p3.KotakBank();
		UIKeywords.WaitForWebElement(3000);
		p3.EMILnk();
		UIKeywords.WaitForWebElement(3000);
		p3.ConfirmLnk();

	}

}
