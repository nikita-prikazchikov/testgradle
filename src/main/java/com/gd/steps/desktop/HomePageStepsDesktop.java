package com.gd.steps.desktop;

import com.gd.po.desktop.HomePageDesktop;
import com.gd.po.desktop.ShippingPromotionWindow;
import com.gd.steps.generic.HomePageSteps;
import io.qameta.allure.Step;

public class HomePageStepsDesktop implements HomePageSteps {

    private HomePageDesktop         homePage = new HomePageDesktop();
    private ShippingPromotionWindow window   = new ShippingPromotionWindow();

    @Override
    @Step("Open Home page")
    public void openHomePage(){
        homePage.open();
        window.close();
    }

    @Override
    @Step("Navigate to login form")
    public void openLoginForm(){
        homePage.signInLink.click();
    }

    @Override
    @Step("Navigate to my account")
    public void openMyAccount() {
        homePage.myAccountLink.click();
    }
}
