package com.carprakingapp.webapp.database.dao;

import com.carprakingapp.webapp.database.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRolesDAO extends JpaRepository<UserRole, Integer> {


}
