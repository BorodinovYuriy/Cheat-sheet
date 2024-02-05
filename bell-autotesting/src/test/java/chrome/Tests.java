package chrome;

import org.junit.jupiter.api.Test;
import ru.bor.pages.YandexMarketMain;

import static ru.bor.helpers.xpaths.YandexMarketXpathReader.getXPath;

public class Tests extends BaseTest{

    @Test
    public void yandexMarketCatalogTest(){
        YandexMarketMain yandexPage = new YandexMarketMain(driver);
        yandexPage.openMainPage(getXPath("yandex.market.url"));
        System.out.println(getXPath("yandex.market.url"));

    }


}
