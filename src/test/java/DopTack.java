import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DopTack {
    private WebDriver driver;

    @Test
    public void DopTackScooter() { //Проверить: если нажать на логотип «Самоката», попадёшь на главную страницу «Самоката»
        driver = new ChromeDriver();
        Main main = new Main(driver);
        Elements elements = new Elements(driver);
        main.openSite();
        main.clickOrderButton();
        main.scooterClick();
        assertEquals(elements.site, main.currentUrl());
    }
    @Test
    public void DopTackYandex() {//Проверить: если нажать на логотип Яндекса, в новом окне откроется главная страница Яндекса
        driver = new ChromeDriver();
        Main main = new Main(driver);
        Elements elements = new Elements(driver);
        main.openSite();
        main.clickOrderButton();
        main.yandexClick();
        assertNotEquals(elements.site, main.currentUrl());
    }
    @After
    public void teardown() {
        driver.quit();
    }
}
