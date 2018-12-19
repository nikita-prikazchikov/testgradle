package com.gd.objects;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {

    String firstName;
    String lastName;
    String country;
    String line1;
    String line2;
    String city;
    String state;
    String zip;
    String phoneType;
    String phoneNumber;
    String poBoxNo;
    String poBoxYes;
}
