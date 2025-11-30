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

    @FindBy (className = "card_travel")
    private WebElement productsBtn;

    @FindBy (className = "fa-shopping-cart")
    private WebElement cartBtn;

    @FindBy(className = "fa-lock")
    private WebElement signUpLoginBtn;

    @FindBy(className = "fa-list")
    private WebElement testCasesBtn;

    @FindBy(className = "fa-lock") //btn cerra sesion
    private WebElement logoutBtn;

    @FindBy(className = "fa-trash-o")
    private WebElement deleteAccountBtn;

    @FindBy(className = "fa-user") //btn (Logged in as "username")
    private WebElement userBtn;

    @FindBy(className = "fa-envelope")
    private WebElement contactUsBtn;

    public WebElement getProductsBtn(){
        return this.findElement(productsBtn);
    }

    public WebElement getCartBtn(){
        return this.findElement(cartBtn);
    }

    public WebElement getSignUpLoginBtn(){
        return this.findElement(signUpLoginBtn);
    }

    public WebElement getTestCasesBtn(){
        return this.findElement(testCasesBtn);
    }

    public WebElement getLogoutBtn(){
        return this.findElement(logoutBtn);
    }

    public WebElement getDeleteAccountBtn(){
        return this.findElement(deleteAccountBtn);
    }

    public WebElement getUserBtn(){
        return this.findElement(userBtn);
    }

    public WebElement getContactUsBtn(){
        return this.findElement(contactUsBtn);
    }
}
