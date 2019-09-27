package casestudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class casestudy2code {
	WebDriver driver=null;
	@Given("enters usernamee and passwordd")
	public void enters_usernamee_and_passwordd() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\browser_drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
	   
	}

	@When("enters {string} as username")
	public void enters_as_username(String string) {
		driver.findElement(By.name("userName")).sendKeys(string);
	}

	@When("enters {string} as password")
	public void enters_as_password(String string) {
		driver.findElement(By.name("password")).sendKeys(string);
	}

	@Then("Successful login into app")
	public void successful_login_into_app() {
	    driver.findElement(By.name("Login")).click();
		System.out.println("Title of the page is "+driver.getTitle());
	}

}
