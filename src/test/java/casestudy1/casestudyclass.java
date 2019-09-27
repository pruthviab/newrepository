package casestudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class casestudyclass {
WebDriver driver=null;
@Given("the signup page is opeeds")
public void the_signup_page_is_opeeds() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\browser_drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignUp")).click();
	}

	@When("user enters {string} as username")
	public void user_enters_as_username(String string) throws InterruptedException {
	   driver.findElement(By.id("userName")).sendKeys(string);
	   Thread.sleep(2000);
	}

	@When("user enter {string} as firstname")
	public void user_enter_as_firstname(String string) throws InterruptedException {
		driver.findElement(By.id("firstName")).sendKeys(string);
		Thread.sleep(2000);
	}

	@When("user entes {string} as lastname")
	public void user_entes_as_lastname(String string) throws InterruptedException {
		driver.findElement(By.id("lastName")).sendKeys(string);
		Thread.sleep(2000);
	}

	@When("user entrs {string} as password")
	public void user_entrs_as_password(String string) throws InterruptedException {
		driver.findElement(By.id("password")).sendKeys(string);
		Thread.sleep(2000);
	}

	@When("user eners {string} as conpassword")
	public void user_eners_as_conpassword(String string) throws InterruptedException {
		driver.findElement(By.id("pass_confirmation")).sendKeys(string);
		Thread.sleep(2000);
	}

	@When("Select malee")
	public void select_malee() throws InterruptedException {
	   WebElement radio1=driver.findElement(By.xpath("//*[@value='Male']"));
	   radio1.click();
	   Thread.sleep(2000);
	}

	@When("user eters {string} as email")
	public void user_eters_as_email(String string) throws InterruptedException {
		driver.findElement(By.id("emailAddress")).sendKeys(string);
		Thread.sleep(2000);
	}

	@When("user nters {string} as mobile")
	public void user_nters_as_mobile(String string) throws InterruptedException {
		driver.findElement(By.id("mobileNumber")).sendKeys(string);
		Thread.sleep(2000);
	}

	@When("user ente {string} as dob")
	public void user_ente_as_dob(String string) throws InterruptedException {
		driver.findElement(By.id("dob")).sendKeys(string);
		Thread.sleep(2000);
	}
	@When("user {string} as add")
	public void user_as_add(String string) throws InterruptedException {
		driver.findElement(By.id("address")).sendKeys(string);
		Thread.sleep(2000);
	}

	@When("Select scque")
	public void select_scque() throws InterruptedException {
		Select from =new Select(driver.findElement(By.name("securityQuestion")));
		  from.selectByIndex(1);
		  Thread.sleep(2000);
	}

	@When("user enrs {string} as answer")
	public void user_enrs_as_answer(String string) throws InterruptedException {
		driver.findElement(By.id("answer")).sendKeys(string);
		 Thread.sleep(2000);
	}
	

	@When("user Clcks Register")
	public void user_Clcks_Register() {
		driver.findElement(By.name("Submit")).click();
	}

	@Then("Registrs Successfully")
	public void registrs_Successfully() {
		System.out.println("Title of the page is "+driver.getTitle());
	}
}
