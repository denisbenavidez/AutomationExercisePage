package Pages.Account;

import Pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage extends Page {
    public SignUpPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //Account Information
    @FindBy (id = "id_gender1")
    public WebElement radioMrBtn;

    @FindBy (id = "name")
    public WebElement nameInput;

    @FindBy (id = "password")
    public WebElement passwordInput;

    // Elementos Select para la Fecha de Nacimiento
    @FindBy(id = "days")
    public WebElement daysSelect;

    @FindBy(id = "months")
    public WebElement monthsSelect;

    @FindBy(id = "years")
    public WebElement yearsSelect;

    //Opciones
    @FindBy (id = "newsletter")
    public WebElement newsletterBtn;

    @FindBy (id = "optin")
    public WebElement receiveOffersBtn;

    //Address information elementos
    @FindBy (id = "first_name")
    public WebElement firstNameInput;

    @FindBy (id = "last_name")
    public WebElement lastNameInput;

    @FindBy (id = "company")
    public WebElement companyInput;

    @FindBy (id = "address1")
    public WebElement addressInput;

    @FindBy (id = "address2")
    public WebElement address2Input;

    @FindBy (id = "country") //SELECT COUNTRY
    public WebElement countrySelect;

    @FindBy (id = "state")
    public WebElement stateSelect;

    @FindBy (id = "city")
    public WebElement cityInput;

    @FindBy (id = "zipcode")
    public WebElement zipCodeInput;

    @FindBy (id = "mobile_number")
    public WebElement mobileNumberInput;

    @FindBy (xpath = "//button[normalize-space()='Create Account']")
    public WebElement createAccountBtn;


    //Account Information
    public WebElement getRadioMrBtn(){
        return this.findElement(radioMrBtn);
    }

    public WebElement getPasswordInput(){
        return this.findElement(passwordInput);
    }

    //SELECTS para la fecha de nacimiento
    public WebElement getDaysSelect(){
        return this.findElement(daysSelect);
    }

    public WebElement getMonthsSelect(){
        return this.findElement(monthsSelect);
    }

    public WebElement getYearsSelect(){
        return this.findElement(yearsSelect);
    }

    public void selectDateOfBirth(String day, String month, String year){
        Select dayDropdown = new Select(this.getDaysSelect());
        dayDropdown.selectByValue(day);

        Select monthDropdown = new Select(this.getMonthsSelect());
        monthDropdown.selectByValue(month);

        Select yearDropdown = new Select(this.getYearsSelect());
        yearDropdown.selectByValue(year);
    }

    //Newsletter y Recibir ofertas
    public WebElement getNewsletterBtn(){
        return this.findElement(newsletterBtn);
    }

    public WebElement getReceiveOffersBtn(){
        return this.findElement(receiveOffersBtn);
    }

    // Address Information
    public WebElement getFirstNameInput(){
        return this.findElement(firstNameInput);
    }

    public WebElement getLastNameInput(){
        return this.findElement(lastNameInput);
    }

    public WebElement getCompanyInput(){
        return this.findElement(companyInput);
    }

    public WebElement getAddressInput(){
        return this.findElement(addressInput);
    }

    public WebElement getAddress2Input(){
        return this.findElement(address2Input);
    }

    //Select Country
    public WebElement getCountrySelect(){
        return this.findElement(countrySelect);
    }

    public void selectCountry(String country){
        Select countryDropdown = new Select(this.getCountrySelect());
        countryDropdown.selectByValue(country);
    }

    public WebElement getStateInput(){
        return this.findElement(stateSelect);
    }

    public WebElement getCityInput(){
        return this.findElement(cityInput);
    }

    public WebElement getZipCodeInput(){
        return this.findElement(zipCodeInput);
    }

    public WebElement getMobileNumberInput(){
        return this.findElement(mobileNumberInput);
    }

    public WebElement getCreateAccountBtn(){
        return this.findElement(createAccountBtn);
    }
}
