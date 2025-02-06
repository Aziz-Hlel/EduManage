package com.tigana.EduManage.Controller;


import com.tigana.EduManage.DTO.ApiResponse;
import com.tigana.EduManage.DTO.LevelStatDto;
import com.tigana.EduManage.Enum.ApiMessage;
import com.tigana.EduManage.Service.LevelStatService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/levelStats")
@AllArgsConstructor
public class LevelStatController {

    private final LevelStatService levelStatService;



    @RequestMapping()
    public ApiResponse<List<LevelStatDto>> getAllLevelStat() {
        int govId = 84;

        List<LevelStatDto> levelStats = levelStatService.getAllLevelStat(govId);

        return ApiResponse.<List<LevelStatDto>>builder()
                .message(ApiMessage.success)
                .data(levelStats)
                .build();
    }


}
