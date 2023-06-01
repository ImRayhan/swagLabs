package com.SwagLabs_stepdefination;

import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.SawagLabs_pages.LogInPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInStep {
	private static WebDriver driver;
	String baseUrl;
	LogInPage log;

	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		baseUrl = "https://www.saucedemo.com/";
		log = new LogInPage(driver);

	}

	@Given("user is on login page")
	public void user_is_on_login_page() {

		driver.get(baseUrl);

	}

	@When("user enter user name and password")
	public void user_enter_user_name_and_password() {
		log.insertUserName("standard_user");
		log.insertPassWord("secret_sauce");

	}

	@When("click the login button")
	public void click_the_login_button() {
		log.loginClick();

	}

	@Then("user able to seen the shopping page")
	public void user_able_to_seen_the_shopping_page() {
		String actulTitle = driver.getTitle();
		Assert.assertEquals(actulTitle, "Swag Labs");
		System.out.println("User is in " + actulTitle + " page");

	}

	@After
	public static void tearDown() {
		driver.quit();

	}

}
