package Smoke;

import Pages.Account.AccountCreatedPage;
import Pages.Account.DeleteAccountPage;
import Pages.Account.LoginPage;
import Pages.Account.SignUpPage;
import Pages.Global.TopHeaderPage;
import TestCaseImplements.TestCase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterUserTest extends TestCase { //TESTS 1 Y 5

    @Test //TESTCASE 1
    public void registerUserTest(){
        //VERIRICAR INICIO Y CLICK EN EL BOTON EN EL TOPHEADER
        TopHeaderPage topHeaderPage = new TopHeaderPage(driver);
        Assert.assertTrue(topHeaderPage.ifTextPresent("Full-Fledged practice website for Automation Engineers"));
        topHeaderPage.getSignUpLoginBtn().click();

        //LLENAR PRIMEROS CAMPOS
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.ifTextPresent("New User Signup!"));
        loginPage.getNameRegisterInput().sendKeys("Automation");
        loginPage.getEmailRegisterInput().sendKeys(getEmailRandom());
        loginPage.getRegisterBtn().click();

        //LLENAR TODA LA INFORMACION
        SignUpPage signUpPage = new SignUpPage(driver);
        Assert.assertTrue(signUpPage.ifTextPresent("Enter Account Information"));
        signUpPage.getRadioMrBtn().click();
        signUpPage.getPasswordInput().sendKeys("123456");
        signUpPage.selectDateOfBirth("1", "1", "1990");

        signUpPage.getNewsletterBtn().click();
        signUpPage.getReceiveOffersBtn().click();

        signUpPage.getFirstNameInput().sendKeys("Automation");
        signUpPage.getLastNameInput().sendKeys("Exercise");
        signUpPage.getCompanyInput().sendKeys("PBS");
        signUpPage.getAddressInput().sendKeys("Calle 123456");
        signUpPage.getAddress2Input().sendKeys("Calle 2 12324");
        signUpPage.selectCountry("Canada");
        signUpPage.getStateInput().sendKeys("Ontario");
        signUpPage.getCityInput().sendKeys("Toronto");
        signUpPage.getZipCodeInput().sendKeys("M5V 2N1");
        signUpPage.getMobileNumberInput().sendKeys("1234567890");
        signUpPage.getCreateAccountBtn().click();

        //VALIDAR QUE SE CREE LA CUENTA
        AccountCreatedPage accountCreatedPage = new AccountCreatedPage(driver);
        Assert.assertTrue(accountCreatedPage.ifTextPresent("Account Created!"));
        accountCreatedPage.getContinueBtn().click();

        //VERIFICAR LOGEO Y DAR CLICK A ELIMINAR CUENTA
        Assert.assertTrue(topHeaderPage.getUserBtn().isDisplayed()); //VERIFICAMOS SI ESTA EL BOTON DE USUARIO LOGGED
        topHeaderPage.getDeleteAccountBtn().click();

        //VALIDAR QUE SE ELIMINE LA CUENTA
        DeleteAccountPage deleteAccountPage = new DeleteAccountPage(driver);
        Assert.assertTrue(deleteAccountPage.ifTextPresent("Account Deleted!"));
        deleteAccountPage.getContinueBtn().click();
    }

    @Test //TESTCASE 5
    public void registerUserExistedTest(){  //automationExerciseLogin@yopmail.com     12345
        //VERIRICAR INICIO Y CLICK EN EL BOTON EN EL TOPHEADER
        TopHeaderPage topHeaderPage = new TopHeaderPage(driver);
        Assert.assertTrue(topHeaderPage.ifTextPresent("Full-Fledged practice website for Automation Engineers"));
        topHeaderPage.getSignUpLoginBtn().click();

        //LLENAR PRIMEROS CAMPOS
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.ifTextPresent("New User Signup!"));
        loginPage.getNameRegisterInput().sendKeys("Automation");
        loginPage.getEmailRegisterInput().sendKeys("automationExerciseLogin@yopmail.com");
        loginPage.getRegisterBtn().click();

        //VALIDAR QUE EL USUARIO YA EXISTE
        Assert.assertTrue(loginPage.ifTextPresent("User already exists!"));
    }
}
