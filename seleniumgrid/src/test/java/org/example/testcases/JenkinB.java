package org.example.testcases;


import org.example.base.TestBase;
import org.example.pages.JenkinsBasicPage;
import org.example.reportListener.TestListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.MalformedURLException;

public class JenkinB extends TestBase {
    public JenkinsBasicPage jenkinsBasicPage;
    public SoftAssert softAssert;
    @BeforeMethod
    public void predefineData() throws InterruptedException, MalformedURLException {
        setupDriver();
        jenkinsBasicPage=getJenkinsBasicPage();
        softAssert = new SoftAssert();
    }
    @AfterMethod
    public void postExecute()
    {
        driverQuit();

    }
    @Test
    public void TC1() throws InterruptedException, IOException {
        System.out.println("TC1");
        jenkinsBasicPage.navigateToJenkinsBasicMenu();
        logger.info("AB1");
        String val = jenkinsBasicPage.validateJenkinsPageHeader();
        softAssert.assertEquals(val,"Jenkins Basic");
        softAssert.assertAll();
        logger.info("All2");
        logger.debug("Debug message");
        logger.info("Info message");
        logger.warn("Warning message");
        logger.error("Error message");
        logger.fatal("Fatal message");
    }
    @Test
    public void TC2() throws InterruptedException {
        System.out.println("TC2");
        jenkinsBasicPage.navigateToJenkinsBasicMenu();
        logger.info("AB3");
        String val = jenkinsBasicPage.validateJenkinsPageHeader();
        softAssert.assertEquals(val,"Jenkins Basic");
        softAssert.assertAll();
        logger.info("Al4");
        logger.debug("Debug message");
        logger.info("Info message");
        logger.warn("Warning message");
        logger.error("Error message");
        logger.fatal("Fatal message");
    }

}
