package com.kodilla.good.patterns.challenges;


public class User {
    private String userName;
    private String userSurname;
    private String email;

    public User(String userName, String userSurname, String email) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userSurname='" + userSurname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
