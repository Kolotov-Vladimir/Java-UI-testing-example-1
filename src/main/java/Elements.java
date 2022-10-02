import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Elements {
    private WebDriver driver;
    public Elements(WebDriver driver) {
        this.driver = driver;
    }

    public String site = "https://qa-scooter.praktikum-services.ru/"; // ссылка на сайт
    public String siteOrder = "https://qa-scooter.praktikum-services.ru/order"; // Ссылка на страницу заказа
    public String QuestionOneText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public String QuestionTwoText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public String QuestionThreeText = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public String QuestionFourText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public String QuestionFiveText = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public String QuestionSixText = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public String QuestionSevenText = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public String QuestionEightText = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
    public By scrollQuestions =  By.id("accordion__heading-0"); //Локатор блока FAQ
    public By QuestionOne = By.xpath(".//div[@aria-controls='accordion__panel-0']");
    public By QuestionTwo = By.xpath(".//div[@aria-controls='accordion__panel-1']");
    public By QuestionThree = By.xpath(".//div[@aria-controls='accordion__panel-2']");
    public By QuestionFour = By.xpath(".//div[@aria-controls='accordion__panel-3']");
    public By QuestionFive = By.xpath(".//div[@aria-controls='accordion__panel-4']");
    public By QuestionSix = By.xpath(".//div[@aria-controls='accordion__panel-5']");
    public By QuestionSeven = By.xpath(".//div[@aria-controls='accordion__panel-6']");
    public By QuestionEight = By.xpath(".//div[@aria-controls='accordion__panel-7']");
    public By scooter = By.className("Header_LogoScooter__3lsAR");//Локатор картинки Самокат
    public By yandex = By.className("Header_LogoYandex__3TSOI");//Локатор картинки Яндекс
    public By orderButton = By.xpath(".//button[(@class = 'Button_Button__ra12g' and (text()='Заказать'))]"); //Локатор кнопки "Заказать" в верхнем углу страницы
    public By downOrderButton = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button"); //Локатор кнопки "Заказать" внизу страницы
    public By nameOrder = By.xpath(".//input[@placeholder='* Имя']"); //Локатор поля Имя
    public By surnameOrder = By.xpath(".//input[@placeholder='* Фамилия']"); //Локатор поля Фамилия
    public By addressOrder = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']"); //Локатор поля Адрес
    public By stationOrder = By.xpath(".//input[@placeholder='* Станция метро']"); //Локатор поля Станция метро
    public By telephoneOrder = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']"); //Локатор поля Телефон
    public By nextOrderButton = By.xpath(".//button[@class ='Button_Button__ra12g Button_Middle__1CSJM']"); //Локатор кнопки Далее

    public By whenOrder = By.xpath(".//input[@placeholder='* Когда привезти самокат']");//Локатор поля даты заказа

    public By dateOrder = By.xpath(".//div[contains(@class, 'react-datepicker__day') and (@tabindex='0')]"); //Локатор сегодняшней даты
    public By dateNextMonthOrder = By.xpath(".//button[@aria-label ='Next Month']"); //Локатор кнопки следующего месяца
    public By periodOrder = By.className("Dropdown-placeholder"); //Локатор поля срок аренды
    public By periodOrderDay =  By.xpath(".//div[@class='Dropdown-option'][1]");//Локатор срока аренды на сутки
    public By periodOrderFourDay =  By.xpath(".//div[@class='Dropdown-option'][4]");//Локатор срока аренды на четверо суток
    public By colorScooterBlack = By.xpath("//*[@id='black']"); //Локатор Черный цвет самоката
    public By colorScooterGrey = By.xpath("//*[@id='grey']"); //Локатор Серый цвет цвет самоката
    public By commentOrder = By.xpath(".//input[@placeholder='Комментарий для курьера']"); //Локатор комментария по доставке
    public By yesButton = By.xpath(".//button[(@class = 'Button_Button__ra12g Button_Middle__1CSJM' and (text()='Да'))]"); //Локатор кнопки Да в заказе
    public By finishModalWindow = By.xpath(".//div[@class = 'Order_ModalHeader__3FDaJ']"); //Локатор текса модального окна успешного оформления



}
