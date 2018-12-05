package com.gd.steps.desktop;

import com.gd.objects.User;
import com.gd.po.desktop.LoginPage;
import com.gd.steps.generic.LoginPageSteps;

public class LoginPageStepsDesktop implements LoginPageSteps {

    private LoginPage loginPage = new LoginPage();

    @Override
    public void login(User user){
        loginPage.login(user);
    }
}
