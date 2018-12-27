package com.sahabt.testinium.tests;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 *  Created by oktayuyar on 2018-12-26
 */
public class BaseTest {

    protected static WebDriver driver;
    private final String  driverName = "webdriver.chrome.driver";
    private final String  driverPath = "./driver/chromedriver";
    private final String  urlTestinium = "https://www.testinium.com";

    public static WebDriver getDriver() {
        return driver;
    }

    @Before
    public void setup() {
        System.setProperty(driverName, driverPath);
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.navigate().to(urlTestinium);
    }

    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
            File screenShotName = new File("src/test/resources/screenshots/" + scenario.getName() +"_"+ timeStamp + ".png");
            try {
                FileUtils.copyFile(scrFile, screenShotName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        driver.quit();
    }


}
