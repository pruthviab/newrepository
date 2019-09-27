package casestudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class casestudy4code {
	WebDriver driver=null;
	@Given("Alex has registered to the test me app")
	public void alex_has_registered_to_the_test_me_app() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\browser_drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("dogblack");
		driver.findElement(By.name("password")).sendKeys("dog@1234");
		driver.findElement(By.name("Login")).click();
		
	}

	@When("alex search a particular product")
	public void alex_search_a_particular_product() throws InterruptedException {
		driver.findElement(By.name("products")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("products")).sendKeys("bag");
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@When("try to proceed to payment")
	public void try_to_proceed_to_payment() {
	   try {
		   if(driver.findElement(By.xpath("//a[@href='displayCart.htm']")).isDisplayed());{
			   driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
		   }
	   }
	   catch(Exception e) {
		   System.out.println("No items in cart, so no payment option");
	   }
	}

	@Then("testme app doesnt display the cart icon")
	public void testme_app_doesnt_display_the_cart_icon() {
	    
	}

}
