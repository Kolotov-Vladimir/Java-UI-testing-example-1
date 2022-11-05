import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DopTackPageTest {
    private WebDriver driver;

    @Test
    public void DopTackScooter() {  //Проверить: если нажать на логотип «Самоката», попадёшь на главную страницу «Самоката»
        driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);
        DopTackPage dopTackPage = new DopTackPage(driver);
        mainPage.openSite();
        orderPage.clickOrderButton();
        dopTackPage.scooterClick();
        assertEquals(mainPage.site, orderPage.currentUrl());
    }

    @Test
    public void DopTackYandex() {   //Проверить: если нажать на логотип Яндекса, в новом окне откроется главная страница Яндекса
        driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);
        DopTackPage dopTackPage = new DopTackPage(driver);
        mainPage.openSite();
        orderPage.clickOrderButton();
        dopTackPage.yandexClick();
        assertNotEquals(mainPage.site, orderPage.currentUrl());
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
