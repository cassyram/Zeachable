package com.takehome.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResetPasswordPage extends BasePage{

    @FindBy(xpath = "//h3[.='Reset Password']")
    public WebElement header;

    @FindBy(id = "email")
    public WebElement emailField;
}
