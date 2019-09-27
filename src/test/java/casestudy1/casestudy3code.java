package casestudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class casestudy3code {
	WebDriver driver=null;
	@Given("enters username and password")
	public void enters_username_and_password() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\browser_drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("enters {string} as name")
	public void enters_as_name(String string) {
		driver.findElement(By.name("userName")).sendKeys(string);
	}

	@When("enters {string} as pasword")
	public void enters_as_pasword(String string) {
		driver.findElement(By.name("password")).sendKeys(string);
	}

	@When("Successful login into TestMeapp")
	public void successful_login_into_TestMeapp() {
		driver.findElement(By.name("Login")).click();
	}

	@When("user clicks search bar")
	public void user_clicks_search_bar() throws InterruptedException {
		driver.findElement(By.name("products")).click();
		Thread.sleep(2000);
	}

	@When("user types head")
	public void user_types_head() throws InterruptedException {
		driver.findElement(By.name("products")).sendKeys("bag");
		Thread.sleep(2000);
	
	}

	@Then("dropdown appears")
	public void dropdown_appears() throws InterruptedException {
		  driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
