package Oneplus;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.Properties;

public class LoginPage extends PageObject{
    LoginPage(WebDriver driver){
        super(driver);
    }
    @FindBy(id = "show-user-info")
    WebElement account_btn;
    @FindBy(className = "switch-login-btn")
    WebElement switch_login;
    @FindBy(xpath = "//input[@name=\"input-email\"]")
    WebElement email_textbox;
    @FindBy(xpath = "//input[@name=\"input-password\"]")
    WebElement pass_textbox;
    @FindBy(className = "submit-btn")
    WebElement submit_btn;
    public void action(Properties prop){
        account_btn.click();
        switch_login.click();
        email_textbox.sendKeys(prop.getProperty("username"));
        pass_textbox.sendKeys(prop.getProperty("password"));
        submit_btn.click();
    }
}
