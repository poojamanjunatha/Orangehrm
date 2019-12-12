package com.step;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("unused")
public class Steps {
	
	static  WebDriver driver;
	@Given("navigate to orangehrm application")
	
	public void givenNavigateToOrangehrmApplication() {
	 
		
		 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\pooja.m\\\\selenium\\\\driver1\\\\chromedriver.exe"); 
		
		
		 driver = new ChromeDriver(); 
		         
		         driver.manage().window().maximize(); 

		      driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		 
	}

	@When("enter username and password")
	
	public void whenEnterUsernameAndPassword() {
driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
	}

	@Then("click on login")
	
	public void thenClickOnLogin() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		Thread.sleep(2000);
		driver.close();
			 
	}

}

