package ru.bor.pages;

import org.openqa.selenium.WebDriver;

public class YandexMarketMain {
    WebDriver driver;
    public YandexMarketMain(WebDriver driver) {
        this.driver = driver;
    }

    public void openMainPage(String url){
        driver.get(url);
    }
}
