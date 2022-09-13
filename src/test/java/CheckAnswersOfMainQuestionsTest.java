import PageObject.HomePageScooter;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.Test;
import org.junit.After;

import static org.junit.Assert.assertEquals;


public class CheckAnswersOfMainQuestionsTest {

    private WebDriver driver;

    @Before
    public void runBrowserAndURL() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get(HomePageScooter.URL);
        driver.manage().deleteAllCookies();
    }

    @Test
    public void checkDropDownMenuOfTheQuestionHowMuchDoesItCoast() {

        HomePageScooter homePageScooter = new HomePageScooter(driver);
        String expectedResult = "����� � 400 ������. ������ ������� � ��������� ��� ������.";
        String actualResult = homePageScooter.textOfAnswerTheQuestionHowMuchDoesItCoast();
        assertEquals("����� ������� �1 �� ������������� ����������.", expectedResult, actualResult);
    }

    @Test
    public void checkDropDownMenuOfTheQuestionIWantSeveralScooterAtOnce() {

        HomePageScooter homePageScooter = new HomePageScooter(driver);
        String expectedResult = "���� ��� � ��� ���: ���� ����� � ���� �������. ���� ������ ���������� � ��������, ������ ������ ������� ��������� ������� � ���� �� ������.";
        String actualResult = homePageScooter.textOfAnswerTheQuestionIWantSeveralScooterAtOnce();
        assertEquals("����� ������� �2 �� ������������� ����������.", expectedResult, actualResult);
    }

    @Test
    public void checkDropDownMenuOfTheQuestionHowTheRentalTimeIsCalculated() {

        HomePageScooter homePageScooter = new HomePageScooter(driver);
        String expectedResult = "��������, �� ���������� ����� �� 8 ���. �� �������� ������� 8 ��� � ������� ���. ������ ������� ������ ���������� � �������, ����� �� �������� ����� �������. ���� �� �������� ������� 8 ��� � 20:30, �������� ������ ���������� 9 ��� � 20:30.";
        String actualResult = homePageScooter.textOfAnswerTheQuestionHowTheRentalTimeIsCalculated();
        assertEquals("����� ������� �3 �� ������������� ����������.", expectedResult, actualResult);
    }

    @Test
    public void checkDropDownMenuOfTheQuestionIsItPossibleToOrderAScooterRightForToday() {

        HomePageScooter homePageScooter = new HomePageScooter(driver);
        String expectedResult = "������ ������� � ����������� ���. �� ����� ������ �����������.";
        String actualResult = homePageScooter.textOfAnswerTheQuestionIsItPossibleToOrderAScooterRightForToday();
        assertEquals("����� ������� �4 �� ������������� ����������.", expectedResult, actualResult);
    }

    @Test
    public void checkDropDownMenuOfTheQuestionIsItPossibleToExtendTheOrderOrReturnTheScooterEarlier() {

        HomePageScooter homePageScooter = new HomePageScooter(driver);
        String expectedResult = "���� ��� ���! �� ���� ���-�� ������� � ������ ����� ��������� � ��������� �� ��������� ������ 1010.";
        String actualResult = homePageScooter.textOfAnswerTheQuestionIsItPossibleToExtendTheOrderOrReturnTheScooterEarlier();
        assertEquals("����� ������� �5 �� ������������� ����������.", expectedResult, actualResult);
    }

    @Test
    public void checkDropDownMenuOfTheQuestionYouBringTheChargingAlongWithTheScooter() {

        HomePageScooter homePageScooter = new HomePageScooter(driver);
        String expectedResult = "������� ��������� � ��� � ������ ��������. ����� ������� �� ������ ����� � ���� ���� ������ �������� ��� ��������� � �� ���. ������� �� �����������.";
        String actualResult = homePageScooter.textOfAnswerTheQuestionYouBringTheChargingAlongWithTheScooter();
        assertEquals("����� ������� �6 �� ������������� ����������.", expectedResult, actualResult);
    }

    @Test
    public void checkDropDownMenuOfTheQuestionIsItPossibleToCancelTheOrder() {

        HomePageScooter homePageScooter = new HomePageScooter(driver);
        String expectedResult = "��, ���� ������� �� ��������. ������ �� �����, �������������� ������� ���� �� ��������. ��� �� ����.";
        String actualResult = homePageScooter.textOfAnswerTheQuestionIsItPossibleToCancelTheOrder();
        assertEquals("����� ������� �7 �� ������������� ����������.", expectedResult, actualResult);
    }

    @Test
    public void checkDropDownMenuOfTheQuestionILeaveBehindTheMKADWillYouBringMe() {

        HomePageScooter homePageScooter = new HomePageScooter(driver);
        String expectedResult = "��, �����������. ���� ���������! � ������, � ���������� �������.";
        String actualResult = homePageScooter.textOfAnswerTheQuestionILeaveBehindTheMKADWillYouBringMe();
        assertEquals("����� ������� �8 �� ������������� ����������.", expectedResult, actualResult);
    }

    @After
    public void teardown() {
        driver.quit();
    }
}