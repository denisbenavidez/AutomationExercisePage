package Smoke;

import Pages.Account.DeleteAccountPage;
import Pages.Account.LoginPage;
import Pages.Global.TopHeaderPage;
import TestCaseImplements.TestCase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginUserTest extends TestCase { //TESTS 2, 3 Y 4

    @Test //TESTCASE 2
    public void loginUserCorrectTest() { //automationExerciseLogin@yopmail.com     12345
        //VERIRICAR INICIO Y CLICK EN EL BOTON EN EL TOPHEADER
        TopHeaderPage topHeaderPage = new TopHeaderPage(driver);
        Assert.assertTrue(topHeaderPage.ifTextPresent("Full-Fledged practice website for Automation Engineers"));
        topHeaderPage.getSignUpLoginBtn().click();

        //LOGEO
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.ifTextPresent("Login to your account"));
        loginPage.getEmailLoginInput().sendKeys("automationExerciseLogin@yopmail.com");
        loginPage.getPasswordInput().sendKeys("12345");
        loginPage.getLoginBtn().click();

        //VALIDAR QUE SE LOGEO
        Assert.assertTrue(topHeaderPage.getUserBtn().isDisplayed());

        //ELIMINAR CUENTA
        //topHeaderPage.getDeleteAccountBtn().click();

        //VALIDAR QUE SE ELIMINE LA CUENTA
        //DeleteAccountPage deleteAccountPage = new DeleteAccountPage(driver);
        //Assert.assertTrue(deleteAccountPage.ifTextPresent("Account Deleted!"));
        //deleteAccountPage.getContinueBtn().click();
    }

    @Test //TESTCASE 3
    public void loginUserIncorrectTest(){
        //VERIRICAR INICIO Y CLICK EN EL BOTON EN EL TOPHEADER
        TopHeaderPage topHeaderPage = new TopHeaderPage(driver);
        Assert.assertTrue(topHeaderPage.ifTextPresent("Full-Fledged practice website for Automation Engineers"));
        topHeaderPage.getSignUpLoginBtn().click();

        //LOGEO
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.ifTextPresent("Login to your account"));
        loginPage.getEmailLoginInput().sendKeys("automationExerciseLogin@yopmail.com");
        loginPage.getPasswordInput().sendKeys("12348");
        loginPage.getLoginBtn().click();

        //MENSAJE DE ERROR
        Assert.assertTrue(loginPage.ifTextPresent("Your email or password is incorrect!"));
    }

    @Test //TESTCASE 4
    public void loginUserCorrectlogoutTest() { //automationExerciseLogin@yopmail.com     12345
        //VERIRICAR INICIO Y CLICK EN EL BOTON EN EL TOPHEADER
        TopHeaderPage topHeaderPage = new TopHeaderPage(driver);
        Assert.assertTrue(topHeaderPage.ifTextPresent("Full-Fledged practice website for Automation Engineers"));
        topHeaderPage.getSignUpLoginBtn().click();

        //LOGEO
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.ifTextPresent("Login to your account"));
        loginPage.getEmailLoginInput().sendKeys("automationExerciseLogin@yopmail.com");
        loginPage.getPasswordInput().sendKeys("12345");
        loginPage.getLoginBtn().click();

        //VALIDAR QUE SE LOGEO
        Assert.assertTrue(topHeaderPage.getUserBtn().isDisplayed());

        //CERRAR SECCION Y VALIDAR
        topHeaderPage.getLogoutBtn().click();
        Assert.assertTrue(loginPage.ifTextPresent("Login to your account"));
    }
}
