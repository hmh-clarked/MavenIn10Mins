package org.thatsdecent;

import java.util.Locale;

public class User {

    private String userName;
    private String firstName;
    private String surName;
    private String email;
    private String tag;
    private String title;

    public User(String userName, String title) {
        this.userName = userName;

        this.firstName = userName.split(" ")[0];
        this.surName = userName.split(" ")[1];
        this.email = "test@test.com";
        this.tag = this.surName.toUpperCase(Locale.ROOT);
        this.title = title;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
