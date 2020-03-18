package com.gjg.models;

import javax.persistence.*;

@Entity
@Table(name = "USER")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_user")
    private int id_user;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @ManyToOne()
    @JoinColumn(name="id_role", nullable=false)
    private Role role;

    @OneToOne(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
    @JoinColumn(name = "id_user_info", referencedColumnName = "id_user_info", nullable = false)
    private UserInformation userInformation;

    public User(){}

    public User(String email, String password, Role role, UserInformation userInformation){
        this.email = email;
        this.password = password;
        this.role = role;
        this.userInformation = userInformation;
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

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public UserInformation getUserInformation() {
        return userInformation;
    }

    public void setUserInformation(UserInformation userInformation) {
        this.userInformation = userInformation;
    }
}
