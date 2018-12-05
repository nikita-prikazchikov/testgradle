package com.gd.data;

import com.gd.objects.User;
import lombok.Data;

@Data
public abstract class TestData {
    private User user;

    public abstract void initTestData();
}
