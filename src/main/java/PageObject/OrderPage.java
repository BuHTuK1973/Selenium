package PageObject;

import org.openqa.selenium.*;

import java.util.List;

public class OrderPage {
    private final WebDriver driver;
    //Первая форма
    //локатор поля Имя
    private final By inputName = By.xpath(".//input[@placeholder='* Имя']");
    //локатор поля Фамилия
    private final By inputSurname = By.xpath(".//input[@placeholder='* Фамилия']");
    //локатор поля Адрес
    private final By inputAddress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    //локатор поля Станция метро
    private final By inputSubway = By.xpath(".//input[@placeholder='* Станция метро']");
    //локатор списка станций
    private final By subwayPanel = By.cssSelector(".select-search");
    //локатор поля Станция метро
    private final By inputPhone = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    //локтор кнопки Далее формы
    private final By btnNext = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Далее']");

    //Вторая форма
    //локатор поля Когда привезти самокат
    private final By inputWhen = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    //локатор поля Когда привезти самокат
    private final By inputComment = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    //локатор поля срок аренды/
    private final By rentalPeriod = By.className("Dropdown-root");
    //локатор поля срок аренды
    private final By rentalPeriodOptions = By.className("Dropdown-option");
    //локатор чекбоксов Цвет самоката
    private final By scooterColorChekboxes = By.className("Checkbox_Label__3wxSf");
    //кнопка заказа в центре страницы
    private final By btnMiddleOrder = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']");
    //кнопка ДА в окошке Хотите оформить заказ?
    private final By btnYes = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Да']");
    //локатор окошка Заказ оформлен
    private final By orderIsProcessed = By.xpath(".//div[text()='Заказ оформлен']");

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }


    public void setSubway(int stationNumber) {
        driver.findElement(inputSubway).click();
        WebElement element = driver.findElement(By.cssSelector("button[value = '" + stationNumber + "']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    //Заполнить поля раздела "Для кого самокат"
    public void completeFormOfTheSectionForWhomTheScooter(String name, String surname, String city, int stationNumber, String phone) {
        driver.findElement(inputName).sendKeys(name);
        driver.findElement(inputSurname).sendKeys(surname);
        driver.findElement(inputAddress).sendKeys(city);
        setSubway(stationNumber);
        driver.findElement(inputPhone).sendKeys(phone);
    }

    public void finishOrderFormOfTheSectionForWhomTheScooter(String name, String surname, String city, int stationNumber, String phone) {
        completeFormOfTheSectionForWhomTheScooter(name, surname, city, stationNumber, phone);
        driver.findElement(btnNext).click();
    }

    //Выбираем значение из списка Срок аренды n-1
    public void selectRentalPeriodOption(int amountOfDays) {
        driver.findElement(rentalPeriod).click();
        List<WebElement> elements = driver.findElements(rentalPeriodOptions);
        WebElement element = elements.get(amountOfDays);
        element.click();


    }

    //кликаем по чебкосу цвета (один из двух): 0 = черный, 1 = серый
    public void clickRentalPeriod(int colorNumber) {
            List<WebElement> elements = driver.findElements(scooterColorChekboxes);
            WebElement element = elements.get(colorNumber);
            element.click();
    }

    //Заполняем форму 2 значениями
    public void completeFormAboutRent(String dayOfArrival, String comment, int amountOfDays, int colorNumber) {
        driver.findElement(inputWhen).sendKeys(dayOfArrival);
        driver.findElement(inputWhen).sendKeys(Keys.ESCAPE);
        driver.findElement(inputComment).sendKeys(comment);
        selectRentalPeriodOption(amountOfDays);
        clickRentalPeriod(colorNumber);
    }

    //заказать
    public void finishOrderFormAboutRent(String dayOfArrival, String comment, int amountOfDays, int colorNumber) {
        completeFormAboutRent(dayOfArrival, comment, amountOfDays, colorNumber);
        driver.findElement(btnMiddleOrder).click();
    }

    //Заказать скутер
    public String orderScooter(String name, String surname, String city, int stationNumber, String phone,
                               String dayOfArrival, String comment, int amountOfDays, int colorNumber) {
        finishOrderFormOfTheSectionForWhomTheScooter(name, surname, city, stationNumber, phone);
        finishOrderFormAboutRent(dayOfArrival, comment, amountOfDays, colorNumber);
        //Баг в chrome: хром не может кликнуть по кнопке "Да", вместо этого он просто наводится на неё
        driver.findElement(btnYes).click();
        return driver.findElement(orderIsProcessed).getText();
    }


}
