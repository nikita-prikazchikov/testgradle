package com.gd.steps.desktop;

import com.gd.po.HomePageDesktop;
import com.gd.po.ShippingPromotionWindowDesktop;
import com.gd.steps.generic.HomePageSteps;
import io.qameta.allure.Step;

public class HomePageStepsDesktop implements HomePageSteps {

    private HomePageDesktop                homePage = new HomePageDesktop();
    private ShippingPromotionWindowDesktop window   = new ShippingPromotionWindowDesktop();

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
