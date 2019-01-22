package com.gd.po;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class HomePageDesktop {

    public SelenideElement signInLink    = $(".desktop-only .account-header-menu-item__signin-register-link");
    public SelenideElement myAccountLink = $(".account-header-menu-item__loggedin-user-link");

    public void open() {
        Selenide.open("https://www.neimanmarcus.com/en-us/");
    }
}
