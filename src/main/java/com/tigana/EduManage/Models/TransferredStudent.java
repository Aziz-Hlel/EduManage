package com.tigana.EduManage.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Entity
@Table
@Data
@AllArgsConstructor
public class TransferredStudent {

    @Id
    private Long id;

    private String name;
    private String fatherName;
    private Date dob;
    private int level;
    private String prevSchool;
    private int prevSchoolId;
    private String del;
    private String newSchool;
    private int newSchoolId;
    private String reason;
    private String decision;
    private int decisionId;
    private String comment;

    @ManyToOne
    @JoinColumn(name = "gov_id" ,nullable = false)
    private Gov gov;

    private Date downloadDate;
}
