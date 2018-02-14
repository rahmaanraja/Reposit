package org.cucumber.in.cucumber;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoqaStep {
	public WebDriver driver;
  @Given("^I am on Demoqa site$")
	public void i_am_on_Demoqa_site() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:/Users/user/workspace/cucumber/Driver/chromedriver.exe");
		 driver =new ChromeDriver();
		 driver.get("http://demoqa.com/registration/");
		 
	   
	    
	}

	@When("^I enter firstName and lastName$")
	public void i_enter_firstName_and_lastName() throws Exception {
	  driver.findElement(By.id("name_3_firstname")).sendKeys("Raj");
	  driver.findElement(By.id("name_3_lastname")).sendKeys("kumar");
	}

	@Then("^I verify entered firstName and lastname$")
	public void i_verify_entered_firstName_and_lastname() throws Exception {
		
	   
	}


}
