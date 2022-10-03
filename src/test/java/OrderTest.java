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
    private By station = By.xpath(".//button[@value='1']"); //Станция метро Бульвар Рокоссовского
    private String telephone = "79000000000";
    private String comment = "Тествоый комментарий";
    private String expectedTextSuccessOrder = "Заказ оформлен";

    @Test
    public void orderDown() {   //Проверка, что нижняя кнопка "Заказать" переходит по ссылке siteOrder
        driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);
        mainPage.openSite();
        mainPage.scrollToImportantQuestions();
        orderPage.clickDownOrderButton();
        assertEquals("Ссылка нижней кнопки 'Заказать' отличается", orderPage.siteOrder, orderPage.currentUrl());
    }

    @Test
    public void order() {   //Оформление заказа, дата сегодня, период сутки, цвет Черный стопорится на кнопке "Да" в хроме, продолжил выполнять в мозилке
        driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);
        mainPage.openSite();
        orderPage.clickOrderButton();
        orderPage.personalData(name, surname, address, telephone);
        orderPage.setStationOrder(station);
        orderPage.clickNextOrderButton();
        orderPage.setDate();
        orderPage.setPeriod(orderPage.periodOrderDay);
        orderPage.setScooter(orderPage.colorScooterBlack);
        orderPage.setComment(comment);
        orderPage.clickNextOrderButton();
        orderPage.yesButtonClick();
        String actualTextSuccessOrder = orderPage.getTextOfWindowOfSuccessfulOrder();
        MatcherAssert.assertThat("Статус заказа отличается", actualTextSuccessOrder, startsWith(expectedTextSuccessOrder));
    }

    @Test
    public void orderNextMonth() {  //Оформление заказа, дата следующий месяц, период четверо суток, цвет серый, стопорится на кнопке "Да" в хроме, продолжил выполнять в мозилке
        driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);
        mainPage.openSite();
        orderPage.clickOrderButton();
        orderPage.personalData(name, surname, address, telephone);
        orderPage.setStationOrder(station);
        orderPage.clickNextOrderButton();
        orderPage.setNextMonthDateButton();
        orderPage.setPeriod(orderPage.periodOrderFourDay);
        orderPage.setScooter(orderPage.colorScooterGrey);
        orderPage.setComment(comment);
        orderPage.clickNextOrderButton();
        orderPage.yesButtonClick();
        String actualTextSuccessOrder = orderPage.getTextOfWindowOfSuccessfulOrder();
        MatcherAssert.assertThat("Статус заказа отличается", actualTextSuccessOrder, startsWith(expectedTextSuccessOrder));
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
