package com.sujanmaharjan008.twitter.model;

public class User {

    private String fullName;
    private String email;
    private String phone;
    private String password;
    private String profileImage;

    public User(String fullName, String email, String phone, String password, String profileImage) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.profileImage = profileImage;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }
}
