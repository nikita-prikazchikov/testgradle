package com.gd.po.desktop.account;

import com.codeborne.selenide.SelenideElement;
import com.gd.objects.Address;

import static com.codeborne.selenide.Selenide.$;

public class AddAddressForm {

    public SelenideElement firstName = $("#first-name");
    public SelenideElement lastName = $("#last-name");
    public SelenideElement country = $("#country");
    public SelenideElement line1 = $("#address1");
    public SelenideElement line2 = $("#address2");
    public SelenideElement city = $("#city");
    public SelenideElement province = $("#province");
    public SelenideElement state = $("#state");
    public SelenideElement zip = $("#zip");
    public SelenideElement phoneType = $("#phonetype");
    public SelenideElement phoneNumber = $("#phone");
    public SelenideElement poBoxNo = $("#po-box-no");
    public SelenideElement poBoxYes = $("#po-box-yes");

    public SelenideElement makeDefault = $("#makedefault");
    public SelenideElement save = $("button.account-new-submit");
    public SelenideElement cancel = $("button.account-cancel-link");

    public void populateAddress(Address address){
        firstName.val(address.getFirstName());
        lastName.val(address.getLastName());

        country.selectOption(address.getCountry());
        state.selectOption(address.getState());

        line1.val(address.getLine1());
        line2.val(address.getLine2());
        city.val(address.getCity());
        zip.val(address.getZip());
        phoneNumber.val(address.getPhoneNumber());
    }

}
