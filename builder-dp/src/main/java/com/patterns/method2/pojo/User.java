package com.patterns.method2.pojo;

public class User {

    private String firstName;
    private String lastName;
    private int age;
    private String phone;
    private String address;

    public User() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder message = new StringBuilder(
                String.format("User(first name=%s, last name=%s", this.getFirstName(), this.getLastName())
        );

        int age = this.getAge();
        if (age != 0) {
            message.append(String.format(", age=%d", age));
        }
        String phone = this.getPhone();
        if (phone != null) {
            message.append(String.format(", phone=%s", phone));
        }

        String address = this.getAddress();
        if (address != null) {
            message.append(String.format(", address=%s", address));
        }

        message.append(")");

        return message.toString();
    }
}