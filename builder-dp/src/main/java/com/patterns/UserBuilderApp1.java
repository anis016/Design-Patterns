package com.patterns;

import com.patterns.builder1.Address;
import com.patterns.builder1.User;

public class UserBuilderApp1 {

    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Sayed", "Hoque")
                .setAge(30)
                .setAddress(new Address(39124, "Magdeburg"))
                .setPhone("01928133")
                .build();

        User user2 = new User.UserBuilder("Hello", "World")
                .setAge(30)
                .setAddress(new Address(39124, "Magdeburg"))
                .build();

        System.out.println(user1);
        System.out.println(user2);
    }
}
