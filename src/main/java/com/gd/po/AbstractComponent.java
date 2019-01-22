package com.gd.po;

import com.codeborne.selenide.SelenideElement;

public abstract class AbstractComponent {
    private final SelenideElement root;

    public AbstractComponent(SelenideElement root) {
        this.root = root;
    }

    protected SelenideElement getRoot(){
        return root;
    }
}
