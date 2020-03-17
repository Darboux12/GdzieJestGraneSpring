package com.gjg.models;

import javax.persistence.*;

@Entity
@Table(name = "Role")
public class Role {

    @Id
    @Column(name = "id_role")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_role;

    @Column(name = "role")
    private String role;

    public Role(){}

    public Role(int id_role, String role) {
        this.id_role = id_role;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getId_role() {
        return id_role;
    }

    public void setId_role(int id_role) {
        this.id_role = id_role;
    }
}
