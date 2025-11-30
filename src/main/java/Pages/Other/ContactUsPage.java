package Pages.Other;

import Pages.Page;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class ContactUsPage extends Page {
    public ContactUsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy (name = "name")
    private WebElement nameInput;

    @FindBy (name = "email")
    private WebElement emailInput;

    @FindBy (name = "subject")
    private WebElement subjectInput;

    @FindBy (id = "message")
    private WebElement messageInput;

    @FindBy (name = "upload_file")
    private WebElement fileInput;

    @FindBy (name = "submit")
    private WebElement submitBtn;

    @FindBy (className = "btn-success")
    private WebElement backHomeBtn;

    public WebElement getNameInput(){
        return this.findElement(nameInput);
    }

    public WebElement getEmailInput(){
        return this.findElement(emailInput);
    }

    public WebElement getSubjectInput(){
        return this.findElement(subjectInput);
    }

    public WebElement getMessageInput(){
        return this.findElement(messageInput);
    }

    public WebElement getFileInput(){
        return this.findElement(fileInput);
    }

    public WebElement getSubmitBtn(){
        return this.findElement(submitBtn);
    }

    public WebElement getBackHomeBtn(){
        return this.findElement(backHomeBtn);
    }

    public void upploadFile (){
        File file = new File("D:\\DESCARGAS\\CREATIVA\\AutomationExercisePage\\src\\main\\java\\Util\\test.txt");
        String path = file.getAbsolutePath();
        driver.findElement(By.name("upload_file")).sendKeys(path);
    }

    public void handleAlertOK(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
