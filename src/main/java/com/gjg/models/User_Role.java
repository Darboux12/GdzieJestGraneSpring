package com.gjg.models;

import javax.persistence.*;

@Table(name = "user_role")
public class User_Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_user")
    private int id_user;

    @Column(name = "id_role")
    private String role;

    public User_Role(int id_user, String role) {
        this.id_user = id_user;
        this.role = role;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
