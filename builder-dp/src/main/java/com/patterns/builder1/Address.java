package com.patterns.builder1;

public class Address {

    private final int zip;
    private final String city;

    public Address(int zip, String city) {
        this.zip = zip;
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public String getCity() {
        return city;
    }
}
