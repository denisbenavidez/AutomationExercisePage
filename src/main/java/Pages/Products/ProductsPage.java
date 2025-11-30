package Pages.Products;

import Pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends Page {
    public ProductsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    /* //p[text()='Blue Top'] -> Encuentra el producto por su texto único.
     * /ancestor::div[...] -> Sube al contenedor padre <div> que agrupa la imagen y boton.
     * //div[@class='choose']//a -> Baja al botón específico dentro de ese contenedor.
     * //a  seleccionamos el href correspondiente*/

    @FindBy(xpath = "//p[text()='Blue Top']/ancestor::div[@class='product-image-wrapper']//div[@class='choose']")
    private WebElement viewProduct1Btn;

    @FindBy(id = "search_product")
    private WebElement searchProductInput;

    @FindBy(id = "submit_search")
    private WebElement searchProductBtn;


    @FindBy (xpath = "//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[1]//div[2]//div[1]//a[1]")
    private WebElement addCartProduct1Btn;

    public WebElement getViewProduct1Btn(){
        return this.findElement(viewProduct1Btn);
    }

    public WebElement getSearchProductInput(){
        return this.findElement(searchProductInput);
    }

    public WebElement getSearchProductBtn(){
        return this.findElement(searchProductBtn);
    }

    public WebElement getAddCartProduct1Btn(){
        return this.findElement(addCartProduct1Btn);
    }
}