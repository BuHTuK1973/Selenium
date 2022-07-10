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
        driver.manage().deleteAllCookies();
    }

    @Test
    public void checkFirstDropDownMenuOfTheBlockImportantQuestions() {

        HomePageScooter homePageScooter = new HomePageScooter();
        String expectedResult = "����� � 400 ������. ������ ������� � ��������� ��� ������.";
        String actualResult = homePageScooter.textOfAnswerTheQuestionOneMatches(driver);
        Assert.assertEquals("����� ������� �1 �� ������������� ����������.", expectedResult, actualResult);
    }

    @Test
    public void checkSecondDropDownMenuOfTheBlockImportantQuestions() {

        HomePageScooter homePageScooter = new HomePageScooter();
        String expectedResult = "���� ��� � ��� ���: ���� ����� � ���� �������. ���� ������ ���������� � ��������, ������ ������ ������� ��������� ������� � ���� �� ������.";
        String actualResult = homePageScooter.textOfAnswerTheQuestionTwoMatches(driver);
        Assert.assertEquals("����� ������� �2 �� ������������� ����������.", expectedResult, actualResult);
    }

    @Test
    public void checkThirdDropDownMenuOfTheBlockImportantQuestions() {

        HomePageScooter homePageScooter = new HomePageScooter();
        String expectedResult = "��������, �� ���������� ����� �� 8 ���. �� �������� ������� 8 ��� � ������� ���. ������ ������� ������ ���������� � �������, ����� �� �������� ����� �������. ���� �� �������� ������� 8 ��� � 20:30, �������� ������ ���������� 9 ��� � 20:30.";
        String actualResult = homePageScooter.textOfAnswerTheQuestionThreeMatches(driver);
        Assert.assertEquals("����� ������� �3 �� ������������� ����������.", expectedResult, actualResult);
    }

    @Test
    public void checkFourthDropDownMenuOfTheBlockImportantQuestions() {

        HomePageScooter homePageScooter = new HomePageScooter();
        String expectedResult = "������ ������� � ����������� ���. �� ����� ������ �����������.";
        String actualResult = homePageScooter.textOfAnswerTheQuestionFourMatches(driver);
        Assert.assertEquals("����� ������� �4 �� ������������� ����������.", expectedResult, actualResult);
    }

    @Test
    public void checkFifthDropDownMenuOfTheBlockImportantQuestions() {

        HomePageScooter homePageScooter = new HomePageScooter();
        String expectedResult = "���� ��� ���! �� ���� ���-�� ������� � ������ ����� ��������� � ��������� �� ��������� ������ 1010.";
        String actualResult = homePageScooter.textOfAnswerTheQuestionFiveMatches(driver);
        Assert.assertEquals("����� ������� �5 �� ������������� ����������.", expectedResult, actualResult);
    }

    @Test
    public void checkSixthDropDownMenuOfTheBlockImportantQuestions() {

        HomePageScooter homePageScooter = new HomePageScooter();
        String expectedResult = "������� ��������� � ��� � ������ ��������. ����� ������� �� ������ ����� � ���� ���� ������ �������� ��� ��������� � �� ���. ������� �� �����������.";
        String actualResult = homePageScooter.textOfAnswerTheQuestionSixMatches(driver);
        Assert.assertEquals("����� ������� �6 �� ������������� ����������.", expectedResult, actualResult);
    }

    @Test
    public void checkSeventhDropDownMenuOfTheBlockImportantQuestions() {

        HomePageScooter homePageScooter = new HomePageScooter();
        String expectedResult = "��, ���� ������� �� ��������. ������ �� �����, �������������� ������� ���� �� ��������. ��� �� ����.";
        String actualResult = homePageScooter.textOfAnswerTheQuestionSevenMatches(driver);
        Assert.assertEquals("����� ������� �7 �� ������������� ����������.", expectedResult, actualResult);
    }

    @Test
    public void checkEighthDropDownMenuOfTheBlockImportantQuestions() {

        HomePageScooter homePageScooter = new HomePageScooter();
        String expectedResult = "��, �����������. ���� ���������! � ������, � ���������� �������.";
        String actualResult = homePageScooter.textOfAnswerTheQuestionEightMatches(driver);
        Assert.assertEquals("����� ������� �8 �� ������������� ����������.", expectedResult, actualResult);
    }

    @After
    public void teardown() {
        driver.quit();
    }
}