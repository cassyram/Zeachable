package com.takehome.tests;
import com.takehome.utils.ConfigurationReader;
import com.takehome.utils.Driver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class TestBase {

    protected WebDriver driver;

    @Before
    public void setUp(){
        driver = Driver.getDriver();
        driver.get(ConfigurationReader.getProperty("url"));
    }

    @After
    public void tearDown(){
        Driver.closeDriver();
    }

}
