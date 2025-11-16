package Pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.io.File;
import java.rmi.UnexpectedException;
import java.time.Duration;
import java.util.function.Function;

public class Page {

    protected WebDriver driver;
    private static final int WAIT_TIMEOUT = 10;
    private static final int POLLING_INTERVAL = 1;

    public Page(WebDriver driver){
        this.driver = driver;
    }
    //FIND ELEMENT
    private WebElement fluentWaitElement(WebElement element){
        Wait<WebDriver> wait = new FluentWait<WebDriver>(this.driver)
                .withTimeout(Duration.ofSeconds(WAIT_TIMEOUT))
                .pollingEvery(Duration.ofSeconds(POLLING_INTERVAL))
                .ignoring(Exception.class);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public WebElement findElement (WebElement element){
        return this.fluentWaitElement(element);
    }
    //FIND ELEMENT

    //IF TEXT PRESENT
    private Wait<WebDriver> fluentWait(){
        return new FluentWait<WebDriver>(this.driver)
                .withTimeout(Duration.ofSeconds(WAIT_TIMEOUT))
                .pollingEvery(Duration.ofSeconds(POLLING_INTERVAL))
                .ignoring(NoSuchElementException.class);
    }

    public Boolean ifTextPresent(String txt) {
        Wait<WebDriver> wait = fluentWait();
        try {
            return wait.until(new Function<WebDriver, Boolean>() {
                public Boolean apply(WebDriver driver) {
                    return driver.getPageSource().contains(txt);
                }
            });
        } catch (Exception e) {
            return false;
        }
    }
    //IF TEXT PRESENT
}
