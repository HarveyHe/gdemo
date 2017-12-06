package io.cucumber.samples.dw.steps;


import cucumber.annotation.en.Given; 

public class CucumberJava { 
	
   @Given("^I have open the browser$") 
   public void openBrowser() { 
//      driver = new FirefoxDriver(); 
//      driver = new ChromeDriver(); O
	   System.out.println("ttttttttt");
   } 
//	
//   @When("^I open facebook website$") 
//   public void goToFacebook() { 
//      driver.navigate().to("https://www.facebook.com/"); 
//   } 
//	
//   @Then("^Login button should exits$") 
//   public void loginButton() { 
//      if(driver.findElement(By.id("u_0_v")).isEnabled()) { 
//         System.out.println("Test 1 Pass"); 
//      } else { 
//         System.out.println("Test 1 Fail"); 
//      } 
//      driver.close(); 
//   } 
}
