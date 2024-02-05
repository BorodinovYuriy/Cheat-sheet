package ru.bor.helpers;

import org.aeonbits.owner.ConfigFactory;
/**
 * Статический класс для загрузки конфигураций из интерфейса TestsProperties
 */
public class Properties {
    public static TestsProperties properties = ConfigFactory.create(TestsProperties.class);

}
