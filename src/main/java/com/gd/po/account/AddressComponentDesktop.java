package com.gd.po.account;

import com.codeborne.selenide.SelenideElement;
import com.gd.po.AbstractComponent;

public class AddressComponentDesktop extends AbstractComponent {

    public SelenideElement editLink   = getRoot().$("a.account-address-edit");
    public SelenideElement deleteLink = getRoot().$("a.account-address-delete");
    public SelenideElement address    = getRoot().$("td.address-display");

    AddressComponentDesktop(SelenideElement root) {
        super(root);
    }
}
