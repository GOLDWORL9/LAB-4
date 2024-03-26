import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;

public class SmokeTest
{

    private WebDriver browser;
    @Before
    public void precondition() {
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("https://volley.ru");
    }

    @Test
    public void Test1()
    {
        MainPage mainPage = new MainPage(browser);
        mainPage.Click();
        String label = mainPage.GetLabel1();
        Assert.assertEquals(label,"ВОЛЕЙБОЛ ТВ");
    }
    @Test
    public void Test2()
    {
        MainPage mainPage = new MainPage(browser);
        mainPage.Click();
        String label = mainPage.GetLabel2();
        Assert.assertEquals(label,"ВОЛЕЙБОЛ");
    }

    @Test
    public void Test3()
    {
        MainPage mainPage = new MainPage(browser);
        mainPage.Click();
        String label = mainPage.GetLabel3();
        Assert.assertEquals(label,"ПЛЯЖНЫЙ ВОЛЕЙБОЛ");
    }

    @Test
    public void Test4()
    {
        MainPage mainPage = new MainPage(browser);
        mainPage.Click();
        String label = mainPage.GetLabel4();
        Assert.assertEquals(label,"ПЛЯЖНЫЙ ВОЛЕЙБОЛ");
    }
    @Test
    public void Test5()
    {
        MainPage mainPage = new MainPage(browser);
        mainPage.Click();
        String label = mainPage.GetLabel5();
        Assert.assertEquals(label,"100 ЛЕТ");
    }

    @After
    public void closeBrowser() {
        browser.quit();
    }

}
