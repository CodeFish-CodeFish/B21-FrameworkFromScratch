package com.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class LumaHook {

    public static WebDriver driver;

    @Before
    public void startUp(){
        driver = DriverHelper.getDriver();
        driver.get(ConfigReader.readProperty("lumaURL"));
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
