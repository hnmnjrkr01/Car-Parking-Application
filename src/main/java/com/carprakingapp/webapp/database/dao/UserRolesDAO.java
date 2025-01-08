package com.carprakingapp.webapp.database.dao;

import com.carprakingapp.webapp.database.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRolesDAO extends JpaRepository<UserRole, Long> {


    List<UserRole> findByUserRoleId(Integer userRoleId);

}
