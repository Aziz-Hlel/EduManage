package com.tigana.EduManage.Service;


import com.tigana.EduManage.DTO.StudentDto;
import com.tigana.EduManage.ErrorHandler.GeneralException;
import com.tigana.EduManage.Models.Student;
import com.tigana.EduManage.Repo.StudentRepo;
import com.tigana.EduManage.Utils.ResponseMessages;
import lombok.AllArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentRepo studentRepo;

    private StudentDto convertToDto(Student student){
        return new StudentDto(
                student.getId(),
                student.getName(),
                student.getFatherName(),
                student.getDob(),
                student.getSchool().getId(),
                student.getSchool().getName()
        );

    }

    @NotNull
    public StudentDto getStudentById(Long studentId){
        Student student = studentRepo.findById(studentId)
                .orElseThrow(()->new GeneralException(ResponseMessages.Common.SOMETHING_WRONG, HttpStatus.I_AM_A_TEAPOT));

        return convertToDto(student);
    }

}
