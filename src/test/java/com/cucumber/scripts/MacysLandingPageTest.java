package com.cucumber.scripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MacysLandingPageTest {

	WebDriver driver;
	Scenario scenario;

	@Before
	public void tearSetup(Scenario scenario) {
		try {
			this.scenario = scenario;
			driver = new SafariDriver();
			System.out.println("Started luanching browser...!");
			System.out.println("-----------------------------------------------------------");
			System.out.println("Executing scenario: " + scenario.getName());
			// driver.manage().window().maximize();
			// driver.get("https://www.macys.com/");
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

			// driver.findElement(By.xpath("//a[contains(@id,'closeButton')]")).click();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());

		} finally {
			System.out.println("<-->browser launched...!!!");
		}

	}

	@After
	public void tearDown(Scenario scenario) {

		scenario.write("Finished scenario");
		if (scenario.isFailed()) {
			scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "/image/png");
		}
		System.out.println("Browser instance is closing.....!");
		System.out.println("------------------------------------------------");
		driver.quit();

	}

	@Given("^Enter the url of macys application$")
	//@Given("^$")
	public void enter_the_url_of_macys_application() throws Throwable {
		try {

			driver.manage().window().maximize();
			scenario.write("maximising the window");
			driver.get("https://www.macys.com/");
			scenario.write("fetching the url: https://www.macys.com/");
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		} finally {
			System.out.println("Executed  -  Enter the url of macys application");
		}
	}

	@When("^Click on popup window close mark$")
	//@When("^$")
	public void click_on_popup_window_close_mark() throws Throwable {
		System.out.println("started landing page: ");
		WebElement closeButton = driver.findElement(By.xpath("//a[contains(@id,'closeButton')]"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(closeButton));
		closeButton.click();

		try {

			WebElement signup = driver
					.findElement(By.xpath("//div[@id='redesign-media-rail']/div/div[1]/span/span/a/span"));
			signup.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Executed - To verify the Macys Landing and closing popup box");

		}

	}

	@Then("^Check for the landing page title$")
	//@Then("^$")
	public void check_for_the_landing_page_title() throws Throwable {
		try {
			String LandingageTile = driver.getTitle();
			Assert.assertTrue(LandingageTile
					.equalsIgnoreCase("Macy's - Shop Fashion Clothing & Accessories - Official Site - Macys.com"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		finally {
			System.out.println("Executed - Check for the landing page title");

		}
	}

	@Then("^To verify all the main link names under mainNavigationFobs$")
	//@Then("^$")
	public void To_verify_all_the_main_link_names_under_mainNavigationFobs() throws Throwable {

		List<WebElement> mainNavigationLinks = driver
				.findElements(By.xpath("//div[@id='mainNavigation']/div/div/ul/li"));
		// System.out.println(mainNavigationLinks);
		System.out.println("TotalLinksCount is: " + mainNavigationLinks.size());
		System.out.println("-----Total Main Navigation Link Names -----");
		for (int i = 1; i <= mainNavigationLinks.size(); i++) {
			WebElement linkNames = driver
					.findElement(By.xpath("//div[@id='mainNavigation']/div/div/ul/li[" + i + "]/a"));

			System.out.print(linkNames.getText() + ",");

		}
	}
}