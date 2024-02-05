package chrome;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static ru.bor.helpers.Properties.properties;


public class BaseTest {
    public final int LATENCY_SECONDS = 20;
    protected WebDriver driver;

    @BeforeEach
    public void before(){
        System.setProperty(
                "webdriver.chrome.driver",
                properties.chromeDriverPath()
        );
        ChromeOptions options = new ChromeOptions();
        options.setBinary(properties.chromeBinary());
        options.setPageLoadStrategy(PageLoadStrategy.NONE);

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @AfterEach
    public void after(){
        driver.quit();
    }
}
