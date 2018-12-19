package com.gd.steps.desktop;

import com.gd.objects.Address;
import com.gd.po.desktop.account.AccountOverviewForm;
import com.gd.po.desktop.account.AccountPage;
import com.gd.po.desktop.account.AddAddressForm;
import com.gd.po.desktop.account.AddressBookForm;
import com.gd.steps.generic.AccountPageSteps;
import io.qameta.allure.Step;

public class AccountPageStepsDesktop implements AccountPageSteps {

    private AccountPage accountPage = new AccountPage();
    private AccountOverviewForm accountOverviewForm = new AccountOverviewForm();
    private AddAddressForm addAddressForm = new AddAddressForm();
    private AddressBookForm addressBookForm = new AddressBookForm();

    @Override
    @Step("Open Address book")
    public void openAddressBook() {
        accountPage.addressBook.click();
    }

    @Override
    @Step("Add new shipping address")
    public void addNewAddress(Address address) {
        addressBookForm.addAddressLink.click();
        addAddressForm.populateAddress(address);
        addAddressForm.save.click();
    }
}
