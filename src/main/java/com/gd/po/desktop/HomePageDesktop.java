package com.gd.po.desktop;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class HomePageDesktop {

    public SelenideElement myAccount = $(".desktop-only .account-header-menu-item__signin-register-link");

    public void open(){
        Selenide.open("https://www.neimanmarcus.com/en-us/");
    }
}
