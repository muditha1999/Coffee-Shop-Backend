package com.example.demo.DTO;

import javax.persistence.Column;

public class UserRegDTO {
    private String user_name;
    private String email;
    private String password;

    public UserRegDTO(String user_name, String email, String password) {
        this.user_name = user_name;
        this.email = email;
        this.password = password;
    }

    public UserRegDTO(){

    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserRegDTO{" +
                "user_name='" + user_name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
