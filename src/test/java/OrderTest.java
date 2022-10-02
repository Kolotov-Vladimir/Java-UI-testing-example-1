import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.startsWith;


public class OrderTest {
    private WebDriver driver;
    private String name = "Геннадий";
    private String surname = "Бякин";
    private String address = "Тест адрес";
    private By station = By.xpath(".//button[@value='1']");//Станция метро Бульвар Рокоссовского
    private String telephone = "79000000000";
    private String comment = "Тествоый комментарий";
    private String expectedTextSuccessOrder = "Заказ оформлен";

    @Test
    public void orderDown(){ //Проверка, что нижняя кнопка "Заказать" переходит по ссылке siteOrder
        driver = new ChromeDriver();
        Main main = new Main(driver);
        Elements elements = new Elements(driver);
        main.openSite();
        main.scrollToImportantQuestions();
        main.clickDownOrderButton();
        assertEquals("Ссылка нижней кнопки 'Заказать' отличается", elements.siteOrder, main.currentUrl());
    }
    @Test
    public void order() { //Оформление заказа, дата сегодня, период сутки, цвет Черный стопорится на кнопке "Да" в хроме, продолжил выполнять в мозилке
        driver = new ChromeDriver();
        Main main = new Main(driver);
        Elements elements = new Elements(driver);
        main.openSite();
        main.clickOrderButton();
        main.personalData(name, surname, address, telephone);
        main.setStationOrder(station);
        main.clickNextOrderButton();
        main.setDate();
        main.setPeriod(elements.periodOrderDay);
        main.setScooter(elements.colorScooterBlack);
        main.setComment(comment);
        main.clickNextOrderButton();
        main.yesButtonClick();
        String actualTextSuccessOrder = main.getTextOfWindowOfSuccessfulOrder();
        MatcherAssert.assertThat("Статус заказа отличается", actualTextSuccessOrder, startsWith(expectedTextSuccessOrder));
    }
    @Test
    public void orderNextMonth() { //Оформление заказа, дата следующий месяц, период четверо суток, цвет серый, стопорится на кнопке "Да" в хроме, продолжил выполнять в мозилке
        driver = new ChromeDriver();
        Main main = new Main(driver);
        Elements elements = new Elements(driver);
        main.openSite();
        main.clickOrderButton();
        main.personalData(name, surname, address, telephone);
        main.setStationOrder(station);
        main.clickNextOrderButton();
        main.setNextMonthDateButton();
        main.setPeriod(elements.periodOrderFourDay);
        main.setScooter(elements.colorScooterGrey);
        main.setComment(comment);
        main.clickNextOrderButton();
        main.yesButtonClick();
        String actualTextSuccessOrder = main.getTextOfWindowOfSuccessfulOrder();
        MatcherAssert.assertThat("Статус заказа отличается", actualTextSuccessOrder, startsWith(expectedTextSuccessOrder));
    }

   @After
    public void teardown() {
        driver.quit();
    }
}
