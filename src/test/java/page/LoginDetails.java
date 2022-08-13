package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginDetails {
    @FindBy(xpath = "//button[@class='login-btn nav-btn']")
    WebElement btn_LoginNav;
    @FindBy(id = "email")
    WebElement txtf_email;
    @FindBy(id = "password")
    WebElement txtf_pass;
    @FindBy(xpath = "//button[@type='submit'][contains(text(),'Login')]")
    WebElement btn_submitLogin;

    @FindBy(xpath = "//button[@class='user-btn d-flex align-items-center justify-content-center']//img[@class='img-fluid']")
    WebElement btn_dropdown;
    @FindBy(xpath = "//button[@class='logOut-btn']")
    WebElement btn_logout;

    public LoginDetails(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    public void doLogin(String Email, String Password)
    {
        btn_LoginNav.click();
        txtf_email.sendKeys(Email);
        txtf_pass.sendKeys(Password);
        btn_submitLogin.click();
    }

    public void doLogout()
    {
        btn_dropdown.click();
        btn_logout.click();

    }

}
