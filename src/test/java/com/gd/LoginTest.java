package com.gd;

import io.qameta.allure.Description;
import io.qameta.allure.TmsLink;
import org.testng.annotations.Test;

public class LoginTest extends AbstractTest {

    @Test
    @TmsLink("PRD_TC_023_Account_Sign In")
    @Description("Verify that user is able to sign in to his user account with  valid user credentials")
    private void loginTest() {
        st.home.openHomePage();
        st.home.openLoginForm();
        st.login.login(td.getUser());
    }

    @Test
    void addShippingAddress(){
        st.generic.openAndLogin(td.getUser());

        st.home.openMyAccount();
        st.account.openAddressBook();
        st.account.addNewAddress(td.getAddress());
        st.account.verifyAddedAddress(td.getAddress());
    }
}
