package com.tigana.EduManage.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Del {

    @Id
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Boolean isPrivate;

    @ManyToOne
    @JoinColumn(name = "gov_id")
    private Gov gov;

    @OneToMany(mappedBy = "del")
    private List<School> schools;


}
