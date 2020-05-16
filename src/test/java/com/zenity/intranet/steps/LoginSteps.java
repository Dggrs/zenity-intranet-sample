package com.zenity.intranet.steps;

import com.zenity.intranet.pageObjects.HomePage;
import com.zenity.intranet.pageObjects.LoginPage;
import io.cucumber.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class LoginSteps implements En {

    public LoginSteps(LoginPage loginPage, HomePage homePage) {

        Given("^user is at the login page$", loginPage::goToLoginPage);

        When("^user is logging-in with (.*) (.*)$", loginPage::login);

        Then("^he should(|n't) be at the home page$", (String negation) -> {
            if (negation.isEmpty()) {
                assertTrue(homePage.isZenityLogoDisplayed());
                return;
            }
            assertNotEquals(homePage.getTitle(), "Intranet Zenity");
        });
    }
}
