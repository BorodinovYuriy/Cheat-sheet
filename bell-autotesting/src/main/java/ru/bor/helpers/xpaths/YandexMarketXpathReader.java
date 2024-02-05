package ru.bor.helpers.xpaths;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class YandexMarketXpathReader {
    public static String getXPath(String xPathName) {
        Properties prop = new Properties();
        String propertyValue = null;
        try {
            prop.load(Files.newInputStream(
                    Paths.get("src/main/java/ru/bor/helpers/xpaths/xpaths_yandexmarket.properties"))
            );
            propertyValue = prop.getProperty(xPathName);
        } catch (IOException e) {
            // TODO: 19.01.2024 Возможно - в лог...
            System.out.println("Не смог прочитать xpath из файла xpaths_yandexmarket.properties ->" + xPathName);
        }
        return propertyValue;
    }
}
