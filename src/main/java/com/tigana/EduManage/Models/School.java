package com.tigana.EduManage.Models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table
@Data
public class School {

    @Id
    private int id;
    private String name;

    @Getter @Setter
    private Boolean isPrivate;

    @ManyToOne
    @JoinColumn(name = "gov_id" , nullable = false)
    private Gov gov;

    @ManyToOne
    @JoinColumn(name = "del_id" ,nullable = false)
    private Del del;


    @OneToMany(mappedBy = "school")
    private List<LevelStat> levelStats;

    public School() {}



}
