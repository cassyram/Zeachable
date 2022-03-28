package com.takehome.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage {

    @FindBy(id = "header-sign-up-btn")
    public WebElement signUpBtn;

    @FindBy(xpath = "//a[contains(text(),'Login')]")
    public WebElement loginBtn;

    @FindBy(xpath = "//*[@class='dropdown']")
    public WebElement myProfileDropdown;
}

