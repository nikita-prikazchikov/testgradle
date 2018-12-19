package com.gd.data;

import com.gd.objects.Address;
import com.gd.objects.User;
import lombok.Data;

@Data
public abstract class TestData {
    private User user;
    private Address address;

    public abstract void initTestData();
}
