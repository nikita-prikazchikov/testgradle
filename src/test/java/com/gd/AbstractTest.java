package com.gd;

import com.codeborne.selenide.Selenide;
import com.gd.config.DesktopInjector;
import com.gd.config.LocalTestDataInjector;
import com.gd.data.TestData;
import com.gd.steps.Steps;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public abstract class AbstractTest {
    protected Steps    st;
    protected TestData td;

    @BeforeSuite
    public void init(){
        Injector injector = Guice.createInjector(new DesktopInjector());
        st = injector.getInstance(Steps.class);

        Injector testDataInjector = Guice.createInjector(new LocalTestDataInjector());
        td = testDataInjector.getInstance(TestData.class);

        td.initTestData();
    }

    @AfterMethod
    public void afterMethod(){
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
    }
}
