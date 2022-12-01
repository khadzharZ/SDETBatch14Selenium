package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class loginPagewithPageFactory extends CommonMethods {
    @FindBy(id = "txtUsername")
    public WebElement usernameField;
    @FindBy(xpath = "//input[@id= 'txtPassword']")
    public WebElement passwordField;
    @FindBy(css = "input#btnLogin")
    public WebElement loginbtn;
    //call the constructor to initialize all elements
    public loginPagewithPageFactory(){
        PageFactory.initElements(driver,this);
    }
}
