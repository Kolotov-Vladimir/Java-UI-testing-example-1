import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {
    private WebDriver driver;
    Elements elements = new Elements(driver);
    public Main(WebDriver driver) {
        this.driver = driver;
    }

    public void openSite() {
        driver.get(elements.site);
    } //открытие сайта

//Блок теста вопросов
    public void scrollToImportantQuestions() { //скролл до элемента FAQ
        WebElement element = driver.findElement(elements.scrollQuestions);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);}
    public void standBy(By element){ //Ожидание
        WebElement dynamicElement = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(element));}

    public void clickButtonOneQuestion() {    //Кликаем по первому вопросу
        standBy(elements.QuestionOne);
        driver.findElement(elements.QuestionOne).click();}

    public void clickButtonTwoQuestion() {    //Кликаем по второму вопросу
        standBy(elements.QuestionTwo);
        driver.findElement(elements.QuestionTwo).click();}

    public void clickButtonThreeQuestion() {    //Кликаем по третьему вопросу
        standBy(elements.QuestionThree);
        driver.findElement(elements.QuestionThree).click();}

    public void clickButtonFourQuestion() {    //Кликаем по четвертому вопросу
        standBy(elements.QuestionFour);
        driver.findElement(elements.QuestionFour).click();}

    public void clickButtonFiveQuestion() {    //Кликаем по пятому вопросу
        standBy(elements.QuestionFive);
        driver.findElement(elements.QuestionFive).click();}

    public void clickButtonSixQuestion() {    //Кликаем по шестому вопросу
        standBy(elements.QuestionSix);
        driver.findElement(elements.QuestionSix).click();}

    public void clickButtonSevenQuestion() {    //Кликаем по седьмому вопросу
        standBy(elements.QuestionSeven);
        driver.findElement(elements.QuestionSeven).click();}

    public void clickButtonEightQuestion() {    //Кликаем по восьмому вопросу
        standBy(elements.QuestionEight);
        driver.findElement(elements.QuestionEight).click();}


    //блок доп задания клик по изображению Самоката и  Яндекс
    public void scooterClick(){ //Клакаем по кнопка Скутера
        driver.findElement(elements.scooter).click();}
    public void yandexClick(){ //Клакаем по кнопка Скутера
        driver.findElement(elements.yandex).click();}
    public String currentUrl() {   //Получение URL текущей страницы
       return driver.getCurrentUrl();}

    //блок тестирования Заказа

    public void clickOrderButton(){ // Нажатие на кнопку Заказать в верхнем углу
        driver.findElement(elements.orderButton).click();}

    public void clickDownOrderButton(){ // Нажатие на кнопку Заказать внизу
        driver.findElement(elements.downOrderButton).click();}

    public void setNameOrder(String name){ //метод заполнения имени
        driver.findElement(elements.nameOrder).sendKeys(name);}
    public void setSurnameOrder(String surname){//метод заполнения фамилии
        driver.findElement(elements.surnameOrder).sendKeys(surname);}
    public void setAddressOrder(String address){//метод заполнения адреса
        driver.findElement(elements.addressOrder).sendKeys(address);}
    public void setStationOrder(By station){//метод заполнения станции
        driver.findElement(elements.stationOrder).click();
        driver.findElement(station).click();}
    public void setTelephoneOrder(String telephone){//метод заполнения телефона
        driver.findElement(elements.telephoneOrder).sendKeys(telephone);}

    public void personalData(String username, String surname, String address, String number) {
        setNameOrder(username);
        setSurnameOrder(surname);
        setAddressOrder(address);
        setTelephoneOrder(number);}

    public void clickNextOrderButton(){ //метод нажатия на кнопку Далее
        driver.findElement(elements.nextOrderButton).click();}

    public void setNextMonthDateButton(){ //метод заполнения даты следующего месяца
        driver.findElement(elements.whenOrder).click();
        driver.findElement(elements.dateNextMonthOrder).click();
        driver.findElement(elements.dateOrder).click();}


    public void setDate(){ //метод заполнения сегодняшней даты
        driver.findElement(elements.whenOrder).click();
        driver.findElement(elements.dateOrder).click();}

    public void setPeriod(By element){ //метод срока аренды
        driver.findElement(elements.periodOrder).click();
        driver.findElement(element).click();}
    public void setScooter(By element){ //метод выбора цвета самоката
        driver.findElement(element).click();}
    public void setComment(String  element){ //метод записи комментария
        driver.findElement(elements.commentOrder).sendKeys(element);}
    public void yesButtonClick(){ //метод клика по кнопке Да в заказе
        driver.findElement(elements.yesButton).click();}
    public String getTextOfWindowOfSuccessfulOrder() { // метод возврата текста окна завершения заказа
        return driver.findElement(elements.finishModalWindow).getText();
    }

}
