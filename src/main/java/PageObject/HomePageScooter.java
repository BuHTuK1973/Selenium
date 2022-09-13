package PageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePageScooter {
    private final WebDriver driver;
    public static final String URL = "https://qa-scooter.praktikum-services.ru/";
    //        [ ]  ��������-������� ��������.
    private final By logoMain = By.className("Header_Logo__23yGT");
    //            [ ]  ������� "������".
    private final By logoYandex = By.className("Header_LogoYandex__3TSOI");
    //            [ ]  ������� "�������".
    private final By logoScooter = By.className("Header_LogoScooter__3lsAR");
    //            [ ]  ������� "������� ��������".
    private final By logoDisclaimer = By.className("Header_Disclaimer__3VEni");
    //            [ ]  App Cookie Consent
    private final By appCookieConsent = By.className("App_CookieConsent__1yUIN");
    //    [ ]  ����� App Cookie Consent "� ����� ����! � �����, �� �� ����������."
    private final By appCookieText = By.className("App_CookieText__1sbqp");
    //            [ ]  ������ "�� ��� ��������"
    private final By appCookieButton = By.className("App_CookieButton__3cvqF");
    //            [ ]  ��������� "������� �� ���� ����".
    private final By homeHeader = By.className("Home_Header__iJKdX");
    //            [ ]  ������������ "������� ��� ����� � ����� �����,� ����� ����������� � ������.
    private final By homeSubHeaderStartPage = By.xpath(".//div[@class='Home_SubHeader__zwi_E'][text()='������� ��� ����� � ����� �����,']");
    //            [ ]  ������������ "�� ����� � � ������� ������� ����� ��, ����� ����� �� ���������� � ����� ���������� �������� �� ����"
    private final By homeSubHeaderWhenScrollDown = By.xpath(".//div[@class='Home_SubHeader__zwi_E'][text()='�� ����� � � ������� ������� ����� ��, ����� ����� �� ���������� � ����� ���������� �������� �� ����']");
    //            [ ]  ������ "��������" � ������ ��������.
    private final By btnHeaderOrder = By.xpath(".//button[@class='Button_Button__ra12g' and text()='��������']");
    //    [ ]  ������� "������ ������" � ������ ��������.
    private final By btnHeaderStatus = By.className("Header_Link__1TAG7");
    //    [ ]  ���� ����� ������ ������ - ���������� ����� ����� �� ������ "������ ������"
    private final By inputOrderNumber = By.cssSelector("input[class='Input_Input__1iN_Z Header_Input__xIoUq']");
    //            [ ]  ������ "Go" - ���������� ����� ����� �� ������ "������ ������"
    private final By btnGo = By.cssSelector("button[class='Button_Button__ra12g Header_Button__28dPO']");
    //            [ ]  �������� "�������" blueprint.
    private final By imgBlueprint = By.xpath(".//img[@src='/assets/blueprint.png']");
    //            [ ]  �������� "�������" scooter.
    private final By imgScooter = By.xpath(".//img[@src='/assets/scooter.png']");
    //            [ ]  �������-���� � ����������� �������� (��������, ����������, ���).
    private final By tableParameter = By.xpath(".Home_Table__2kPxP");
    //            [ ]  ���� � ����������������
    private final By tableParameterRow = By.xpath(".Home_Row__jdQW2");
    //    [ ]  ������ Toxic PRO
    private final By tableElementModelToxicPro = By.xpath(".//div[@class = 'Home_Column__xlKDK' and text()=' ������ Toxic PRO']");
    //    [ ]  ������������ ��������
    private final By tableElementMaxSpeed = By.xpath(".//div[@class = 'Home_Column__xlKDK' and text()='������������ ��������']");
    //    [ ]  40 ��/�
    private final By tableElementMaxSpeedValue = By.xpath(".//div[@class = 'Home_Column__xlKDK' and text()='40 ��/�']");
    //    [ ]  ������� ��� ����������
    private final By tableElementWithoutCharge = By.xpath(".//div[@class = 'Home_Column__xlKDK' and text()='������� ��� ����������']");
    //            [ ]  80 ��
    private final By tableElementWithoutChargeValue = By.xpath(".//div[@class = 'Home_Column__xlKDK' and text()='80 ��']");
    //    [ ]  ����������� ���
    private final By tableElementWeight = By.xpath(".//div[@class = 'Home_Column__xlKDK' and text()='����������� ���']");
    //    [ ]  120 ��
    private final By tableElementWeightValue = By.xpath(".//div[@class = 'Home_Column__xlKDK' and text()='120 ��']");
    //    [ ]  ������������ "��� ��� ��������"
    private final By subHeaderHowItWorks = By.xpath(".//div[text()='��� ��� ��������']");
    //            [ ]  ������� "������ � ������ 1 ������"
    private final By circleWithNumberOne = By.xpath(".//div[@class = 'Home_StatusCircle__3_aTp' and text()='1']");
    //            [ ]  ������� "������ � ������ 2 ������".
    private final By circleWithNumberTwo = By.xpath(".//div[@class = 'Home_StatusCircle__3_aTp' and text()='2']");
    //            [ ]  ������� "������ � ������ 3 ������".
    private final By circleWithNumberThree = By.xpath(".//div[@class = 'Home_StatusCircle__3_aTp' and text()='3']");
    //            [ ]  ������� "������ � ������ 4 ������".
    private final By circleWithNumberFour = By.xpath(".//div[@class = 'Home_StatusCircle__3_aTp Home_Lineless__2-Rxp' and text()='4']");
    //            [ ]  ��� 1 "����������� �������"
    private final By orderingAScooter = By.xpath(".//div[@class = 'Home_Status__YkfmH' and text()='����������� �������']");
    //            [ ]  �������� ���� 1 "���������, ����� � ���� ��������". !!!
    //            ��� ������� ��������� ������� � ������� �� ������ � ������� - ������� �� ����� ����������, � ���� ������ ������ �� ������, �� ������ 4 ��������. ��� ������������ ������ ��� � �����.
    private final By additionalDiscriptionOfOrderingAScooter = By.xpath(".//div[1][@class='Home_StatusBrick__1PsW9']/div[2]/div[2]");
    //            [ ]  ��� 2 "������ �������� �������".
    private final By courierBringsAScooter = By.xpath(".//div[@class = 'Home_Status__YkfmH' and text()='������ �������� �������']");
    //            [ ]  �������� ���� 2 "� �� � ����������� ������"
    private final By additionalDiscriptionOfCourierBringsAScooter = By.xpath(".//div[@class = 'Home_StatusDescription__3WGl5' and text()='� �� � ����������� ������']");
    //            [ ]  ��� 3 "���������".
    private final By riding = By.xpath(".//div[@class = 'Home_Status__YkfmH' and text()='���������']");
    //            [ ]  �������� ���� 3 "������� ����� ������ �������� � ����� �� �����"
    private final By additionalDiscriptionOfRiding = By.xpath(".//div[@class = 'Home_StatusDescription__3WGl5' and text()='������� ����� ������ �������� � ����� �� �����']");
    //            [ ]  ��� 4 "������ �������� �������".
    private final By courierPicksUpTheScooter = By.xpath(".//div[@class = 'Home_Status__YkfmH' and text()='������ �������� �������']");
    //            [ ]  �������� ���� 4 "����� ������ �������������".
    private final By additionalDiscriptionOfCourierPicksUpTheScooter = By.xpath(".//div[@class = 'Home_StatusDescription__3WGl5' and text()='����� ������ �������������']");
    //            [ ]  ������ "��������" � ������ ����� ��������.
    private final By btnMiddleOrder = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='��������']");
    //            [ ]  ������� � ������
    private final By subHeaderForScroll = By.xpath(".//div[text()='������� � ������']");
    //    [ ]  ���� ��������:
    private final By ImportantQuestions = By.className("accordion");
    //            [ ]  ������ �1 "������� ��� ����� � ��� ��������"
    private final By questionHowMuchDoesItCoast = By.id("accordion__heading-0");
    //            [ ]  ����� �� ������ �1 "����� � 400 ������. ������ ������� � ��������� ��� ������.".
    private final By answerTheQuestionHowMuchDoesItCoast = By.id("accordion__panel-0");
    //            [ ]  ������ �2 "���� ����� ��������� ���������! ��� �����?"
    private final By questionIWantSeveralScooterAtOnce = By.id("accordion__heading-1");
    //            [ ]  ����� �� ������ �2. "���� ��� � ��� ���: ���� ����� � ���� �������. ���� ������ ���������� � ��������, ������ ������ ������� ��������� ������� � ���� �� ������."
    private final By answerTheQuestionIWantSeveralScooterAtOnce = By.id("accordion__panel-1");
    //            [ ]  ������ �3 "��� �������������� ����� ������?"
    private final By questionHowTheRentalTimeIsCalculated = By.id("accordion__heading-2");
    //            [ ]  ����� �� ������ �3. "��������, �� ���������� ����� �� 8 ���. �� �������� ������� 8 ��� � ������� ���. ������ ������� ������ ���������� � �������, ����� �� �������� ����� �������. ���� �� �������� ������� 8 ��� � 20:30, �������� ������ ���������� 9 ��� � 20:30."
    private final By answerTheQuestionHowTheRentalTimeIsCalculated = By.id("accordion__panel-2");
    //            [ ]  ������ �4 "����� �� �������� ������� ����� �� �������?"
    private final By questionIsItPossibleToOrderAScooterRightForToday = By.id("accordion__heading-3");
    //            [ ]  ����� �� ������ �4. "������ ������� � ����������� ���. �� ����� ������ �����������."
    private final By answerTheQuestionIsItPossibleToOrderAScooterRightForToday = By.id("accordion__panel-3");
    //            [ ]  ������ �5 "����� �� �������� ����� ��� ������� ������� ������?"
    private final By questionIsItPossibleToExtendTheOrderOrReturnTheScooterEarlier = By.id("accordion__heading-4");
    //            [ ]  ����� �� ������ �5. "���� ��� ���! �� ���� ���-�� ������� � ������ ����� ��������� � ��������� �� ��������� ������ 1010."
    private final By answerTheQuestionIsItPossibleToExtendTheOrderOrReturnTheScooterEarlier = By.id("accordion__panel-4");
    //            [ ]  ������ �6 "�� ��������� ������� ������ � ���������?"
    private final By questionYouBringTheChargingAlongWithTheScooter = By.id("accordion__heading-5");
    //            [ ]  ����� �� ������ �6. "������� ��������� � ��� � ������ ��������. ����� ������� �� ������ ����� � ���� ���� ������ �������� ��� ��������� � �� ���. ������� �� �����������.""
    private final By answerTheQuestionYouBringTheChargingAlongWithTheScooter = By.id("accordion__panel-5");
    //            [ ]  ������ �7 "����� �� �������� �����?"
    private final By questionIsItPossibleToCancelTheOrder = By.id("accordion__heading-6");
    //            [ ]  ����� �� ������ �7. "��, ���� ������� �� ��������. ������ �� �����, �������������� ������� ���� �� ��������. ��� �� ����."
    private final By answerTheQuestionIsItPossibleToCancelTheOrder = By.id("accordion__panel-6");
    //            [ ]  ������ �8 "� ���� �� ������, ��������?"
    private final By questionILeaveBehindTheMKADWillYouBringMe = By.id("accordion__heading-7");
    //            [ ]  ����� �� ������ �8. "��, �����������. ���� ���������! � ������, � ���������� �������."
    private final By answerTheQuestionILeaveBehindTheMKADWillYouBringMe = By.id("accordion__panel-7");

    public HomePageScooter(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollSubHeaderForScroll() {

        WebElement element = driver.findElement(subHeaderForScroll);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

    }

    public void clickQuestionHowMuchDoesItCoast() { driver.findElement(questionHowMuchDoesItCoast).click(); }

    public String getTextOfAnswerTheQuestionHowMuchDoesItCoast() {
        return driver.findElement(answerTheQuestionHowMuchDoesItCoast).getText();
    }

    public String textOfAnswerTheQuestionHowMuchDoesItCoast() {
        scrollSubHeaderForScroll();
        clickQuestionHowMuchDoesItCoast();
        new WebDriverWait(driver, 1)
                .until(ExpectedConditions.visibilityOfElementLocated(answerTheQuestionHowMuchDoesItCoast));
        return getTextOfAnswerTheQuestionHowMuchDoesItCoast();
    }

    public void clickQuestionIWantSeveralScooterAtOnce() {
        driver.findElement(questionIWantSeveralScooterAtOnce).click();
    }

    public String getTextOfAnswerTheQuestionIWantSeveralScooterAtOnce() {
        return driver.findElement(answerTheQuestionIWantSeveralScooterAtOnce).getText();
    }

    public String textOfAnswerTheQuestionIWantSeveralScooterAtOnce() {
        scrollSubHeaderForScroll();
        clickQuestionIWantSeveralScooterAtOnce();
        new WebDriverWait(driver, 1)
                .until(ExpectedConditions.visibilityOfElementLocated(answerTheQuestionIWantSeveralScooterAtOnce));
        return getTextOfAnswerTheQuestionIWantSeveralScooterAtOnce();
    }

    public void clickQuestionHowTheRentalTimeIsCalculated() {
        driver.findElement(questionHowTheRentalTimeIsCalculated).click();
    }

    public String getTextOfAnswerTheQuestionHowTheRentalTimeIsCalculated() {
        return driver.findElement(answerTheQuestionHowTheRentalTimeIsCalculated).getText();
    }

    public String textOfAnswerTheQuestionHowTheRentalTimeIsCalculated() {
        scrollSubHeaderForScroll();
        clickQuestionHowTheRentalTimeIsCalculated();
        new WebDriverWait(driver, 1)
                .until(ExpectedConditions.visibilityOfElementLocated(answerTheQuestionHowTheRentalTimeIsCalculated));
        return getTextOfAnswerTheQuestionHowTheRentalTimeIsCalculated();
    }

    public void clickQuestionIsItPossibleToOrderAScooterRightForToday() {
        driver.findElement(questionIsItPossibleToOrderAScooterRightForToday).click();
    }

    public String getTextOfAnswerTheQuestionIsItPossibleToOrderAScooterRightForToday() {
        return driver.findElement(answerTheQuestionIsItPossibleToOrderAScooterRightForToday).getText();
    }

    public String textOfAnswerTheQuestionIsItPossibleToOrderAScooterRightForToday() {
        scrollSubHeaderForScroll();
        clickQuestionIsItPossibleToOrderAScooterRightForToday();
        new WebDriverWait(driver, 1)
                .until(ExpectedConditions.visibilityOfElementLocated(answerTheQuestionIsItPossibleToOrderAScooterRightForToday));
        return getTextOfAnswerTheQuestionIsItPossibleToOrderAScooterRightForToday();
    }

    public void clickQuestionIsItPossibleToExtendTheOrderOrReturnTheScooterEarlier() {
        driver.findElement(questionIsItPossibleToExtendTheOrderOrReturnTheScooterEarlier).click();
    }

    public String getTextOfAnswerTheQuestionIsItPossibleToExtendTheOrderOrReturnTheScooterEarlier() {
        return driver.findElement(answerTheQuestionIsItPossibleToExtendTheOrderOrReturnTheScooterEarlier).getText();
    }

    public String textOfAnswerTheQuestionIsItPossibleToExtendTheOrderOrReturnTheScooterEarlier() {
        scrollSubHeaderForScroll();
        clickQuestionIsItPossibleToExtendTheOrderOrReturnTheScooterEarlier();
        new WebDriverWait(driver, 1)
                .until(ExpectedConditions.visibilityOfElementLocated(answerTheQuestionIsItPossibleToExtendTheOrderOrReturnTheScooterEarlier));
        return getTextOfAnswerTheQuestionIsItPossibleToExtendTheOrderOrReturnTheScooterEarlier();
    }

    public void clickQuestionYouBringTheChargingAlongWithTheScooter() {
        driver.findElement(questionYouBringTheChargingAlongWithTheScooter).click();
    }

    public String getTextOfAnswerTheQuestionYouBringTheChargingAlongWithTheScooter() {
        return driver.findElement(answerTheQuestionYouBringTheChargingAlongWithTheScooter).getText();
    }

    public String textOfAnswerTheQuestionYouBringTheChargingAlongWithTheScooter() {
        scrollSubHeaderForScroll();
        clickQuestionYouBringTheChargingAlongWithTheScooter();
        new WebDriverWait(driver, 1)
                .until(ExpectedConditions.visibilityOfElementLocated(answerTheQuestionYouBringTheChargingAlongWithTheScooter));
        return getTextOfAnswerTheQuestionYouBringTheChargingAlongWithTheScooter();
    }

    public void clickQuestionIsItPossibleToCancelTheOrder() {
        driver.findElement(questionIsItPossibleToCancelTheOrder).click();
    }

    public String getTextOfAnswerTheQuestionIsItPossibleToCancelTheOrder() {
        return driver.findElement(answerTheQuestionIsItPossibleToCancelTheOrder).getText();
    }

    public String textOfAnswerTheQuestionIsItPossibleToCancelTheOrder() {
        scrollSubHeaderForScroll();
        clickQuestionIsItPossibleToCancelTheOrder();
        new WebDriverWait(driver, 1)
                .until(ExpectedConditions.visibilityOfElementLocated(answerTheQuestionIsItPossibleToCancelTheOrder));
        return getTextOfAnswerTheQuestionIsItPossibleToCancelTheOrder();
    }

    public void clickQuestionILeaveBehindTheMKADWillYouBringMe() {
        driver.findElement(questionILeaveBehindTheMKADWillYouBringMe).click();
    }

    public String getTextOfAnswerTheQuestionILeaveBehindTheMKADWillYouBringMe() {
        return driver.findElement(answerTheQuestionILeaveBehindTheMKADWillYouBringMe).getText();
    }

    public String textOfAnswerTheQuestionILeaveBehindTheMKADWillYouBringMe() {
        scrollSubHeaderForScroll();
        clickQuestionILeaveBehindTheMKADWillYouBringMe();
        new WebDriverWait(driver, 1)
                .until(ExpectedConditions.visibilityOfElementLocated(answerTheQuestionILeaveBehindTheMKADWillYouBringMe));
        return getTextOfAnswerTheQuestionILeaveBehindTheMKADWillYouBringMe();

    }

    public OrderPage clickBtnHeaderOrder() {
        driver.findElement(btnHeaderOrder).click();
        return new OrderPage(driver);
    }

    public OrderPage clickBtnMiddleOrder() {
        WebElement element = driver.findElement(btnMiddleOrder);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        return new OrderPage(driver);
    }
}
