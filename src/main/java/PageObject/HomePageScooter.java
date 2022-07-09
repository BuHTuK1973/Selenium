package PageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePageScooter {
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
    private final By homeSubHeaderFirst = By.xpath(".//div[@class='Home_SubHeader__zwi_E'][text()='������� ��� ����� � ����� �����,']");
    //            [ ]  ������������ "�� ����� � � ������� ������� ����� ��, ����� ����� �� ���������� � ����� ���������� �������� �� ����"
    private final By homeSubHeaderSecond = By.xpath(".//div[@class='Home_SubHeader__zwi_E'][text()='�� ����� � � ������� ������� ����� ��, ����� ����� �� ���������� � ����� ���������� �������� �� ����']");
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
    private final By tableElementModelToxicPro = By.xpath(".//div[@class='Home_Table__2kPxP']/div[1]/div");
    //    [ ]  ������������ ��������
    private final By tableElementMaxSpeed = By.xpath(".//div[@class='Home_Table__2kPxP']/div[3]/div[1]");
    //    [ ]  40 ��/�
    private final By tableElementMaxSpeedValue = By.xpath(".//div[@class='Home_Table__2kPxP']/div[3]/div[2]");
    //    [ ]  ������� ��� ����������
    private final By tableElementWithoutCharge = By.xpath(".//div[@class='Home_Table__2kPxP']/div[4]/div[1]");
    //            [ ]  80 ��
    private final By tableElementWithoutChargeValue = By.xpath(".//div[@class='Home_Table__2kPxP']/div[4]/div[2]");
    //    [ ]  ����������� ���
    private final By tableElementWeight = By.xpath(".//div[@class='Home_Table__2kPxP']/div[5]/div[1]");
    //    [ ]  120 ��
    private final By tableElementWeightValue = By.xpath(".//div[@class='Home_Table__2kPxP']/div[5]/div[2]");
    //    [ ]  ������������ "��� ��� ��������"
    private final By subHeaderHowItWorks = By.xpath(".//div[text()='��� ��� ��������']");
    //            [ ]  ������� "������ � ������ 1 ������"
    private final By circleOne = By.xpath(".//div[1][@class='Home_StatusBrick__1PsW9']/div[1]");
    //            [ ]  ������� "������ � ������ 2 ������".
    private final By circleTwo = By.xpath(".//div[2][@class='Home_StatusBrick__1PsW9']/div[1]");
    //            [ ]  ������� "������ � ������ 3 ������".
    private final By circleThree = By.xpath(".//div[3][@class='Home_StatusBrick__1PsW9']/div[1]");
    //            [ ]  ������� "������ � ������ 4 ������".
    private final By circleFour = By.xpath(".//div[4][@class='Home_StatusBrick__1PsW9']/div[1]");
    //            [ ]  ��� 1 "����������� �������"
    private final By stepOneDiscription = By.xpath(".//div[1][@class='Home_StatusBrick__1PsW9']/div[2]/div[1]");
    //            [ ]  �������� ���� 1 "���������, ����� � ���� ��������".
    private final By stepOneSubDiscription = By.xpath(".//div[1][@class='Home_StatusBrick__1PsW9']/div[2]/div[2]");
    //            [ ]  ��� 2 "������ �������� �������".
    private final By stepTwoDiscription = By.xpath(".//div[2][@class='Home_StatusBrick__1PsW9']/div[2]/div[1]");
    //            [ ]  �������� ���� 2 "� �� � ����������� ������"
    private final By stepTwoSubDiscription = By.xpath(".//div[2][@class='Home_StatusBrick__1PsW9']/div[2]/div[2]");
    //            [ ]  ��� 3 "���������".
    private final By stepThreeDiscription = By.xpath(".//div[3][@class='Home_StatusBrick__1PsW9']/div[2]/div[1]");
    //            [ ]  �������� ���� 3 "������� ����� ������ �������� � ����� �� �����"
    private final By stepThreeSubDiscription = By.xpath(".//div[3][@class='Home_StatusBrick__1PsW9']/div[2]/div[2]");
    //            [ ]  ��� 4 "������ �������� �������".
    private final By stepFourDiscription = By.xpath(".//div[4][@class='Home_StatusBrick__1PsW9']/div[2]/div[1]");
    //            [ ]  �������� ���� 4 "����� ������ �������������".
    private final By stepFourSubDiscription = By.xpath(".//div[4][@class='Home_StatusBrick__1PsW9']/div[2]/div[2]");
    //            [ ]  ������ "��������" � ������ ����� ��������.
    private final By btnMiddleOrder = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='��������']");
    //            [ ]  ������� � ������
    private final By subHeaderForScroll = By.xpath(".//div[text()='������� � ������']");
    //    [ ]  ���� ��������:
    private final By accordionQuestions = By.className("accordion");
    //            [ ]  ������ �1 "������� ��� ����� � ��� ��������"
    private final By questionOne = By.id("accordion__heading-0");
    //            [ ]  ����� �� ������ �1 "����� � 400 ������. ������ ������� � ��������� ��� ������.".
    private final By answerOne = By.id("accordion__panel-0");
    //            [ ]  ������ �2 "���� ����� ��������� ���������! ��� �����?"
    private final By questionTwo = By.id("accordion__heading-1");
    //            [ ]  ����� �� ������ �2. "���� ��� � ��� ���: ���� ����� � ���� �������. ���� ������ ���������� � ��������, ������ ������ ������� ��������� ������� � ���� �� ������."
    private final By answerTwo = By.id("accordion__panel-1");
    //            [ ]  ������ �3 "��� �������������� ����� ������?"
    private final By questionThree = By.id("accordion__heading-2");
    //            [ ]  ����� �� ������ �3. "��������, �� ���������� ����� �� 8 ���. �� �������� ������� 8 ��� � ������� ���. ������ ������� ������ ���������� � �������, ����� �� �������� ����� �������. ���� �� �������� ������� 8 ��� � 20:30, �������� ������ ���������� 9 ��� � 20:30."
    private final By answerThree = By.id("accordion__panel-2");
    //            [ ]  ������ �4 "����� �� �������� ������� ����� �� �������?"
    private final By questionFour = By.id("accordion__heading-3");
    //            [ ]  ����� �� ������ �4. "������ ������� � ����������� ���. �� ����� ������ �����������."
    private final By answerFour = By.id("accordion__panel-3");
    //            [ ]  ������ �5 "����� �� �������� ����� ��� ������� ������� ������?"
    private final By questionFive = By.id("accordion__heading-4");
    //            [ ]  ����� �� ������ �5. "���� ��� ���! �� ���� ���-�� ������� � ������ ����� ��������� � ��������� �� ��������� ������ 1010."
    private final By answerFive = By.id("accordion__panel-4");
    //            [ ]  ������ �6 "�� ��������� ������� ������ � ���������?"
    private final By questionSix = By.id("accordion__heading-5");
    //            [ ]  ����� �� ������ �6. "������� ��������� � ��� � ������ ��������. ����� ������� �� ������ ����� � ���� ���� ������ �������� ��� ��������� � �� ���. ������� �� �����������.""
    private final By answerSix = By.id("accordion__panel-5");
    //            [ ]  ������ �7 "����� �� �������� �����?"
    private final By questionSeven = By.id("accordion__heading-6");
    //            [ ]  ����� �� ������ �7. "��, ���� ������� �� ��������. ������ �� �����, �������������� ������� ���� �� ��������. ��� �� ����."
    private final By answerSeven = By.id("accordion__panel-6");
    //            [ ]  ������ �8 "� ���� �� ������, ��������?"
    private final By questionEight = By.id("accordion__heading-7");
    //            [ ]  ����� �� ������ �8. "��, �����������. ���� ���������! � ������, � ���������� �������."
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
