package Pages.Account;

import Pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Page {
    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //New User SignUp
    @FindBy (name = "name")
    private WebElement nameRegisterInput;

    @FindBy (xpath = "//input[@data-qa = 'signup-email']")
    private WebElement emailRegisterInput;

    @FindBy (xpath = "//button[@data-qa = 'signup-button']")
    private WebElement registerBtn;

    public WebElement getNameRegisterInput(){
        return this.findElement(nameRegisterInput);
    }

    public WebElement getEmailRegisterInput(){
        return this.findElement(emailRegisterInput);
    }

    public WebElement getRegisterBtn(){
        return this.findElement(registerBtn);
    }

    //Login to your account
    @FindBy (xpath = "//input[@data-qa = 'login-email']")
    private WebElement emailLoginInput;

    @FindBy (name = "password")
    private WebElement passwordInput;

    @FindBy (xpath = "//button[@data-qa = 'login-button']")
    private WebElement loginBtn;

    public WebElement getEmailLoginInput(){
        return this.findElement(emailLoginInput);
    }

    public WebElement getPasswordInput(){
        return this.findElement(passwordInput);
    }

    public WebElement getLoginBtn(){
        return this.findElement(loginBtn);
    }
}
