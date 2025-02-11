package com.tigana.EduManage.Repo;

import com.tigana.EduManage.Models.TransferredStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferredStudentRepo extends JpaRepository<TransferredStudent,Integer> {
}
