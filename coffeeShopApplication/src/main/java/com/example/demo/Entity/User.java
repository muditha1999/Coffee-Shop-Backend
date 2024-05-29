package com.example.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name="Customer")
public class User {
    @Id
    @Column(name="user_id",length = 10)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int user_id;

    @Column(name="user_name",nullable = false,length = 100)
    private String user_name;

    @Column(name="email",nullable = false,length = 50,unique = true)
    private String email;

    @Column(name="password",nullable = false,length = 50,unique = true)
    private String password;


    public User(int user_id, String user_name, String email, String password) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.email = email;
        this.password = password;
    }
    public User() {

    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
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
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User(String user_name, String email, String password) {
        this.user_name = user_name;
        this.email = email;
        this.password = password;
    }
}
