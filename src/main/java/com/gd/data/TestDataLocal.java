package com.gd.data;

import com.gd.objects.Address;
import com.gd.objects.User;
import com.github.javafaker.Faker;

import java.util.Locale;

public class TestDataLocal extends TestData {

    @Override
    public void initTestData() {
        Faker faker = new Faker(new Locale("en-US"));
        //smjfwtcec@emltmp.com : 0311991650fe2aacd423919db617f6794
        //26wWTbhjFK8WMYm
        setUser(new User("smjfwtcec@emltmp.com", "26wWTbhjFK8WMYm"));

        Address address = Address.builder()
                .firstName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .country("United States")
                .city(faker.address().city())
                .state("California")
                .line1(faker.address().streetAddress())
                .line2(faker.address().secondaryAddress())
                .zip(faker.address().zipCodeByState("CA"))
                .phoneNumber(faker.phoneNumber().cellPhone())
                .build();
        setAddress(address);
    }
}
