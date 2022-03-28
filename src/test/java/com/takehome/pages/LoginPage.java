package com.takehome.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//h3[.='Login']")
    public WebElement header;

    @FindBy(id = "email")
    public WebElement emailField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(id = "remember_me")
    public WebElement rememberMeChkBox;

    @FindBy(xpath = "//a[.='Forgot Password']")
    public WebElement forgotPasswordLink;

    @FindBy(css = "[data-testid='login-button']")
    public WebElement loginBtn;

    @FindBy(xpath = "//a[.='Sign Up']")
    public WebElement signUpLink;
}


