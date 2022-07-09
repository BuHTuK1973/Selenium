package PageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePageScooter {
    public static final String URL = "https://qa-scooter.praktikum-services.ru/";
    //        [ ]  Картинка-логотип самоката.
    private final By logoMain = By.className("Header_Logo__23yGT");
    //            [ ]  Логотип "Яндекс".
    private final By logoYandex = By.className("Header_LogoYandex__3TSOI");
    //            [ ]  Логотип "Самокат".
    private final By logoScooter = By.className("Header_LogoScooter__3lsAR");
    //            [ ]  Логотип "Учебный тренажер".
    private final By logoDisclaimer = By.className("Header_Disclaimer__3VEni");
    //            [ ]  App Cookie Consent
    private final By appCookieConsent = By.className("App_CookieConsent__1yUIN");
    //    [ ]  Текст App Cookie Consent "И здесь куки! В общем, мы их используем."
    private final By appCookieText = By.className("App_CookieText__1sbqp");
    //            [ ]  Кнопка "да все привыкли"
    private final By appCookieButton = By.className("App_CookieButton__3cvqF");
    //            [ ]  Заголовок "Самокат на пару дней".
    private final By homeHeader = By.className("Home_Header__iJKdX");
    //            [ ]  Подзаголовок "Привезём его прямо к вашей двери,а когда накатаетесь — заберём.
    private final By homeSubHeaderFirst = By.xpath(".//div[@class='Home_SubHeader__zwi_E'][text()='Привезём его прямо к вашей двери,']");
    //            [ ]  Подзаголовок "Он лёгкий и с мощными колёсами— самое то, чтобы ехать по набережной и нежно барабанить пальцами по рулю"
    private final By homeSubHeaderSecond = By.xpath(".//div[@class='Home_SubHeader__zwi_E'][text()='Он лёгкий и с мощными колёсами— самое то, чтобы ехать по набережной и нежно барабанить пальцами по рулю']");
    //            [ ]  Кнопка "Заказать" в хедере страницы.
    private final By btnHeaderOrder = By.xpath(".//button[@class='Button_Button__ra12g' and text()='Заказать']");
    //    [ ]  Элемент "Статус заказа" в хедере страницы.
    private final By btnHeaderStatus = By.className("Header_Link__1TAG7");
    //    [ ]  Поле ввода номера заказа - Появляется после клака по кнопке "Статус заказа"
    private final By inputOrderNumber = By.cssSelector("input[class='Input_Input__1iN_Z Header_Input__xIoUq']");
    //            [ ]  Кнопка "Go" - Появляется после клака по кнопке "Статус заказа"
    private final By btnGo = By.cssSelector("button[class='Button_Button__ra12g Header_Button__28dPO']");
    //            [ ]  Картинка "Самокат" blueprint.
    private final By imgBlueprint = By.xpath(".//img[@src='/assets/blueprint.png']");
    //            [ ]  Картинка "Самокат" scooter.
    private final By imgScooter = By.xpath(".//img[@src='/assets/scooter.png']");
    //            [ ]  Элемент-блок с параметрами самоката (скорость, расстояние, вес).
    private final By tableParameter = By.xpath(".Home_Table__2kPxP");
    //            [ ]  Блок с характеристиками
    private final By tableParameterRow = By.xpath(".Home_Row__jdQW2");
    //    [ ]  Модель Toxic PRO
    private final By tableElementModelToxicPro = By.xpath(".//div[@class='Home_Table__2kPxP']/div[1]/div");
    //    [ ]  Максимальная скорость
    private final By tableElementMaxSpeed = By.xpath(".//div[@class='Home_Table__2kPxP']/div[3]/div[1]");
    //    [ ]  40 км/ч
    private final By tableElementMaxSpeedValue = By.xpath(".//div[@class='Home_Table__2kPxP']/div[3]/div[2]");
    //    [ ]  Проедет без подзарядки
    private final By tableElementWithoutCharge = By.xpath(".//div[@class='Home_Table__2kPxP']/div[4]/div[1]");
    //            [ ]  80 км
    private final By tableElementWithoutChargeValue = By.xpath(".//div[@class='Home_Table__2kPxP']/div[4]/div[2]");
    //    [ ]  Выдерживает вес
    private final By tableElementWeight = By.xpath(".//div[@class='Home_Table__2kPxP']/div[5]/div[1]");
    //    [ ]  120 кг
    private final By tableElementWeightValue = By.xpath(".//div[@class='Home_Table__2kPxP']/div[5]/div[2]");
    //    [ ]  Подзаголовок "Как это работает"
    private final By subHeaderHowItWorks = By.xpath(".//div[text()='Как это работает']");
    //            [ ]  Элемент "Кружок с цифрой 1 внутри"
    private final By circleOne = By.xpath(".//div[1][@class='Home_StatusBrick__1PsW9']/div[1]");
    //            [ ]  Элемент "Кружок с цифрой 2 внутри".
    private final By circleTwo = By.xpath(".//div[2][@class='Home_StatusBrick__1PsW9']/div[1]");
    //            [ ]  Элемент "Кружок с цифрой 3 внутри".
    private final By circleThree = By.xpath(".//div[3][@class='Home_StatusBrick__1PsW9']/div[1]");
    //            [ ]  Элемент "Кружок с цифрой 4 внутри".
    private final By circleFour = By.xpath(".//div[4][@class='Home_StatusBrick__1PsW9']/div[1]");
    //            [ ]  Шаг 1 "Заказываете самокат"
    private final By stepOneDiscription = By.xpath(".//div[1][@class='Home_StatusBrick__1PsW9']/div[2]/div[1]");
    //            [ ]  Описание Шага 1 "Выбираете, когда и куда привезти".
    private final By stepOneSubDiscription = By.xpath(".//div[1][@class='Home_StatusBrick__1PsW9']/div[2]/div[2]");
    //            [ ]  Шаг 2 "Курьер привозит самокат".
    private final By stepTwoDiscription = By.xpath(".//div[2][@class='Home_StatusBrick__1PsW9']/div[2]/div[1]");
    //            [ ]  Описание Шага 2 "А вы — оплачиваете аренду"
    private final By stepTwoSubDiscription = By.xpath(".//div[2][@class='Home_StatusBrick__1PsW9']/div[2]/div[2]");
    //            [ ]  Шаг 3 "Катаетесь".
    private final By stepThreeDiscription = By.xpath(".//div[3][@class='Home_StatusBrick__1PsW9']/div[2]/div[1]");
    //            [ ]  Описание Шага 3 "Сколько часов аренды осталось — видно на сайте"
    private final By stepThreeSubDiscription = By.xpath(".//div[3][@class='Home_StatusBrick__1PsW9']/div[2]/div[2]");
    //            [ ]  Шаг 4 "Курьер забирает самокат".
    private final By stepFourDiscription = By.xpath(".//div[4][@class='Home_StatusBrick__1PsW9']/div[2]/div[1]");
    //            [ ]  Описание Шага 4 "Когда аренда заканчивается".
    private final By stepFourSubDiscription = By.xpath(".//div[4][@class='Home_StatusBrick__1PsW9']/div[2]/div[2]");
    //            [ ]  Кнопка "Заказать" в нижней части страницы.
    private final By btnMiddleOrder = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']");
    //            [ ]  Вопросы о важном
    private final By subHeaderForScroll = By.xpath(".//div[text()='Вопросы о важном']");
    //    [ ]  Блок вопросов:
    private final By accordionQuestions = By.className("accordion");
    //            [ ]  Вопрос №1 "Сколько это стоит и как оплатить"
    private final By questionOne = By.id("accordion__heading-0");
    //            [ ]  Ответ на вопрос №1 "Сутки — 400 рублей. Оплата курьеру — наличными или картой.".
    private final By answerOne = By.id("accordion__panel-0");
    //            [ ]  Вопрос №2 "Хочу сразу несколько самокатов! Так можно?"
    private final By questionTwo = By.id("accordion__heading-1");
    //            [ ]  Ответ на вопрос №2. "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."
    private final By answerTwo = By.id("accordion__panel-1");
    //            [ ]  Вопрос №3 "Как рассчитывается время аренды?"
    private final By questionThree = By.id("accordion__heading-2");
    //            [ ]  Ответ на вопрос №3. "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."
    private final By answerThree = By.id("accordion__panel-2");
    //            [ ]  Вопрос №4 "Можно ли заказать самокат прямо на сегодня?"
    private final By questionFour = By.id("accordion__heading-3");
    //            [ ]  Ответ на вопрос №4. "Только начиная с завтрашнего дня. Но скоро станем расторопнее."
    private final By answerFour = By.id("accordion__panel-3");
    //            [ ]  Вопрос №5 "Можно ли продлить заказ или вернуть самокат раньше?"
    private final By questionFive = By.id("accordion__heading-4");
    //            [ ]  Ответ на вопрос №5. "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."
    private final By answerFive = By.id("accordion__panel-4");
    //            [ ]  Вопрос №6 "Вы привозите зарядку вместе с самокатом?"
    private final By questionSix = By.id("accordion__heading-5");
    //            [ ]  Ответ на вопрос №6. "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.""
    private final By answerSix = By.id("accordion__panel-5");
    //            [ ]  Вопрос №7 "Можно ли отменить заказ?"
    private final By questionSeven = By.id("accordion__heading-6");
    //            [ ]  Ответ на вопрос №7. "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."
    private final By answerSeven = By.id("accordion__panel-6");
    //            [ ]  Вопрос №8 "Я жизу за МКАДом, привезёте?"
    private final By questionEight = By.id("accordion__heading-7");
    //            [ ]  Ответ на вопрос №8. "Да, обязательно. Всем самокатов! И Москве, и Московской области."
    private final By answerEight = By.id("accordion__panel-7");

    public void scrollSubHeaderForScroll(WebDriver driver) {

        WebElement element = driver.findElement(subHeaderForScroll);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

    }

    public void clickQuestionOne(WebDriver driver) { driver.findElement(questionOne).click(); }

    public String getTextOfAnswerOne(WebDriver driver) {
        return driver.findElement(answerOne).getText();
    }

    public String isTextOfAnswerOneMatches(WebDriver driver) {
        scrollSubHeaderForScroll(driver);
        clickQuestionOne(driver);
        new WebDriverWait(driver, 1)
                .until(ExpectedConditions.visibilityOfElementLocated(answerOne));
        return getTextOfAnswerOne(driver);
    }

    public void clickQuestionTwo(WebDriver driver) {
        driver.findElement(questionTwo).click();
    }

    public String getTextOfAnswerTwo(WebDriver driver) {
        return driver.findElement(answerTwo).getText();
    }

    public String isTextOfAnswerTwoMatches(WebDriver driver) {
        scrollSubHeaderForScroll(driver);
        clickQuestionTwo(driver);
        new WebDriverWait(driver, 1)
                .until(ExpectedConditions.visibilityOfElementLocated(answerTwo));
        return getTextOfAnswerTwo(driver);
    }

    public void clickQuestionThree(WebDriver driver) {
        driver.findElement(questionThree).click();
    }

    public String getTextOfAnswerThree(WebDriver driver) {
        return driver.findElement(answerThree).getText();
    }

    public String isTextOfAnswerThreeMatches(WebDriver driver) {
        scrollSubHeaderForScroll(driver);
        clickQuestionThree(driver);
        new WebDriverWait(driver, 1)
                .until(ExpectedConditions.visibilityOfElementLocated(answerThree));
        return getTextOfAnswerThree(driver);
    }

    public void clickQuestionFour(WebDriver driver) {
        driver.findElement(questionFour).click();
    }

    public String getTextOfAnswerFour(WebDriver driver) {
        return driver.findElement(answerFour).getText();
    }

    public String isTextOfAnswerFourMatches(WebDriver driver) {
        scrollSubHeaderForScroll(driver);
        clickQuestionFour(driver);
        new WebDriverWait(driver, 1)
                .until(ExpectedConditions.visibilityOfElementLocated(answerFour));
        return getTextOfAnswerFour(driver);
    }

    public void clickQuestionFive(WebDriver driver) {
        driver.findElement(questionFive).click();
    }

    public String getTextOfAnswerFive(WebDriver driver) {
        return driver.findElement(answerFive).getText();
    }

    public String isTextOfAnswerFiveMatches(WebDriver driver) {
        scrollSubHeaderForScroll(driver);
        clickQuestionFive(driver);
        new WebDriverWait(driver, 1)
                .until(ExpectedConditions.visibilityOfElementLocated(answerFive));
        return getTextOfAnswerFive(driver);
    }

    public void clickQuestionSix(WebDriver driver) {
        driver.findElement(questionSix).click();
    }

    public String getTextOfAnswerSix(WebDriver driver) {
        return driver.findElement(answerSix).getText();
    }

    public String isTextOfAnswerSixMatches(WebDriver driver) {
        scrollSubHeaderForScroll(driver);
        clickQuestionSix(driver);
        new WebDriverWait(driver, 1)
                .until(ExpectedConditions.visibilityOfElementLocated(answerSix));
        return getTextOfAnswerSix(driver);
    }

    public void clickQuestionSeven(WebDriver driver) {
        driver.findElement(questionSeven).click();
    }

    public String getTextOfAnswerSeven(WebDriver driver) {
        return driver.findElement(answerSeven).getText();
    }

    public String isTextOfAnswerSevenMatches(WebDriver driver) {
        scrollSubHeaderForScroll(driver);
        clickQuestionSeven(driver);
        new WebDriverWait(driver, 1)
                .until(ExpectedConditions.visibilityOfElementLocated(answerSeven));
        return getTextOfAnswerSeven(driver);
    }

    public void clickQuestionEight(WebDriver driver) {
        driver.findElement(questionEight).click();
    }

    public String getTextOfAnswerEight(WebDriver driver) {
        return driver.findElement(answerEight).getText();
    }

    public String isTextOfAnswerEightMatches(WebDriver driver) {
        scrollSubHeaderForScroll(driver);
        clickQuestionEight(driver);
        new WebDriverWait(driver, 1)
                .until(ExpectedConditions.visibilityOfElementLocated(answerEight));
        return getTextOfAnswerEight(driver);

    }

    public OrderPage clickBtnHeaderOrder(WebDriver driver) {
        driver.findElement(btnHeaderOrder).click();
        return new OrderPage();
    }

    public OrderPage clickBtnMiddleOrder(WebDriver driver) {
        WebElement element = driver.findElement(btnMiddleOrder);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        return new OrderPage();
    }
}
