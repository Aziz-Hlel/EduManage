package com.tigana.EduManage.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LevelStat {

    @Id
    private int id;
    private int level;
    private int nbr_st;
    private float nbr_classes;
    private int nbr_leaving;
    private int nbr_comming;

    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;

    @ManyToOne
    @JoinColumn(name = "gov_id", nullable = false)
    private Gov gov;

}
