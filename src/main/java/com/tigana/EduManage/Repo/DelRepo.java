package com.tigana.EduManage.Repo;

import com.tigana.EduManage.Models.Del;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DelRepo extends JpaRepository<Del, Integer> {

    List<Del> findDelByGovId(int govId);
    Page<Del> findDelByGovId(int govId , Pageable pageable);

}
