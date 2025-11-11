package TestCaseImplements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.Random;

public class TestCase {

    protected static WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        driver = new ChromeDriver();
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(){
        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com/");
    }

    @AfterMethod
    public void afterMethod(){
        //driver.close();
        //driver.quit();
    }

    @AfterClass
    public void afterClass(){

    }

    public String getEmailRandom(){
        Random random = new Random();
        return "automationExercise" + random.nextInt(1000) + "@yopmail.com";
    }

}
