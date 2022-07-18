package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver = null;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-103.exe" );
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa1.orbundsis.com/einstein-freshair/administrator_frameset.jsp");
	    System.out.println("user is on login page 0");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
	
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user enter username and password1");
		//Locator for username field
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("test.admin41");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test41-hassan");
		driver.findElement(By.xpath("//*[@id=\"frmlogin\"]/div/table/tbody/tr[3]/td[2]/select/option[4]")).click();
		
	}

	@And("Click on Login Button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on Login Button2");
		driver.findElement(By.name("B3")).click(); 
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is navigated to the home page3");
	    
	}

}
