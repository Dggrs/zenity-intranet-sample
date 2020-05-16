package com.zenity.intranet;

import com.zenity.intranet.driver.WebDriverManager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"./src/test/resources/features"},
        glue = {"com.zenity.intranet.steps", "com/zenity/intranet/pageObjects"},
        monochrome = true,
        plugin = {
                "pretty",
                "json:target/cucumber-report.json"
        }
)
public class TestRunner {

    private static WebDriver driver;

    @BeforeClass
    public static void beforeTest() {
        WebDriverManager.setDriver();
        driver = WebDriverManager.getDriver();
    }

    @AfterClass
    public static void afterTest() {
        WebDriverManager.getDriver().quit();
    }
}

