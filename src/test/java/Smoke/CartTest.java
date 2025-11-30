package Smoke;

import Pages.Global.TopHeaderPage;
import Pages.Products.ProductsPage;
import TestCaseImplements.TestCase;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends TestCase {

    @Test //12
    public void addProductToCartTest(){

        Actions actions = new Actions(driver);
        TopHeaderPage topHeaderPage = new TopHeaderPage(driver);
        Assert.assertTrue(topHeaderPage.ifTextPresent("Full-Fledged practice website for Automation Engineers"));
        topHeaderPage.getProductsBtn().click();

        ProductsPage productsPage = new ProductsPage(driver);
        actions.moveToElement(productsPage.getAddCartProduct1Btn()).perform();


    }

}
