package com.tigana.EduManage.DTO;

import lombok.Data;

@Data
public class SchoolDto {
    private int id;
    private String name;
    private Boolean isPrivate;
    private int delId;
    private String delName;

}
