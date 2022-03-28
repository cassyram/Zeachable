package com.takehome.pages;
import com.takehome.utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    protected WebDriver driver;

    public BasePage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
}
