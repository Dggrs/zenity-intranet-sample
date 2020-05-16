package com.zenity.intranet.steps;

import com.zenity.intranet.driver.WebDriverManager;
import io.cucumber.java8.En;
import org.openqa.selenium.WebDriver;

public class Hooks implements En {

    WebDriver driver = WebDriverManager.getDriver();

    public Hooks() {
        Before(() -> {
            this.driver.get("http://intranet.zenity.fr");
        });
    }
}
