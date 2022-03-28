package com.takehome.tests;

import com.takehome.pages.*;
import com.takehome.utils.BrowserUtils;
import com.takehome.utils.ConfigurationReader;
import org.junit.Assert;
import org.junit.Test;

public class TakeHomeTests extends TestBase {

    Homepage homepage = new Homepage();
    SignUpPage signUpPage = new SignUpPage();
    LoginPage loginPage = new LoginPage();
    ResetPasswordPage resetpasswordPage = new ResetPasswordPage();

    @Test
    public void validateSignUpButton(){
        BrowserUtils.checkIfElementVisible(homepage.signUpBtn);
        homepage.signUpBtn.click();
        signUpPage.nameField.sendKeys(ConfigurationReader.getProperty("fullName"));
        signUpPage.emailField.sendKeys(ConfigurationReader.getProperty("signUpEmail"));
        signUpPage.passwordField.sendKeys(ConfigurationReader.getProperty("signupPassword"));
        signUpPage.signUpBtn.click();
        BrowserUtils.checkIfElementVisible(homepage.myProfileDropdown);
    }

    @Test
    public void validateEmailPromotionsChkBox(){
        homepage.signUpBtn.click();
        BrowserUtils.checkIfElementVisible(signUpPage.promoEmailsChkBox);
        signUpPage.promoEmailsChkBox.click();
        Assert.assertTrue(signUpPage.promoEmailsChkBox.isSelected());
        signUpPage.promoEmailsChkBox.click();
        Assert.assertFalse(signUpPage.promoEmailsChkBox.isSelected());
    }

    @Test
    public void validateLoginLinkOnSignUpPage(){
        homepage.signUpBtn.click();
        BrowserUtils.checkIfElementVisible(signUpPage.loginLink);
        signUpPage.loginLink.click();
        BrowserUtils.waitForVisibility(loginPage.header, 2);
        String actualHeader = loginPage.header.getText();
        String expHeader = "Login";
        Assert.assertEquals(expHeader,actualHeader);
        loginPage.emailField.sendKeys(ConfigurationReader.getProperty("loginEmail"));
        loginPage.passwordField.sendKeys(ConfigurationReader.getProperty("loginPassword"));
        loginPage.loginBtn.click();
        BrowserUtils.checkIfElementVisible(homepage.myProfileDropdown);
    }

    @Test
    public void validateLoginButton(){
        BrowserUtils.checkIfElementVisible(homepage.loginBtn);
        homepage.loginBtn.click();
        loginPage.emailField.sendKeys(ConfigurationReader.getProperty("loginEmail"));
        loginPage.passwordField.sendKeys(ConfigurationReader.getProperty("loginPassword"));
        loginPage.loginBtn.click();
        BrowserUtils.checkIfElementVisible(homepage.myProfileDropdown);
    }

    @Test
    public void validateRememberMeChkBox(){
        homepage.loginBtn.click();
        Assert.assertTrue(loginPage.rememberMeChkBox.isSelected());
        loginPage.rememberMeChkBox.click();
        Assert.assertFalse(loginPage.rememberMeChkBox.isSelected());
        loginPage.rememberMeChkBox.click();
        Assert.assertTrue(loginPage.rememberMeChkBox.isSelected());
    }

    @Test
    public void validateForgotPasswordLinkOnLoginPage(){
        homepage.loginBtn.click();
        loginPage.forgotPasswordLink.click();
        BrowserUtils.waitForVisibility(resetpasswordPage.header, 3);
        String actualHeader = resetpasswordPage.header.getText();
        String expHeader = "Reset Password";
        Assert.assertEquals(expHeader,actualHeader);
    }

    @Test
    public void validateSignUpLinkOnLoginPage(){
        homepage.loginBtn.click();
        BrowserUtils.checkIfElementVisible(loginPage.signUpLink);
        loginPage.signUpLink.click();
        String actualHeader = signUpPage.header.getText();
        String expHeader = "Sign Up";
        Assert.assertEquals(expHeader,actualHeader);
    }
}

