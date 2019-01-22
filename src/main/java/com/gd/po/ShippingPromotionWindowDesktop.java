package com.gd.po;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ShippingPromotionWindowDesktop {

    private SelenideElement root  = $("#tinybox");
    private SelenideElement close = root.$("#closeButton");

    public void close(){
        if(root.exists()){
            close.click();
        }
    }
}
