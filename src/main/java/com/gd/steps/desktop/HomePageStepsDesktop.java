package com.gd.steps.desktop;

import com.gd.po.desktop.HomePageDesktop;
import com.gd.po.desktop.ShippingPromotionWindow;
import com.gd.steps.generic.HomePageSteps;

public class HomePageStepsDesktop implements HomePageSteps {

    private HomePageDesktop         homePage = new HomePageDesktop();
    private ShippingPromotionWindow window   = new ShippingPromotionWindow();

    @Override
    public void openHomePage(){
        homePage.open();
        window.close();
    }

    @Override
    public void openLoginForm(){
        homePage.myAccount.click();
    }
}
