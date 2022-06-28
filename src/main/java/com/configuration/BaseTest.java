package com.configuration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.flexkeywords.UIKeywords;

public class BaseTest {
	@BeforeMethod
	public static void openBroswer() {
		UIKeywords.openBrowser("chrome");
		UIKeywords.launchURL("https://staging.instacred.me/simulation/tpsl/e2e-transaction.jsp");
		//UIKeywords.launchURL("https://staging.instacred.me/payment/enter-mobile?uuId=65dcf48c-6833-433e-8373-61a9e9ebd200");

	}
      @AfterMethod
	public static void closeBrowser() {
		UIKeywords.closeBrowser();

	}

}
