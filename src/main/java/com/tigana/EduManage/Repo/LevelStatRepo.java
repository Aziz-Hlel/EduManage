package com.tigana.EduManage.Repo;

import com.tigana.EduManage.Models.LevelStat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LevelStatRepo extends JpaRepository<LevelStat, Integer> {

    List<LevelStat> findByGovId(int govId);
}
