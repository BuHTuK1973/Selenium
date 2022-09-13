package PageObject;

import org.openqa.selenium.*;

import java.util.List;

public class OrderPage {
    private final WebDriver driver;
    //������ �����
    //������� ���� ���
    private final By inputName = By.xpath(".//input[@placeholder='* ���']");
    //������� ���� �������
    private final By inputSurname = By.xpath(".//input[@placeholder='* �������']");
    //������� ���� �����
    private final By inputAddress = By.xpath(".//input[@placeholder='* �����: ���� �������� �����']");
    //������� ���� ������� �����
    private final By inputSubway = By.xpath(".//input[@placeholder='* ������� �����']");
    //������� ������ �������
    private final By subwayPanel = By.cssSelector(".select-search");
    //������� ���� ������� �����
    private final By inputPhone = By.xpath(".//input[@placeholder='* �������: �� ���� �������� ������']");
    //������ ������ ����� �����
    private final By btnNext = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='�����']");

    //������ �����
    //������� ���� ����� �������� �������
    private final By inputWhen = By.xpath(".//input[@placeholder='* ����� �������� �������']");
    //������� ���� ����� �������� �������
    private final By inputComment = By.xpath(".//input[@placeholder='����������� ��� �������']");
    //������� ���� ���� ������/
    private final By rentalPeriod = By.className("Dropdown-root");
    //������� ���� ���� ������
    private final By rentalPeriodOptions = By.className("Dropdown-option");
    //������� ��������� ���� ��������
    private final By scooterColorChekboxes = By.className("Checkbox_Label__3wxSf");
    //������ ������ � ������ ��������
    private final By btnMiddleOrder = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='��������']");
    //������ �� � ������ ������ �������� �����?
    private final By btnYes = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='��']");
    //������� ������ ����� ��������
    private final By orderIsProcessed = By.xpath(".//div[text()='����� ��������']");

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }


    public void setSubway(int stationNumber) {
        driver.findElement(inputSubway).click();
        WebElement element = driver.findElement(By.cssSelector("button[value = '" + stationNumber + "']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    //��������� ���� ������� "��� ���� �������"
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

    //�������� �������� �� ������ ���� ������ n-1
    public void selectRentalPeriodOption(int amountOfDays) {
        driver.findElement(rentalPeriod).click();
        List<WebElement> elements = driver.findElements(rentalPeriodOptions);
        WebElement element = elements.get(amountOfDays);
        element.click();


    }

    //������� �� ������� ����� (���� �� ����): 0 = ������, 1 = �����
    public void clickRentalPeriod(int colorNumber) {
            List<WebElement> elements = driver.findElements(scooterColorChekboxes);
            WebElement element = elements.get(colorNumber);
            element.click();
    }

    //��������� ����� 2 ����������
    public void completeFormAboutRent(String dayOfArrival, String comment, int amountOfDays, int colorNumber) {
        driver.findElement(inputWhen).sendKeys(dayOfArrival);
        driver.findElement(inputWhen).sendKeys(Keys.ESCAPE);
        driver.findElement(inputComment).sendKeys(comment);
        selectRentalPeriodOption(amountOfDays);
        clickRentalPeriod(colorNumber);
    }

    //��������
    public void finishOrderFormAboutRent(String dayOfArrival, String comment, int amountOfDays, int colorNumber) {
        completeFormAboutRent(dayOfArrival, comment, amountOfDays, colorNumber);
        driver.findElement(btnMiddleOrder).click();
    }

    //�������� ������
    public String orderScooter(String name, String surname, String city, int stationNumber, String phone,
                               String dayOfArrival, String comment, int amountOfDays, int colorNumber) {
        finishOrderFormOfTheSectionForWhomTheScooter(name, surname, city, stationNumber, phone);
        finishOrderFormAboutRent(dayOfArrival, comment, amountOfDays, colorNumber);
        //��� � chrome: ���� �� ����� �������� �� ������ "��", ������ ����� �� ������ ��������� �� ��
        driver.findElement(btnYes).click();
        return driver.findElement(orderIsProcessed).getText();
    }


}
