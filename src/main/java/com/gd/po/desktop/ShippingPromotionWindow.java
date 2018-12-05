package com.gd.po.desktop;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ShippingPromotionWindow {

    private SelenideElement root  = $("#tinybox");
    private SelenideElement close = root.$("#closeButton");

    public void close(){
        if(root.exists()){
            close.click();
        }
    }
}
