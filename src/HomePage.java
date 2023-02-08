package Oneplus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends PageObject{

    WebDriverWait w;

    @FindBy(id = "truste-consent-button")
    WebElement accept_cookies;
    @FindBy(className = "callapp-close-icon")
    WebElement close_ad;
    @FindBy(linkText="Phone")
    WebElement phonepage_link;

    @FindBy(xpath = "//a[@productname=\"OnePlus 10R 5G\"]")
    WebElement ourphone_link;

    public HomePage(WebDriver driver){
        super(driver);
        this.w=new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void action(){
        w.until(ExpectedConditions.visibilityOf(close_ad));
        close_ad.click();
        w.until(ExpectedConditions.visibilityOf(accept_cookies));
        accept_cookies.click();
        phonepage_link.click();
        ourphone_link.click();
    }
}
