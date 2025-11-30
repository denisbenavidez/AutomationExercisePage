package Smoke;

import Pages.Global.TopHeaderPage;
import Pages.Products.ProductsPage;
import TestCaseImplements.TestCase;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ProductsDetailAndSearchProductTest extends TestCase {

    @Test //TESTCASE 8
    public void verifyProductsDetailTest(){
        TopHeaderPage topHeaderPage = new TopHeaderPage(driver);
        Assert.assertTrue(topHeaderPage.ifTextPresent("Full-Fledged practice website for Automation Engineers"));
        topHeaderPage.getProductsBtn().click();

        //VERIFICAMOS QUE ESTAMOS EN PRODUCTS PAGE
        ProductsPage productsPage = new ProductsPage(driver);
        Assert.assertTrue(productsPage.ifTextPresent("All Products"));

        //Realizamos pequeño scroll para visualizar mejor los productos
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0,200).perform();

        //Click para ver producto
        productsPage.getViewProduct1Btn().click();

        //Verificamos que estamos en product_details realizando softAssert
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(productsPage.ifTextPresent("Blue Top"), "Fallo en validación: Name");
        softAssert.assertTrue(productsPage.ifTextPresent("Category"), "Fallo en validación: Category");
        softAssert.assertTrue(productsPage.ifTextPresent("Rs. 500"), "Fallo en validación: Price");
        softAssert.assertTrue(productsPage.ifTextPresent(" In Stock"), "Fallo en validación: Availability");
        softAssert.assertTrue(productsPage.ifTextPresent(" New"), "Fallo en validación: Condition");
        softAssert.assertTrue(productsPage.ifTextPresent(" Polo"), "Fallo en validación: Brand");
        softAssert.assertAll(); //Validamos todos los assert
    }

    @Test //TESTCASE 9
    public void searchProductTest(){
        TopHeaderPage topHeaderPage = new TopHeaderPage(driver);
        Assert.assertTrue(topHeaderPage.ifTextPresent("Full-Fledged practice website for Automation Engineers"));
        topHeaderPage.getProductsBtn().click();

        //VERIFICAMOS QUE ESTAMOS EN PRODUCTS PAGE
        ProductsPage productsPage = new ProductsPage(driver);
        Assert.assertTrue(productsPage.ifTextPresent("All Products"));

        //Realizamos pequeño scroll para visualizar mejor los productos
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, 200).perform();

        //Buscamos productos
        productsPage.getSearchProductInput().sendKeys("White");
        productsPage.getSearchProductBtn().click();
        Assert.assertTrue(productsPage.ifTextPresent("Searched Products"));
    }
}
