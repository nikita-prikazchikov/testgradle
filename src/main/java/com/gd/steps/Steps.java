package com.gd.steps;

import com.gd.steps.generic.AccountPageSteps;
import com.gd.steps.generic.HomePageSteps;
import com.gd.steps.generic.LoginPageSteps;
import com.google.inject.Inject;
import lombok.Setter;

@Setter
public class Steps {
    @Inject
    public HomePageSteps homePage;
    @Inject
    public LoginPageSteps loginPage;
    @Inject
    public AccountPageSteps accountPageSteps;
}
