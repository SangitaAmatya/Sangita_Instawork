package com.version1.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_page_001 {
	public static void main(String[] args) throws InterruptedException {

		// Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/Users/adyanshpanigrahi/Downloads/chromedriver 2");
		WebDriver driver = new ChromeDriver(); // ChromeDriver driver=new ChromeDriver(); // Invokes the chrome browser

		driver.get("http://www.ecommerce.saipratap.net"); // Open URL http://opensource.demo.orangehrmlive.com
		// vallidating the ttitle
		String vallidateTitle = "Ez Shop Online";
		String Title = driver.getTitle();
		System.out.println(Title);
		if (vallidateTitle.equals(Title)) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is not correct");

		}

		// How many link are avilable
		System.out.println("******Print the all hyperlink in this side*******");

		List<WebElement> Hyperlinks = driver.findElements(By.tagName("a"));
		System.out.println("Total hyperlink " + Hyperlinks.size());
		for (WebElement Hyperlink : Hyperlinks) {
			System.out.println(Hyperlink.getText());
		}

		// Account is aviable in the side vallidation
		WebElement AccountLink = driver.findElement(By.linkText("ACCOUNT"));
		boolean Account = AccountLink.isDisplayed();
		if (Account) {
			System.out.println("Account is visible in the link");

		} else {
			System.out.println("Account is visible in the link");
		}
		AccountLink.click();
		// driver.quit();

		// vallidate the Login account
		String VallidateAccountTitle = "Welcome, Please login to your account.";
		String AccountTitle = driver.getTitle();
		System.out.println(AccountTitle);
		if (VallidateAccountTitle.equals(AccountTitle)) {
			System.out.println("Account Title is correct");
		} else {

			System.out.println("Account Title is correct");
		}
		driver.quit();
	}
}
