package com.cucumber.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Intailize {

	public WebDriver driver;

	@org.junit.BeforeClass
	public void testIntailization() {
		try {
			/*System.setProperty("webdriver.gecko.driver", "/Users/nisum/Downloads/softwares/geckodriver");
			driver = new FirefoxDriver();*/
			driver = new SafariDriver();
			driver.manage().window().maximize();
			driver.get("https://www.macys.com/");
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			
			// driver.findElement(By.xpath("//a[contains(@id,'closeButton')]")).click();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());

		} finally {
			System.out.println("<-->browser launched...!!!");
		}

	}

	@org.junit.AfterClass
	public void testQuit() {
		if (driver != null) {
			driver.quit();
		}
	}
}
