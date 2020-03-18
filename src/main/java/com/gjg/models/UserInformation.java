package com.gjg.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "UserInformation")
public class UserInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_user_info")
    private int id_user_info;

    @Column(name = "login")
    private String login;

    @Column(name = "age")
    private int age;

    @Column(name = "creation_date")
    private Timestamp creation_date;


    public UserInformation(String login, int age, Timestamp creation_date) {
        this.login = login;
        this.age = age;
        this.creation_date = creation_date;
    }


    public String getEmail() {
        return login;
    }

    public void setEmail(String email) {
        this.login = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Timestamp getCreation_date() {
        return creation_date;
    }

    public int getId_user_info() {
        return id_user_info;
    }

    public void setId_user_info(int id_user_info) {
        this.id_user_info = id_user_info;
    }
}
