package com.zenity.intranet.pageObjects;

import com.zenity.intranet.driver.WebDriverManager;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class Page {

    protected final WebDriver driver;
    protected WebDriverWait wait;

    public Page() {
        this.driver = WebDriverManager.getDriver();
        PageFactory.initElements(this.driver, this);
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(4));
    }
}
