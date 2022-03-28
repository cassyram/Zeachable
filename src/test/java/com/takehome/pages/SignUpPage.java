package com.takehome.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage {

    @FindBy(xpath = "//h3[.='Sign Up']")
    public WebElement header;

    @FindBy(id = "user_name")
    public WebElement nameField;

    @FindBy(id = "user_email")
    public WebElement emailField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(id = "allow_marketing_emails")
    public WebElement promoEmailsChkBox;

    @FindBy(xpath = "//input[@value='Sign up']")
    public WebElement signUpBtn;

    @FindBy(xpath = "//a[.='Login']")
    public WebElement loginLink;
}
