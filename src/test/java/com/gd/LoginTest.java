package com.gd;

import com.gd.config.DesktopInjector;
import com.gd.config.LocalTestDataInjector;
import com.gd.data.TestData;
import com.gd.steps.Steps;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LoginTest {
    private Steps    steps;
    private TestData testData;

    @BeforeSuite
    public void init(){
        Injector injector = Guice.createInjector(new DesktopInjector());
        steps = injector.getInstance(Steps.class);

        Injector testDataInjector = Guice.createInjector(new LocalTestDataInjector());
        testData = testDataInjector.getInstance(TestData.class);

        testData.initTestData();
    }

    @Test
    @Ignore
    private void loginTest() {
        steps.homePage.openHomePage();
        steps.homePage.openLoginForm();
        steps.loginPage.login(testData.getUser());
    }

    @Test
    void addShippingAddress(){
        loginTest();
        steps.homePage.openMyAccount();
        steps.accountPageSteps.openAddressBook();
        steps.accountPageSteps.addNewAddress(testData.getAddress());
    }
}
