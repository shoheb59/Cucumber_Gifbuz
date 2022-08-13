import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.LoginDetails;
import sun.rmi.runtime.Log;

import java.util.concurrent.TimeUnit;

public class StepsDefinations {

    public WebDriver driver;
    WebDriverWait wait;

    @Given("^User visited to the site$")
    public void user_visited_to_the_site() throws Exception {
        System.setProperty("webdriver.gecko.driver","./src/test/resources/geckodriver.exe");

        //ChromeOptions ops = new ChromeOptions();
        FirefoxOptions ops = new FirefoxOptions();
        driver = new FirefoxDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://gifbuz.com");


    }

    @When("^User enter valid credential \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enter_valid_credential(String email, String pass) throws Exception {
        LoginDetails loginDetails = new LoginDetails(driver);
        loginDetails.doLogin(email, pass);

    }

    @Then("^User can login to the site$")
    public void user_can_login_to_the_site() throws Exception {
        LoginDetails loginDetails = new LoginDetails(driver);
        loginDetails.doLogout();
        driver.close();

    }

}
