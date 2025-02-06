package com.tigana.EduManage.Repo;

import com.tigana.EduManage.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo  extends JpaRepository<User, Long> {
}
