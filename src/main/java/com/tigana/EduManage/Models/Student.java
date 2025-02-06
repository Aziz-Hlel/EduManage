package com.tigana.EduManage.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    private Long id;

    private String name;
    private String fatherName;

    @Column(nullable = true)
    private LocalDate dob;

    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;



}
