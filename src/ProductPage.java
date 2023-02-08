package Oneplus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageObject{

        ProductPage(WebDriver driver){
            super(driver);
        }

        @FindBy(id ="checkout-add")
        WebElement checkout_btn;

        @FindBy(xpath ="//div[@class='new-button btn-text new-button--primary new-button--small']")
        WebElement addons_btn;

        public void action(){
            checkout_btn.click();
            addons_btn.click();
        }
}
