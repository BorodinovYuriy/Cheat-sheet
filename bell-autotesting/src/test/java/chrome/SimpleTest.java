package chrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SimpleTest{



    @Test
    public void openYandexMarketPageWithChrome(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chrome/chromedriver");
        String pathToChromeBinary = "src/main/resources/drivers/chrome/binary/chrome-linux64/chrome";
        ChromeOptions options = new ChromeOptions();
        options.setBinary(pathToChromeBinary);
        WebDriver driver = new ChromeDriver(options);
        try{
            driver.get("https://market.yandex.ru/");
            driver.manage().window().maximize();

            String containsWord = "Яндекс Маркет";
            String title = driver.getTitle();
            Assertions.assertTrue(title.contains(containsWord),
                    "Тайтл сайта: "+title+", проверяется на содержание подстроки: "+containsWord);
        }finally {
            driver.quit();
        }

    }
}
