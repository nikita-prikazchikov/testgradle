package com.gd.po.account;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.gd.po.AbstractComponent;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class AddressBookFormDesktop {

    public  SelenideElement    addAddressLink = $("#ctl-addr-add");
    private ElementsCollection addresses      = $$(".account-table tr").exclude(Condition.cssClass("no-padding"));

    public AddressComponentDesktop getRecentAddress() {
        //Recent address is added to the top of the page
        return new AddressComponentDesktop(addresses.get(1));
    }
}

