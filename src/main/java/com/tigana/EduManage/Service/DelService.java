package com.tigana.EduManage.Service;


import com.tigana.EduManage.DTO.DelDto;
import com.tigana.EduManage.Models.Del;
import com.tigana.EduManage.Repo.DelRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class DelService {

    private DelRepo delRepo;

    private DelDto convertToDto(Del del) {
        DelDto dto = new DelDto();
        dto.setId(del.getId());
        dto.setName(del.getName());
        return dto;
    }


    public List<DelDto> getAllDels(int govId){
        return delRepo.findDelByGovId(govId)
                .stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());


    }
}
