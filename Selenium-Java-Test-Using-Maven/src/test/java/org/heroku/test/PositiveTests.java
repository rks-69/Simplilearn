package org.heroku.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveTests {

	@Test
	public void loginTest() throws Exception {
		System.out.println("Starting login test");
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		sleep(3000);
		driver.manage().window().maximize();
		String url = "https://the-internet.herokuapp.com/login";
		driver.get(url);
		System.out.println("Page is Opened");
		sleep(3000);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("tomsmith");
		sleep(1500);

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("SuperSecretPassword!");
		sleep(3000);

		WebElement loginButton = driver.findElement(By.tagName("button"));
		loginButton.click();
		sleep(5000);

		String expectedurl = "https://the-internet.herokuapp.com/secure";
		String actualurl = driver.getCurrentUrl();
		Assert.assertEquals(actualurl, expectedurl, "Actual page url is not the same as expected");

		WebElement logoutButton = driver.findElement(By.xpath("//a[@class='button secondary radius']"));
		Assert.assertTrue(logoutButton.isDisplayed(), "LogOut Button is not visible");

		WebElement successmsg = driver.findElement(By.xpath("//div[@id='flash']"));
		String expectedmsg = "You logged into a secure area!";
		String actualmsg = successmsg.getText();
		Assert.assertTrue(actualmsg.contains(expectedmsg),
				"Actual message does not contain expected message.\n Actual Message: " + actualmsg
						+ "\nExpected Message:" + expectedmsg);
		driver.quit();

	}

	private void sleep(long i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
