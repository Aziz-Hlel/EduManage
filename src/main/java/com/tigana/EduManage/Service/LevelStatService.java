package com.tigana.EduManage.Service;


import com.tigana.EduManage.DTO.LevelStatDto;
import com.tigana.EduManage.Models.LevelStat;
import com.tigana.EduManage.Repo.LevelStatRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class LevelStatService {

    private final LevelStatRepo levelStatRepo;

    private LevelStatDto  toDto(LevelStat levelStat) {
        return new LevelStatDto(
                levelStat.getId(),
                levelStat.getLevel(),
                levelStat.getNbr_st(),
                levelStat.getNbr_classes(),
                levelStat.getNbr_leaving(),
                levelStat.getNbr_comming()
        );
    }

    public List<LevelStatDto> getAllLevelStat(int govId) {
         return levelStatRepo.findByGovId(govId)
                 .stream()
                 .map(this::toDto)
                 .collect(Collectors.toList());
    }

}
