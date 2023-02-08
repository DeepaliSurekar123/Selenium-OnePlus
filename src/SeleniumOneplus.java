package Oneplus;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;

public class SeleniumOneplus {

    public static Properties getProperties(){
        Properties prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/Uilities/userdeatils.properties");
            prop.load(fis);
        }catch (Exception e){
            e.printStackTrace();
        }
        return prop;
    }

    public static void main(String[] args) throws InterruptedException {

        Properties prop = getProperties();
        ChromeOptions handlingSSL = new ChromeOptions();
        handlingSSL.setAcceptInsecureCerts(true);
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver(handlingSSL);
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        LoginPage lg=new LoginPage(driver);
        HomePage hg=new HomePage(driver);
        ProductPage pg=new ProductPage(driver);

        lg.action(prop);
        hg.action();
        ArrayList<String> win = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(win.get(1));
        pg.action();
        driver.close();

    }
}
