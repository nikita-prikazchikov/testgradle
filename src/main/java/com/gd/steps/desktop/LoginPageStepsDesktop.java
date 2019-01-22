package com.gd.steps.desktop;

import com.gd.objects.User;
import com.gd.po.LoginPageDesktop;
import com.gd.steps.generic.LoginPageSteps;
import io.qameta.allure.Step;

public class LoginPageStepsDesktop implements LoginPageSteps {

    private LoginPageDesktop loginPage = new LoginPageDesktop();

    @Override
    @Step("Login as user: '{user.email}'")
    public void login(User user){
        loginPage.login(user);
    }
}
