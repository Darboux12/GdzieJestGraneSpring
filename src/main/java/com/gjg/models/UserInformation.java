package com.gjg.models;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.sql.Timestamp;

@Entity
@Table(name = "UserInformation")
public class UserInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_user_info")
    private int id_user_info;

    @Column(name = "login")
    @Length(min = 5, message = "*Your user name must have at least 5 characters")
    @NotEmpty(message = "*Please provide a user name")
    private String login;

    @Column(name = "age")
    @Min(value = 1, message = "*Please provide a valid age")
    @Max(value = 100, message = "*Please provide a valid age")
    private int age;

    @Column(name = "creation_date")
    private Timestamp creation_date;

    public UserInformation(){}


    public UserInformation(String login, int age) {
        this.login = login;
        this.age = age;
    }

    public String getLogin() {
        return login;
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

    public void setCreation_date(Timestamp creation_date) {
        this.creation_date = creation_date;
    }

    public int getId_user_info() {
        return id_user_info;
    }

    public void setId_user_info(int id_user_info) {
        this.id_user_info = id_user_info;
    }
}
