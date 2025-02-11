package com.tigana.EduManage.Models;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Gov {

    @Id
    private int  id;

    @Column(unique=true,nullable = false)
    private String name;



    @OneToMany(mappedBy = "gov", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Del> dels;

    @OneToMany(mappedBy = "gov", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<School> schools;

    @OneToMany(mappedBy = "gov", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TransferredStudent> transferredStudents;

    // CONSTRUCT

    public Gov( byte  id, String name) {
        this.id = id;
        this.name = name;
        this.dels = new ArrayList<>();
    }

    public Gov() {}

    @Override
    public String toString() {
        return this.getName();
    }


    // GETTERS & SETTERS

    public List<Del> getDels() {
        return dels;
    }

    public List<School> getSchools() {
        return schools;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }


}
