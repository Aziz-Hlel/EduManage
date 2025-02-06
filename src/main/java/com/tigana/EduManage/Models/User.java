package com.tigana.EduManage.Models;

import jakarta.persistence.*;

@Entity
@Table
public class User {

    @Id
    private long id;

    @Column(unique=true,nullable = false)
    private String name;

    @Column(unique=true,nullable = false)
    private String email;



    public User() {}






    public String getEmail() {
        return email;

    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }
}
