package Smoke;

import Pages.ContactUs.ContactUsPage;
import Pages.Global.TopHeaderPage;
import TestCaseImplements.TestCase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsTest extends TestCase {

    @Test //TEST 6
    public void contactUsTest(){
        //VERIRICAR INICIO Y CLICK EN EL BOTON EN EL TOPHEADER
        TopHeaderPage topHeaderPage = new TopHeaderPage(driver);
        Assert.assertTrue(topHeaderPage.ifTextPresent("Full-Fledged practice website for Automation Engineers"));
        topHeaderPage.getContactUsBtn().click();

        //VALIDAR QUE SE ENCUENTRE EN LA PAGINA DE CONTACTO Y LLENAR DATOS Y ENVIAR DATOS
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        Assert.assertTrue(contactUsPage.ifTextPresent("Get In Touch"));
        contactUsPage.getNameInput().sendKeys("Automation");
        contactUsPage.getEmailInput().sendKeys("automationExerciseLogin@yopmail.com");
        contactUsPage.getSubjectInput().sendKeys("Test");
        contactUsPage.getMessageInput().sendKeys("Test");
        contactUsPage.upploadFile();
        contactUsPage.getSubmitBtn().click();

        //VERIFICAR QUE SE ENVIO CORRECTAMENTE
        contactUsPage.handleAlertOK();
        Assert.assertTrue(contactUsPage.ifTextPresent("Success! Your details have been submitted successfully."));

        //VOLVER A HOME Y VERIFICAR
        contactUsPage.getBackHomeBtn().click();
        Assert.assertTrue(topHeaderPage.ifTextPresent("Full-Fledged practice website for Automation Engineers"));
    }
}
