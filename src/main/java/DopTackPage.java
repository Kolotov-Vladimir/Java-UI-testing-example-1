import org.openqa.selenium.WebDriver;

public class DopTackPage {
    private WebDriver driver;

    public DopTackPage(WebDriver driver) {
        this.driver = driver;
    }

    OrderPage orderPage = new OrderPage(driver);

    public void scooterClick() { //Клакаем по кнопка Скутера
        driver.findElement(orderPage.scooter).click();
    }

    public void yandexClick() { //Клакаем по кнопка Скутера
        driver.findElement(orderPage.yandex).click();
    }
}
