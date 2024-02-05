package ru.bor.helpers;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:src/main/resources/tests.properties"
})
public interface TestsProperties extends Config {
    @Key("chrome.driver.path")
    String chromeDriverPath();
    @Key("chrome.binary")
    String chromeBinary();
}