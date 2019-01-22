package com.gd.steps.desktop;

import com.gd.objects.User;
import com.gd.steps.generic.GenericSteps;
import com.gd.steps.generic.HomePageSteps;
import com.gd.steps.generic.LoginPageSteps;
import com.google.inject.Inject;

public class GenericStepsImpl implements GenericSteps {

    @Inject
    public HomePageSteps  home;
    @Inject
    public LoginPageSteps login;

    @Override
    public void openAndLogin(User user) {
        home.openHomePage();
        home.openLoginForm();
        login.login(user);
    }
}
