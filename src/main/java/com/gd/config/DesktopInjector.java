package com.gd.config;

import com.gd.steps.desktop.AccountPageStepsDesktop;
import com.gd.steps.desktop.GenericStepsImpl;
import com.gd.steps.desktop.HomePageStepsDesktop;
import com.gd.steps.desktop.LoginPageStepsDesktop;
import com.gd.steps.generic.AccountPageSteps;
import com.gd.steps.generic.GenericSteps;
import com.gd.steps.generic.HomePageSteps;
import com.gd.steps.generic.LoginPageSteps;
import com.google.inject.AbstractModule;

public class DesktopInjector extends AbstractModule {

    @Override
    protected void configure() {
        bind(HomePageSteps.class).to(HomePageStepsDesktop.class);
        bind(LoginPageSteps.class).to(LoginPageStepsDesktop.class);
        bind(AccountPageSteps.class).to(AccountPageStepsDesktop.class);

        bind(GenericSteps.class).to(GenericStepsImpl.class);
    }
}
