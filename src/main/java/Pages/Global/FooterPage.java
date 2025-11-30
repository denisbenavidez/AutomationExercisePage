package Pages.Global;

import Pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterPage extends Page {
    public FooterPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "susbscribe_email")
    private WebElement susbscribeEmailInput;

    @FindBy (id = "subscribe")
    private WebElement susbscribeBtn;

    @FindBy (className = "footer-bottom")
    private WebElement footerBottom;

    public WebElement getSusbscribeEmailInput(){
        return this.findElement(susbscribeBtn);
    }

    public WebElement getSusbscribeBtn(){
        return this.findElement(susbscribeBtn);
    }

    public WebElement getFooterBottom(){
        return this.findElement(footerBottom);
    }
}
