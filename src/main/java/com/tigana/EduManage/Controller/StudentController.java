package com.tigana.EduManage.Controller;


import com.tigana.EduManage.DTO.ApiResponse;
import com.tigana.EduManage.DTO.StudentDto;
import com.tigana.EduManage.Enum.ApiMessage;
import com.tigana.EduManage.Service.StudentService;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/students")
public class StudentController {


    private final StudentService studentService;

    @GetMapping("/{studentId}")
    public ApiResponse<StudentDto> getStudent(@PathVariable Long studentId){
        StudentDto student =  studentService.getStudentById(studentId);
        return ApiResponse.<StudentDto>builder()
                .message(ApiMessage.success)
                .data(student)
                .build();
    }


}
