package com.tigana.EduManage.Controller;


import com.tigana.EduManage.DTO.ApiResponse;
import com.tigana.EduManage.DTO.DelDto;
import com.tigana.EduManage.Enum.ApiMessage;
import com.tigana.EduManage.Models.Del;
import com.tigana.EduManage.Service.DelService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/dels")
@AllArgsConstructor
public class DelController {

    private DelService delService;

    @GetMapping
    public ApiResponse<List<DelDto>> getAllDels(){
        int govId = 84;
        List<DelDto> result = delService.getAllDels(govId);

        return ApiResponse.<List<DelDto>>builder()
                .message(ApiMessage.success)
                .data(result)
                .build();
        
    }



}
