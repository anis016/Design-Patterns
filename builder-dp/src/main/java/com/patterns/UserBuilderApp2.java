package com.patterns;

import com.patterns.method2.pojo.User;
import com.patterns.method2.builder.UserBuilder;

public class UserBuilderApp2 {

    public static void main(String[] args) {
        User user1 = new UserBuilder("Sayed", "Hoque")
                .setAge(30)
                .setAddress("39124, Magdeburg")
                .setPhone("01928133")
                .build();

        User user2 = new UserBuilder("Hello", "World")
                .setAge(30)
                .setAddress("39124, Magdeburg")
                .build();

        System.out.println(user1);
        System.out.println(user2);
    }
}
