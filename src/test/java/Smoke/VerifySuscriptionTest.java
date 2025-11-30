package Smoke;

import Pages.Global.FooterPage;
import Pages.Global.TopHeaderPage;
import TestCaseImplements.TestCase;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifySuscriptionTest extends TestCase {

    @Test //10
    public void verifySuscriptionHomeTest(){
        Actions actions = new Actions(driver);
        FooterPage footerPage = new FooterPage(driver);
        Assert.assertTrue(footerPage.ifTextPresent("Full-Fledged practice website for Automation Engineers"));

        //Realizamos un scroll hasta el footer y verificamos
        actions.scrollToElement(footerPage.getFooterBottom()).perform();
        Assert.assertTrue(footerPage.ifTextPresent("Subscription"));

        //DIGITAMOS CORREO, ENVIAMOS Y VERIFICAMOS MENSAJE
        actions.sendKeys(footerPage.getSusbscribeEmailInput(), "automationExerciseLogin@yopmail.com").perform();
        footerPage.getSusbscribeBtn().click();
        Assert.assertTrue(footerPage.ifTextPresent("You have been successfully subscribed!"));
    }

    @Test //11
    public void verifySuscriptionCartTest(){
        Actions actions = new Actions(driver);
        TopHeaderPage topHeaderPage = new TopHeaderPage(driver);
        Assert.assertTrue(topHeaderPage.ifTextPresent("Full-Fledged practice website for Automation Engineers"));
        topHeaderPage.getCartBtn().click();

        FooterPage footerPage = new FooterPage(driver);
        actions.scrollToElement(footerPage.getFooterBottom()).perform();
        Assert.assertTrue(footerPage.ifTextPresent("Subscription"));

        actions.sendKeys(footerPage.getSusbscribeEmailInput(), "automationExerciseLogin@yopmail.com").perform();
        footerPage.getSusbscribeBtn().click();
        Assert.assertTrue(footerPage.ifTextPresent("You have been successfully subscribed!"));
    }
}
