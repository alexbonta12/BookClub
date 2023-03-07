package com.example.bookclub.Model;

public class User {
    private int USER_ID;
    public String[] userName;
    public String userEmail;

    public User(){}
    public int getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(int USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String[] getUserName() {
        return userName;
    }

    public void setUserName(String[] userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }



}
