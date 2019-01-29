package com.gd;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.gd.config.DesktopInjector;
import com.gd.config.LocalTestDataInjector;
import com.gd.data.TestData;
import com.gd.steps.Steps;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Instant;
import java.util.logging.Level;

public abstract class AbstractTest {
    protected Steps    st;
    protected TestData td;

    public RemoteWebDriver driver;

    public static String server = "hub-cloud.browserstack.com";
    public static String username = "BROWSERSTACK_USERNAME";
    public static String accessKey = "BROWSERSTACK_ACCESS_KEY";

    @BeforeSuite
    public void init(){
        Injector injector = Guice.createInjector(new DesktopInjector());
        st = injector.getInstance(Steps.class);

        Injector testDataInjector = Guice.createInjector(new LocalTestDataInjector());
        td = testDataInjector.getInstance(TestData.class);

        td.initTestData();
        start();
    }

    @AfterMethod
    public void afterMethod(){
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        stop();
    }

    private void start() {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("browserstack.debug", true);
        capabilities.setCapability("project", "Java Selenide tests");
        capabilities.setCapability("build", Instant.now().toString());
        capabilities.setCapability("browser", "chrome");
        try {
            driver = new RemoteWebDriver(new URL("http://" + username + ":" + accessKey + "@" + server + "/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.setLogLevel(Level.ALL);
        WebDriverRunner.setWebDriver(driver);
    }

    private void stop() {
        driver.quit();
    }
}
