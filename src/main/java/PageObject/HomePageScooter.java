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
    private final By circleOne = By.xpath(".//div[@class = 'Home_StatusCircle__3_aTp' and text()='1']");
    //            [ ]  ������� "������ � ������ 2 ������".
    private final By circleTwo = By.xpath(".//div[@class = 'Home_StatusCircle__3_aTp' and text()='2']");
    //            [ ]  ������� "������ � ������ 3 ������".
    private final By circleThree = By.xpath(".//div[@class = 'Home_StatusCircle__3_aTp' and text()='3']");
    //            [ ]  ������� "������ � ������ 4 ������".
    private final By circleFour = By.xpath(".//div[@class = 'Home_StatusCircle__3_aTp Home_Lineless__2-Rxp' and text()='4']");
    //            [ ]  ��� 1 "����������� �������"
    private final By stepOneToOrderTheScooter = By.xpath(".//div[@class = 'Home_Status__YkfmH' and text()='����������� �������']");
    //            [ ]  �������� ���� 1 "���������, ����� � ���� ��������". !!!
    //            ��� ������� ��������� ������� � ������� �� ������ � ������� - ������� �� ����� ����������, � ���� ������ ������ �� ������, �� ������ 4 ��������. ��� ������������ ������ ��� � �����.
    private final By additionalDiscriptionOfTheFirstStep = By.xpath(".//div[1][@class='Home_StatusBrick__1PsW9']/div[2]/div[2]");
    //            [ ]  ��� 2 "������ �������� �������".
    private final By stepTwoToOrderTheScooter = By.xpath(".//div[@class = 'Home_Status__YkfmH' and text()='������ �������� �������']");
    //            [ ]  �������� ���� 2 "� �� � ����������� ������"
    private final By additionalDiscriptionOfTheSecondStep = By.xpath(".//div[@class = 'Home_StatusDescription__3WGl5' and text()='� �� � ����������� ������']");
    //            [ ]  ��� 3 "���������".
    private final By stepThreeToOrderTheScooter = By.xpath(".//div[@class = 'Home_Status__YkfmH' and text()='���������']");
    //            [ ]  �������� ���� 3 "������� ����� ������ �������� � ����� �� �����"
    private final By additionalDiscriptionOfTheThirdStep = By.xpath(".//div[@class = 'Home_StatusDescription__3WGl5' and text()='������� ����� ������ �������� � ����� �� �����']");
    //            [ ]  ��� 4 "������ �������� �������".
    private final By stepFourToOrderTheScooter = By.xpath(".//div[@class = 'Home_Status__YkfmH' and text()='������ �������� �������']");
    //            [ ]  �������� ���� 4 "����� ������ �������������".
    private final By additionalDiscriptionOfFourthStep = By.xpath(".//div[@class = 'Home_StatusDescription__3WGl5' and text()='����� ������ �������������']");
    //            [ ]  ������ "��������" � ������ ����� ��������.
    private final By btnMiddleOrder = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='��������']");
    //            [ ]  ������� � ������
    private final By subHeaderForScroll = By.xpath(".//div[text()='������� � ������']");
    //    [ ]  ���� ��������:
    private final By ImportantQuestions = By.className("accordion");
    //            [ ]  ������ �1 "������� ��� ����� � ��� ��������"
    private final By questionOneOfTheBlockImportantQuestions = By.id("accordion__heading-0");
    //            [ ]  ����� �� ������ �1 "����� � 400 ������. ������ ������� � ��������� ��� ������.".
    private final By answerTheQuestionOneOfTheBlockImportantQuestions = By.id("accordion__panel-0");
    //            [ ]  ������ �2 "���� ����� ��������� ���������! ��� �����?"
    private final By questionTwoOfTheBlockImportantQuestions = By.id("accordion__heading-1");
    //            [ ]  ����� �� ������ �2. "���� ��� � ��� ���: ���� ����� � ���� �������. ���� ������ ���������� � ��������, ������ ������ ������� ��������� ������� � ���� �� ������."
    private final By answerTheQuestionTwoOfTheBlockImportantQuestions = By.id("accordion__panel-1");
    //            [ ]  ������ �3 "��� �������������� ����� ������?"
    private final By questionThreeOfTheBlockImportantQuestions = By.id("accordion__heading-2");
    //            [ ]  ����� �� ������ �3. "��������, �� ���������� ����� �� 8 ���. �� �������� ������� 8 ��� � ������� ���. ������ ������� ������ ���������� � �������, ����� �� �������� ����� �������. ���� �� �������� ������� 8 ��� � 20:30, �������� ������ ���������� 9 ��� � 20:30."
    private final By answerTheQuestionThreeOfTheBlockImportantQuestions = By.id("accordion__panel-2");
    //            [ ]  ������ �4 "����� �� �������� ������� ����� �� �������?"
    private final By questionFourOfTheBlockImportantQuestions = By.id("accordion__heading-3");
    //            [ ]  ����� �� ������ �4. "������ ������� � ����������� ���. �� ����� ������ �����������."
    private final By answerTheQuestionFourOfTheBlockImportantQuestions = By.id("accordion__panel-3");
    //            [ ]  ������ �5 "����� �� �������� ����� ��� ������� ������� ������?"
    private final By questionFiveOfTheBlockImportantQuestions = By.id("accordion__heading-4");
    //            [ ]  ����� �� ������ �5. "���� ��� ���! �� ���� ���-�� ������� � ������ ����� ��������� � ��������� �� ��������� ������ 1010."
    private final By answerTheQuestionFiveOfTheBlockImportantQuestions = By.id("accordion__panel-4");
    //            [ ]  ������ �6 "�� ��������� ������� ������ � ���������?"
    private final By questionSixOfTheBlockImportantQuestions = By.id("accordion__heading-5");
    //            [ ]  ����� �� ������ �6. "������� ��������� � ��� � ������ ��������. ����� ������� �� ������ ����� � ���� ���� ������ �������� ��� ��������� � �� ���. ������� �� �����������.""
    private final By answerTheQuestionSixOfTheBlockImportantQuestions = By.id("accordion__panel-5");
    //            [ ]  ������ �7 "����� �� �������� �����?"
    private final By questionSevenOfTheBlockImportantQuestions = By.id("accordion__heading-6");
    //            [ ]  ����� �� ������ �7. "��, ���� ������� �� ��������. ������ �� �����, �������������� ������� ���� �� ��������. ��� �� ����."
    private final By answerTheQuestionSevenOfTheBlockImportantQuestions = By.id("accordion__panel-6");
    //            [ ]  ������ �8 "� ���� �� ������, ��������?"
    private final By questionEightOfTheBlockImportantQuestions = By.id("accordion__heading-7");
    //            [ ]  ����� �� ������ �8. "��, �����������. ���� ���������! � ������, � ���������� �������."
    private final By answerTheQuestionEightOfTheBlockImportantQuestions = By.id("accordion__panel-7");

    public void scrollSubHeaderForScroll(WebDriver driver) {

        WebElement element = driver.findElement(subHeaderForScroll);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

    }

    public void clickQuestionOne(WebDriver driver) { driver.findElement(questionOneOfTheBlockImportantQuestions).click(); }

    public String getTextOfAnswerOne(WebDriver driver) {
        return driver.findElement(answerTheQuestionOneOfTheBlockImportantQuestions).getText();
    }

    public String textOfAnswerTheQuestionOneMatches(WebDriver driver) {
        scrollSubHeaderForScroll(driver);
        clickQuestionOne(driver);
        new WebDriverWait(driver, 1)
                .until(ExpectedConditions.visibilityOfElementLocated(answerTheQuestionOneOfTheBlockImportantQuestions));
        return getTextOfAnswerOne(driver);
    }

    public void clickQuestionTwo(WebDriver driver) {
        driver.findElement(questionTwoOfTheBlockImportantQuestions).click();
    }

    public String getTextOfAnswerTwo(WebDriver driver) {
        return driver.findElement(answerTheQuestionTwoOfTheBlockImportantQuestions).getText();
    }

    public String textOfAnswerTheQuestionTwoMatches(WebDriver driver) {
        scrollSubHeaderForScroll(driver);
        clickQuestionTwo(driver);
        new WebDriverWait(driver, 1)
                .until(ExpectedConditions.visibilityOfElementLocated(answerTheQuestionTwoOfTheBlockImportantQuestions));
        return getTextOfAnswerTwo(driver);
    }

    public void clickQuestionThree(WebDriver driver) {
        driver.findElement(questionThreeOfTheBlockImportantQuestions).click();
    }

    public String getTextOfAnswerThree(WebDriver driver) {
        return driver.findElement(answerTheQuestionThreeOfTheBlockImportantQuestions).getText();
    }

    public String textOfAnswerTheQuestionThreeMatches(WebDriver driver) {
        scrollSubHeaderForScroll(driver);
        clickQuestionThree(driver);
        new WebDriverWait(driver, 1)
                .until(ExpectedConditions.visibilityOfElementLocated(answerTheQuestionThreeOfTheBlockImportantQuestions));
        return getTextOfAnswerThree(driver);
    }

    public void clickQuestionFour(WebDriver driver) {
        driver.findElement(questionFourOfTheBlockImportantQuestions).click();
    }

    public String getTextOfAnswerFour(WebDriver driver) {
        return driver.findElement(answerTheQuestionFourOfTheBlockImportantQuestions).getText();
    }

    public String textOfAnswerTheQuestionFourMatches(WebDriver driver) {
        scrollSubHeaderForScroll(driver);
        clickQuestionFour(driver);
        new WebDriverWait(driver, 1)
                .until(ExpectedConditions.visibilityOfElementLocated(answerTheQuestionFourOfTheBlockImportantQuestions));
        return getTextOfAnswerFour(driver);
    }

    public void clickQuestionFive(WebDriver driver) {
        driver.findElement(questionFiveOfTheBlockImportantQuestions).click();
    }

    public String getTextOfAnswerFive(WebDriver driver) {
        return driver.findElement(answerTheQuestionFiveOfTheBlockImportantQuestions).getText();
    }

    public String textOfAnswerTheQuestionFiveMatches(WebDriver driver) {
        scrollSubHeaderForScroll(driver);
        clickQuestionFive(driver);
        new WebDriverWait(driver, 1)
                .until(ExpectedConditions.visibilityOfElementLocated(answerTheQuestionFiveOfTheBlockImportantQuestions));
        return getTextOfAnswerFive(driver);
    }

    public void clickQuestionSix(WebDriver driver) {
        driver.findElement(questionSixOfTheBlockImportantQuestions).click();
    }

    public String getTextOfAnswerSix(WebDriver driver) {
        return driver.findElement(answerTheQuestionSixOfTheBlockImportantQuestions).getText();
    }

    public String textOfAnswerTheQuestionSixMatches(WebDriver driver) {
        scrollSubHeaderForScroll(driver);
        clickQuestionSix(driver);
        new WebDriverWait(driver, 1)
                .until(ExpectedConditions.visibilityOfElementLocated(answerTheQuestionSixOfTheBlockImportantQuestions));
        return getTextOfAnswerSix(driver);
    }

    public void clickQuestionSeven(WebDriver driver) {
        driver.findElement(questionSevenOfTheBlockImportantQuestions).click();
    }

    public String getTextOfAnswerSeven(WebDriver driver) {
        return driver.findElement(answerTheQuestionSevenOfTheBlockImportantQuestions).getText();
    }

    public String textOfAnswerTheQuestionSevenMatches(WebDriver driver) {
        scrollSubHeaderForScroll(driver);
        clickQuestionSeven(driver);
        new WebDriverWait(driver, 1)
                .until(ExpectedConditions.visibilityOfElementLocated(answerTheQuestionSevenOfTheBlockImportantQuestions));
        return getTextOfAnswerSeven(driver);
    }

    public void clickQuestionEight(WebDriver driver) {
        driver.findElement(questionEightOfTheBlockImportantQuestions).click();
    }

    public String getTextOfAnswerEight(WebDriver driver) {
        return driver.findElement(answerTheQuestionEightOfTheBlockImportantQuestions).getText();
    }

    public String textOfAnswerTheQuestionEightMatches(WebDriver driver) {
        scrollSubHeaderForScroll(driver);
        clickQuestionEight(driver);
        new WebDriverWait(driver, 1)
                .until(ExpectedConditions.visibilityOfElementLocated(answerTheQuestionEightOfTheBlockImportantQuestions));
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
