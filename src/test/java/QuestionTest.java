import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void testQuestionOne() {
        driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);
        mainPage.openSite();
        mainPage.scrollToImportantQuestions();
        mainPage.clickButtonOneQuestion();
        assertEquals(mainPage.QuestionOneText, driver.findElement(By.id("accordion__panel-0")).getText());  //сравнивает текст
    }

    @Test
    public void testQuestionTwo() {
        driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);
        mainPage.openSite();
        mainPage.scrollToImportantQuestions();
        mainPage.clickButtonTwoQuestion();
        assertEquals(mainPage.QuestionTwoText, driver.findElement(By.id("accordion__panel-1")).getText());
    }

    @Test
    public void testQuestionThree() {
        driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);
        mainPage.openSite();
        mainPage.scrollToImportantQuestions();
        mainPage.clickButtonThreeQuestion();
        assertEquals(mainPage.QuestionThreeText, driver.findElement(By.id("accordion__panel-2")).getText());
    }

    @Test
    public void testQuestionFour() {
        driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);
        mainPage.openSite();
        mainPage.scrollToImportantQuestions();
        mainPage.clickButtonFourQuestion();
        assertEquals(mainPage.QuestionFourText, driver.findElement(By.id("accordion__panel-3")).getText());
    }

    @Test
    public void testQuestionFive() {
        driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);
        mainPage.openSite();
        mainPage.scrollToImportantQuestions();
        mainPage.clickButtonFiveQuestion();
        assertEquals(mainPage.QuestionFiveText, driver.findElement(By.id("accordion__panel-4")).getText());
    }

    @Test
    public void testQuestionSix() {
        driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);
        mainPage.openSite();
        mainPage.scrollToImportantQuestions();
        mainPage.clickButtonSixQuestion();
        assertEquals(mainPage.QuestionSixText, driver.findElement(By.id("accordion__panel-5")).getText());
    }

    @Test
    public void testQuestionSeven() {
        driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);
        mainPage.openSite();
        mainPage.scrollToImportantQuestions();
        mainPage.clickButtonSevenQuestion();
        assertEquals(mainPage.QuestionSevenText, driver.findElement(By.id("accordion__panel-6")).getText());
    }

    @Test
    public void testQuestionEight() {
        driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);
        mainPage.openSite();
        mainPage.scrollToImportantQuestions();
        mainPage.clickButtonEightQuestion();
        assertEquals(mainPage.QuestionEightText, driver.findElement(By.id("accordion__panel-7")).getText());
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
