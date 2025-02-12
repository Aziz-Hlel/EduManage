package com.tigana.EduManage.Repo;

import com.tigana.EduManage.Models.Gov;
import com.tigana.EduManage.Models.School;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GovRepo extends JpaRepository<Gov, Integer> {


}
