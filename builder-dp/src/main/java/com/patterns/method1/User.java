package com.patterns.method1;

public class User {

    private final String fullName;
    private final int age;
    private final String phone;
    private final Address address;

    private User(UserBuilder builder) {
        this.fullName = builder.firstName + " " + builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public Address getAddress() {
        return address;
    }

    /* The builder class */
    public static class UserBuilder {

        private final String firstName; // firstName is mandatory
        private final String lastName;  // lastName is mandatory
        private int age;
        private String phone;
        private Address address;

        public UserBuilder(String firstName, String lastName) {
            if (firstName == null || lastName == null) {
                throw new IllegalArgumentException("firstName and lastName cannot be null");
            }
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    @Override
    public String toString() {
        StringBuilder message = new StringBuilder(String.format("User(full name=%s", this.getFullName()));

        int age = this.getAge();
        if (age != 0) {
            message.append(String.format(", age=%d", age));
        }
        String phone = this.getPhone();
        if (phone != null) {
            message.append(String.format(", phone=%s", phone));
        }

        Address address = this.getAddress();
        if (address != null) {
            message.append(String.format(", address=[city: %s, zip: %d]", address.getCity(), address.getZip()));
        }

        message.append(")");

        return message.toString();
    }
}
