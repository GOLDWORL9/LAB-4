package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Locators;

public class MainPage
{

    private WebDriver browser;

    public MainPage(WebDriver browser) {
        this.browser = browser;
    }


    public void Click()
    {
        WebElement javaButton = browser.findElement(Locators.MainPage.JAVA_BUTTON);
        javaButton.click();
    }

    public String GetLabel1() {
        WebElement textAboutJava = browser.findElement(Locators.MainPage.Label1);
        return textAboutJava.getText();
    }
    public String GetLabel2() {
        WebElement textAboutJava = browser.findElement(Locators.MainPage.Label2);
        return textAboutJava.getText();
    }
    public String GetLabel3() {
        WebElement textAboutJava = browser.findElement(Locators.MainPage.Label3);
        return textAboutJava.getText();
    }
    public String GetLabel4() {
        WebElement textAboutJava = browser.findElement(Locators.MainPage.Label4);
        return textAboutJava.getText();
    }
    public String GetLabel5() {
        WebElement textAboutJava = browser.findElement(Locators.MainPage.Label5);
        return textAboutJava.getText();
    }

}
