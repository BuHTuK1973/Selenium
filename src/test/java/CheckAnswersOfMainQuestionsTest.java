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
        String expectedResult = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        String actualResult = homePageScooter.textOfAnswerTheQuestionHowMuchDoesItCoast();
        assertEquals("Текст вопроса №1 не соответствует ожидаемому.", expectedResult, actualResult);
    }

    @Test
    public void checkDropDownMenuOfTheQuestionIWantSeveralScooterAtOnce() {

        HomePageScooter homePageScooter = new HomePageScooter(driver);
        String expectedResult = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        String actualResult = homePageScooter.textOfAnswerTheQuestionIWantSeveralScooterAtOnce();
        assertEquals("Текст вопроса №2 не соответствует ожидаемому.", expectedResult, actualResult);
    }

    @Test
    public void checkDropDownMenuOfTheQuestionHowTheRentalTimeIsCalculated() {

        HomePageScooter homePageScooter = new HomePageScooter(driver);
        String expectedResult = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        String actualResult = homePageScooter.textOfAnswerTheQuestionHowTheRentalTimeIsCalculated();
        assertEquals("Текст вопроса №3 не соответствует ожидаемому.", expectedResult, actualResult);
    }

    @Test
    public void checkDropDownMenuOfTheQuestionIsItPossibleToOrderAScooterRightForToday() {

        HomePageScooter homePageScooter = new HomePageScooter(driver);
        String expectedResult = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String actualResult = homePageScooter.textOfAnswerTheQuestionIsItPossibleToOrderAScooterRightForToday();
        assertEquals("Текст вопроса №4 не соответствует ожидаемому.", expectedResult, actualResult);
    }

    @Test
    public void checkDropDownMenuOfTheQuestionIsItPossibleToExtendTheOrderOrReturnTheScooterEarlier() {

        HomePageScooter homePageScooter = new HomePageScooter(driver);
        String expectedResult = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        String actualResult = homePageScooter.textOfAnswerTheQuestionIsItPossibleToExtendTheOrderOrReturnTheScooterEarlier();
        assertEquals("Текст вопроса №5 не соответствует ожидаемому.", expectedResult, actualResult);
    }

    @Test
    public void checkDropDownMenuOfTheQuestionYouBringTheChargingAlongWithTheScooter() {

        HomePageScooter homePageScooter = new HomePageScooter(driver);
        String expectedResult = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        String actualResult = homePageScooter.textOfAnswerTheQuestionYouBringTheChargingAlongWithTheScooter();
        assertEquals("Текст вопроса №6 не соответствует ожидаемому.", expectedResult, actualResult);
    }

    @Test
    public void checkDropDownMenuOfTheQuestionIsItPossibleToCancelTheOrder() {

        HomePageScooter homePageScooter = new HomePageScooter(driver);
        String expectedResult = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        String actualResult = homePageScooter.textOfAnswerTheQuestionIsItPossibleToCancelTheOrder();
        assertEquals("Текст вопроса №7 не соответствует ожидаемому.", expectedResult, actualResult);
    }

    @Test
    public void checkDropDownMenuOfTheQuestionILeaveBehindTheMKADWillYouBringMe() {

        HomePageScooter homePageScooter = new HomePageScooter(driver);
        String expectedResult = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        String actualResult = homePageScooter.textOfAnswerTheQuestionILeaveBehindTheMKADWillYouBringMe();
        assertEquals("Текст вопроса №8 не соответствует ожидаемому.", expectedResult, actualResult);
    }

    @After
    public void teardown() {
        driver.quit();
    }
}