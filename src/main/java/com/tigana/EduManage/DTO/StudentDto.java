package com.tigana.EduManage.DTO;

import java.time.LocalDate;

public record StudentDto(Long id, String name, String fatherName, LocalDate dob,int school_id,String schoolName) {
}
