package com.gd.po;

import com.codeborne.selenide.SelenideElement;
import com.gd.objects.User;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LoginPageDesktop {

    private SelenideElement email        = $("#login_email");
    private SelenideElement pasword      = $("#login_password");
    private SelenideElement submitButton = $("#signInBtn");

    public void login(User user){
        email.shouldBe(visible).val(user.getEmail());
        pasword.shouldBe(visible).val(user.getPassword());
        submitButton.click();
    }
}
