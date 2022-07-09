import PageObject.HomePageScooter;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class ScooterOrderTest {

    private WebDriver driver;

    @Before
    public void runBrowserAndURL() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get(HomePageScooter.URL);
    }

    @Test
    public void checkWindowOfOrderSuccess() {
        //������ ��� ����� 1
        String name = "�����";
        String surname = "���������";
        String city = "������";
        int stationNumber = 21;
        String phone = "87656665344";
        //������ ��� ����� 2
        String dayOfArrival = "08.07.2022";
        String comment = "��������?";
        int amountOfDays = 1;
        //����� 2, n-1
        int colorNumber = 0;

        String expectedResult = "����� ��������";
       HomePageScooter homePageScooter = new HomePageScooter();
        String actualResult = homePageScooter.clickBtnHeaderOrder(driver).orderScooter(driver, name, surname, city, stationNumber, phone,
                dayOfArrival, comment, amountOfDays, colorNumber);
        Assert.assertEquals("��������� ���� ��������� ��������� ������ ������ �� ����������� ����������. ��������� ���������: ����� ��������", expectedResult, actualResult);
    }

    @Test
    public void checkWindowOfOrderSuccessSecond() {
        //������ ��� ����� 1
        String name = "������";
        String surname = "������������";
        String city = "�����-���������";
        int stationNumber = 3;
        String phone = "923477426651";
        //������ ��� ����� 2
        String dayOfArrival = "15.03.2022";
        String comment = "����� ��������?";
        int amountOfDays = 3;
        //����� 2, n-1
        int colorNumber = 1;

        String expectedResult = "����� ��������";
        HomePageScooter homePageScooter = new HomePageScooter();
        String actualResult = homePageScooter.clickBtnMiddleOrder(driver).orderScooter(driver, name, surname, city, stationNumber, phone,
                dayOfArrival, comment, amountOfDays, colorNumber);
        Assert.assertEquals("��������� ���� ��������� ��������� ������ ������ �� ����������� ����������", expectedResult, actualResult);
    }

    @After
    public void closeTestArea() {
        driver.quit();
    }

}
