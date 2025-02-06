package com.tigana.EduManage.Service;


import com.tigana.EduManage.DTO.DelDto;
import com.tigana.EduManage.DTO.SchoolDto;
import com.tigana.EduManage.ErrorHandler.GeneralException;
import com.tigana.EduManage.Models.Del;
import com.tigana.EduManage.Models.School;
import com.tigana.EduManage.Repo.SchoolRepo;
import com.tigana.EduManage.Utils.ResponseMessages;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class SchoolService {

    private SchoolRepo schoolRepo;

    private SchoolDto convertToDto(School school) {
        SchoolDto dto = new SchoolDto();
        dto.setId(school.getId());
        dto.setName(school.getName());
        dto.setIsPrivate(school.getIsPrivate());
        dto.setDelId(school.getDel().getId());
        dto.setDelName(school.getDel().getName());
        return dto;
    }

    @Transactional
    public List<SchoolDto> getAllSchools(int govId) {
        return schoolRepo.findByGovId(govId)
                .stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Transactional
    public List<SchoolDto> getPageableSchools(int govId , Pageable pageable) {
       return schoolRepo.findByGovId(govId,pageable)
               .stream()
               .map(this::convertToDto)
               .collect(Collectors.toList());
    }

    public SchoolDto getSchoolById(int id) {
       School school=  schoolRepo.findById(id).orElseThrow(()-> new GeneralException(ResponseMessages.Common.SOMETHING_WRONG,HttpStatus.I_AM_A_TEAPOT));
       return convertToDto(school);
    }

}
