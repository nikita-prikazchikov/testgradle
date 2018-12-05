package com.gd.config;

import com.gd.data.TestData;
import com.gd.data.TestDataLocal;
import com.google.inject.AbstractModule;

public class LocalTestDataInjector extends AbstractModule {

    @Override
    protected void configure() {
        bind(TestData.class).to(TestDataLocal.class);
    }
}
