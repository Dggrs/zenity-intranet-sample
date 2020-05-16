package com.zenity.intranet.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends Page {

    @FindBy(id = "logo")
    private WebElement zenityLogo;

    public String getTitle() {
        return super.driver.getTitle();
    }

    public boolean isZenityLogoDisplayed() {
        super.wait.until(ExpectedConditions.visibilityOf(this.zenityLogo));
        return this.zenityLogo.isDisplayed();
    }
}
