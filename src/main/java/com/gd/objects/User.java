package com.gd.objects;

import lombok.Data;
import lombok.NonNull;

@Data
public class User {

    @NonNull
    String email;
    @NonNull
    String password;
}
