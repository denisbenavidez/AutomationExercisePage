package Pages.Global;

import Pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopHeaderPage extends Page {
    public TopHeaderPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "fa-home")
    private WebElement homeBtn;

    @FindBy(className = "fa-lock")
    private WebElement signUpLoginBtn;

    public WebElement getHomeBtn(){
        return this.findElement(homeBtn);
    }

    public WebElement getSignUpLoginBtn(){
        return this.findElement(signUpLoginBtn);
    }
}
