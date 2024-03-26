package utils;

import org.openqa.selenium.By;

public interface Locators {

    public interface MainPage{
        By JAVA_BUTTON = By.xpath("/html/body/div[1]/header/div[1]/a/img");
        By Label1 = By.xpath("//*[@id=\"nav-links\"]/a[1]");
        By Label2 = By.xpath("//*[@id=\"nav-links\"]/a[2]");
        By Label3 = By.xpath("//*[@id=\"nav-links\"]/a[3]");
        By Label4 = By.xpath("//*[@id=\"nav-links\"]/a[4]");
        By Label5 = By.xpath("//*[@id=\"nav-links\"]/a[5]");

    }
}
