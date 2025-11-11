package Smoke;

import Pages.Account.LoginPage;
import Pages.Global.TopHeaderPage;
import TestCaseImplements.TestCase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterUserTest extends TestCase {

    @Test
    public void registerUserTest(){
        TopHeaderPage topHeaderPage = new TopHeaderPage(driver);
        Assert.assertTrue(topHeaderPage.ifTextPresent("Full-Fledged practice website for Automation Engineers"));
        topHeaderPage.getSignUpLoginBtn().click();

        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.ifTextPresent("New User Signup!"));

        loginPage.getNameRegisterInput().sendKeys("Automation");
        loginPage.getEmailRegisterInput().sendKeys(getEmailRandom());
        loginPage.getRegisterBtn().click();
    }
}
