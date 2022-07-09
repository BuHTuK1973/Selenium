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
        //Данные для формы 1
        String name = "Антон";
        String surname = "Андреевич";
        String city = "Москва";
        int stationNumber = 21;
        String phone = "87656665344";
        //Данные для формы 2
        String dayOfArrival = "08.07.2022";
        String comment = "Работает?";
        int amountOfDays = 1;
        //всего 2, n-1
        int colorNumber = 0;

        String expectedResult = "Заказ оформлен";
       HomePageScooter homePageScooter = new HomePageScooter();
        String actualResult = homePageScooter.clickBtnHeaderOrder(driver).orderScooter(driver, name, surname, city, stationNumber, phone,
                dayOfArrival, comment, amountOfDays, colorNumber);
        Assert.assertEquals("Заголовок окна успешного офрмления заказа должен не соответвует ожидаемому. Ожидаемый заголовок: Заказ оформлен", expectedResult, actualResult);
    }

    @Test
    public void checkWindowOfOrderSuccessSecond() {
        //Данные для формы 1
        String name = "Андрей";
        String surname = "Вячеславович";
        String city = "Санкт-Петербург";
        int stationNumber = 3;
        String phone = "923477426651";
        //Данные для формы 2
        String dayOfArrival = "15.03.2022";
        String comment = "дубль Работает?";
        int amountOfDays = 3;
        //всего 2, n-1
        int colorNumber = 1;

        String expectedResult = "Заказ оформлен";
        HomePageScooter homePageScooter = new HomePageScooter();
        String actualResult = homePageScooter.clickBtnMiddleOrder(driver).orderScooter(driver, name, surname, city, stationNumber, phone,
                dayOfArrival, comment, amountOfDays, colorNumber);
        Assert.assertEquals("Заголовок окна успешного офрмления заказа должен не соответвует ожидаемому", expectedResult, actualResult);
    }

    @After
    public void closeTestArea() {
        driver.quit();
    }

}
