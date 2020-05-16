package com.zenity.intranet.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class LoginPage extends Page{

    By usernameInputLocator = By.xpath("//*[@id='user_login']");
    By passwordInputLocator = By.id("user_pass");

    public void goToLoginPage() {
        super.driver.get("http://intranet.zenity.fr");
    }

    public void login(String username, String password) {
        WebElement usernameInput = super.driver.findElement(this.usernameInputLocator);
        WebElement passwordInput = super.driver.findElement(this.passwordInputLocator);
        WebElement submitButton = super.driver.findElement(withTagName("input").below(passwordInput));

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        super.wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
    }
}
