package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registration {
	WebDriver driver;
	@Before
	public void init() {
		String path = "C:\\Users\\a07208trng_b4a.04.26\\Desktop\\selenium\\jar\\chromedriver_win32/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		PageFactory.initElements(driver, logincall.class);
	}
	
	@Given("link of Testme app {string}")
	public void link_of_Testme_app(String string) {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.get(string);
	   
	}

	@When("user{int} types {string} as username")
	public void user_types_as_username(Integer int1, String string) {
	    // Write code here that turns the phrase above into concrete actions
		logincall.username.sendKeys(string);
	    
	}

	@When("user{int} types {string} as firstname")
	public void user_types_as_firstname(Integer int1, String string) {
	    // Write code here that turns the phrase above into concrete actions
		logincall.firstname.sendKeys(string);
	    
	}

	@When("user{int} types {string} as lastname")
	public void user_types_as_lastname(Integer int1, String string) {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.id("lastName")).sendKeys(string);
	    logincall.lastname.sendKeys(string);
	}

	@When("user{int} types {string} as password")
	public void user_types_as_password(Integer int1, String string) {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.id("password")).sendKeys(string);
	    logincall.password.sendKeys(string);
	}


	@When("user{int} types {string} as confirm password")
	public void user_types_as_confirm_password(Integer int1, String string) {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.id("pass_confirmation")).sendKeys(string);
	    logincall.confirmpassword.sendKeys(string);
	}

	@When("user{int} clicks on gender button")
	public void user_clicks_on_gender_button(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/span[1]")).click();
        logincall.male.click();;	
	}

	@When("user{int} types {string} as mail")
	public void user_types_as_mail(Integer int1, String string) {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.id("emailAddress")).sendKeys(string);
	    logincall.email.sendKeys(string);
	}

	@When("user{int} types {string} as number")
	public void user_types_as_number(Integer int1, String string) {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.id("mobileNumber")).sendKeys(string);
	    logincall.number.sendKeys(string);
	}

	@When("user{int} types {string} as dob")
	public void user_types_as_dob(Integer int1, String string) {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.id("dob")).sendKeys("05/15/2019");
	   logincall.date.sendKeys(string);
	}

	@When("user{int} enters {string} as address")
	public void user_enters_as_address(Integer int1, String string) {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.id("address")).sendKeys(string);
	   logincall.Address.sendKeys(string);
	}

	@When("user{int} selects first question")
	public void user_selects_first_question(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	Select sel = new Select(driver.findElement(By.id("securityQuestion")));
			sel.selectByIndex(1);
	    
	}

	@When("user{int} types {string} as birth place")
	public void user_types_as_birth_place(Integer int1, String string) {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.id("answer")).sendKeys(string);
	    logincall.ans.sendKeys(string);
	}

	@Then("user{int} clicks on register button")
	public void user_clicks_on_register_button(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //driver.findElement(By.name("Submit")).click();
	    logincall.register.click();
	}



}
