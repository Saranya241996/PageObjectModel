package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class OpenGoogleDefinitions {
	
	WebDriver driver;
	
	@Given("when user is entering WWW.Google.com")
	
	public void when_user_is_entering_google() {
		
		System.setProperty("Webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver-mac-x64/chromedriver.exe");
	
	    driver= new ChromeDriver();
	    
	    driver.get("https://www.google.com");
	    
	}
	
	@When("User is typing the search term")
	
	public void typing_searching_term() {
		
		WebElement searchbox= driver.findElement(By.id("input"));
		
		searchbox.sendKeys("Cucumber");
		
	}
	
   @When("User is entering the key")
	
	public void enters_the_return_key() {
		
		WebElement searchbox= driver.findElement(By.id("input"));
		
		searchbox.submit();
		
	}
	
	@Then("User should see the results")
	
	public void user_should_see_the_result() {
		
	   boolean isResultsDisplayed=driver.findElement(By.id("APjFqb")).isDisplayed();
		
		if(isResultsDisplayed) {
			
			System.out.println("Search resukts dispalyed");
		}
		else {
			 System.out.println("Search resukts not displayed");
		}
		
		driver.quit();
	}
	
}
