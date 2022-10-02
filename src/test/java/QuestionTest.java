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
        Main main = new Main(driver);
        Elements elements = new Elements(driver);
        main.openSite();
        main.scrollToImportantQuestions();
        main.clickButtonOneQuestion();
        assertEquals(elements.QuestionOneText, driver.findElement(By.id("accordion__panel-0")).getText()); //сравнивает текст
    }
    @Test
    public void testQuestionTwo() {
        driver = new ChromeDriver();
        Main main = new Main(driver);
        Elements elements = new Elements(driver);
        main.openSite();
        main.scrollToImportantQuestions();
        main.clickButtonTwoQuestion();
        assertEquals(elements.QuestionTwoText, driver.findElement(By.id("accordion__panel-1")).getText());
    }
    @Test
    public void testQuestionThree() {
        driver = new ChromeDriver();
        Main main = new Main(driver);
        Elements elements = new Elements(driver);
        main.openSite();
        main.scrollToImportantQuestions();
        main.clickButtonThreeQuestion();
        assertEquals(elements.QuestionThreeText, driver.findElement(By.id("accordion__panel-2")).getText());
    }
    @Test
    public void testQuestionFour() {
        driver = new ChromeDriver();
        Main main = new Main(driver);
        Elements elements = new Elements(driver);
        main.openSite();
        main.scrollToImportantQuestions();
        main.clickButtonFourQuestion();
        assertEquals(elements.QuestionFourText, driver.findElement(By.id("accordion__panel-3")).getText());
    }
    @Test
    public void testQuestionFive() {
        driver = new ChromeDriver();
        Main main = new Main(driver);
        Elements elements = new Elements(driver);
        main.openSite();
        main.scrollToImportantQuestions();
        main.clickButtonFiveQuestion();
        assertEquals(elements.QuestionFiveText, driver.findElement(By.id("accordion__panel-4")).getText());
    }
    @Test
    public void testQuestionSix() {
        driver = new ChromeDriver();
        Main main = new Main(driver);
        Elements elements = new Elements(driver);
        main.openSite();
        main.scrollToImportantQuestions();
        main.clickButtonSixQuestion();
        assertEquals(elements.QuestionSixText, driver.findElement(By.id("accordion__panel-5")).getText());
    }
    @Test
    public void testQuestionSeven() {
        driver = new ChromeDriver();
        Main main = new Main(driver);
        Elements elements = new Elements(driver);
        main.openSite();
        main.scrollToImportantQuestions();
        main.clickButtonSevenQuestion();
        assertEquals(elements.QuestionSevenText, driver.findElement(By.id("accordion__panel-6")).getText());
    }
    @Test
    public void testQuestionEight() {
        driver = new ChromeDriver();
        Main main = new Main(driver);
        Elements elements = new Elements(driver);
        main.openSite();
        main.scrollToImportantQuestions();
        main.clickButtonEightQuestion();
        assertEquals(elements.QuestionEightText, driver.findElement(By.id("accordion__panel-7")).getText());
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
