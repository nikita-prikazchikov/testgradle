package com.gd.steps.desktop;

import com.codeborne.selenide.SelenideElement;
import com.gd.objects.Address;
import com.gd.po.account.AccountOverviewFormDesktop;
import com.gd.po.account.AccountPageDesktop;
import com.gd.po.account.AddAddressFormDesktop;
import com.gd.po.account.AddressBookFormDesktop;
import com.gd.steps.generic.AccountPageSteps;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class AccountPageStepsDesktop implements AccountPageSteps {

    private AccountPageDesktop         accountPage         = new AccountPageDesktop();
    private AccountOverviewFormDesktop accountOverviewForm = new AccountOverviewFormDesktop();
    private AddAddressFormDesktop      addAddressForm      = new AddAddressFormDesktop();
    private AddressBookFormDesktop     addressBookForm     = new AddressBookFormDesktop();

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
        addAddressForm.save.shouldNotBe(visible);
    }

    @Override
    @Step("Verify added shipping address on the form")
    public void verifyAddedAddress(Address address) {
        SelenideElement element = addressBookForm.getRecentAddress().address;
        element.shouldHave(text(address.getFirstName()));
        element.shouldHave(text(address.getLastName()));
        element.shouldHave(text(address.getLine1()));
        element.shouldHave(text(address.getLine2()));
        element.shouldHave(text(address.getCity()));
        element.shouldHave(text(address.getZip()));
        //State is shown as abbr here. Need to map it before validation
        //Phone has different format no brackets
//        element.shouldHave(text(address.getPhoneNumber()));
//        element.shouldHave(text(address.getState()));
    }
}
