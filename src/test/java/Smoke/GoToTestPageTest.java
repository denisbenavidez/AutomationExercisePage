package Smoke;

import Pages.Global.TopHeaderPage;
import TestCaseImplements.TestCase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoToTestPageTest extends TestCase {

    @Test
    public void visitTestCasesPage(){ //TEST CASE 7
        TopHeaderPage topHeaderPage = new TopHeaderPage(driver);
        Assert.assertTrue(topHeaderPage.ifTextPresent("Full-Fledged practice website for Automation Engineers"));
        topHeaderPage.getTestCasesBtn().click();

        //Verificamos que estamos en la pagina de TestCases
        Assert.assertTrue(topHeaderPage.ifTextPresent("Test Cases"));
    }
}
