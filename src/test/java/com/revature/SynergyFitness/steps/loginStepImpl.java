package com.revature.SynergyFitness.steps;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.revature.SynergyFitness.pages.loginPage;
import com.revature.SynergyFitness.pages.profilesPage;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepImpl {
	private static loginPage page;
	private static WebDriver driver;
	
	@BeforeAll
	public static void setupDriver() {
		File file =new File("src/test/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		driver = new ChromeDriver();
		page= new loginPage(driver);
	}
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
	    page.navigateTo();
	}

	@Given("the user clicks the Log In Link")
	public void the_user_clicks_the_log_in_link() {
		WebElement loginLink = driver.findElement(By.id("login"));
		loginLink.click();
	}

	@When("the user enters {string} and {string} to log in")
	public void the_user_enters_and_to_log_in(String username, String password) {
		WebElement usernameInput = driver.findElement(By.id("username"));
		WebElement passwordInput = driver.findElement(By.id("password"));
		usernameInput.sendKeys(username);
		passwordInput.sendKeys(password);
	}

	@When("the user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
		loginBtn.click();
	}

	@Then("the navbar says {string}")
	public void the_navbar_says(String username) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofMillis(50));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.id("manageUser"),0));
		
		WebElement navLink = driver.findElement(By.id("manageUser"));
		
		assertEquals(username, navLink.getText());
		
		driver.findElement(By.id("logout")).click();
	}

	@Then("the page says Incorrect Credentials")
	public void the_page_says_incorrect_credentials() {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofMillis(50))
				.ignoring(NoAlertPresentException.class);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		
		assertTrue(alert.getText().toLowerCase().contains("incorrect"));
		alert.accept();
	}
	
	@AfterAll
	public static void closeDriver() {
		driver.quit();
	}
}
