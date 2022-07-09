import PageObject.HomePageScooter;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.Test;
import org.junit.After;


public class CheckAnswersOfMainQuestionsTest {

    private WebDriver driver;

    @Before
    public void runBrowserAndURL() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get(HomePageScooter.URL);
    }

    @Test
    public void checkAnswerOfQuestionOne() {

        HomePageScooter homePageScooter = new HomePageScooter();
        String expectedResult = "����� � 400 ������. ������ ������� � ��������� ��� ������.";
        String actualResult = homePageScooter.isTextOfAnswerOneMatches(driver);
        Assert.assertEquals("����� ������� �1 �� ������������� ����������.", expectedResult, actualResult);
    }

    @Test
    public void checkAnswerOfQuestionTwo() {

        HomePageScooter homePageScooter = new HomePageScooter();
        String expectedResult = "���� ��� � ��� ���: ���� ����� � ���� �������. ���� ������ ���������� � ��������, ������ ������ ������� ��������� ������� � ���� �� ������.";
        String actualResult = homePageScooter.isTextOfAnswerTwoMatches(driver);
        Assert.assertEquals("����� ������� �2 �� ������������� ����������.", expectedResult, actualResult);
    }

    @Test
    public void checkAnswerOfQuestionThree() {

        HomePageScooter homePageScooter = new HomePageScooter();
        String expectedResult = "��������, �� ���������� ����� �� 8 ���. �� �������� ������� 8 ��� � ������� ���. ������ ������� ������ ���������� � �������, ����� �� �������� ����� �������. ���� �� �������� ������� 8 ��� � 20:30, �������� ������ ���������� 9 ��� � 20:30.";
        String actualResult = homePageScooter.isTextOfAnswerThreeMatches(driver);
        Assert.assertEquals("����� ������� �3 �� ������������� ����������.", expectedResult, actualResult);
    }

    @Test
    public void checkAnswerOfQuestionFour() {

        HomePageScooter homePageScooter = new HomePageScooter();
        String expectedResult = "������ ������� � ����������� ���. �� ����� ������ �����������.";
        String actualResult = homePageScooter.isTextOfAnswerFourMatches(driver);
        Assert.assertEquals("����� ������� �4 �� ������������� ����������.", expectedResult, actualResult);
    }

    @Test
    public void checkAnswerOfQuestionFive() {

        HomePageScooter homePageScooter = new HomePageScooter();
        String expectedResult = "���� ��� ���! �� ���� ���-�� ������� � ������ ����� ��������� � ��������� �� ��������� ������ 1010.";
        String actualResult = homePageScooter.isTextOfAnswerFiveMatches(driver);
        Assert.assertEquals("����� ������� �5 �� ������������� ����������.", expectedResult, actualResult);
    }

    @Test
    public void checkAnswerOfQuestionSix() {

        HomePageScooter homePageScooter = new HomePageScooter();
        String expectedResult = "������� ��������� � ��� � ������ ��������. ����� ������� �� ������ ����� � ���� ���� ������ �������� ��� ��������� � �� ���. ������� �� �����������.";
        String actualResult = homePageScooter.isTextOfAnswerSixMatches(driver);
        Assert.assertEquals("����� ������� �6 �� ������������� ����������.", expectedResult, actualResult);
    }

    @Test
    public void checkAnswerOfQuestionSeven() {

        HomePageScooter homePageScooter = new HomePageScooter();
        String expectedResult = "��, ���� ������� �� ��������. ������ �� �����, �������������� ������� ���� �� ��������. ��� �� ����.";
        String actualResult = homePageScooter.isTextOfAnswerSevenMatches(driver);
        Assert.assertEquals("����� ������� �7 �� ������������� ����������.", expectedResult, actualResult);
    }

    @Test
    public void checkAnswerOfQuestionEight() {

        HomePageScooter homePageScooter = new HomePageScooter();
        String expectedResult = "��, �����������. ���� ���������! � ������, � ���������� �������.";
        String actualResult = homePageScooter.isTextOfAnswerEightMatches(driver);
        Assert.assertEquals("����� ������� �8 �� ������������� ����������.", expectedResult, actualResult);
    }

    @After
    public void teardown() {
        driver.quit();
    }
}