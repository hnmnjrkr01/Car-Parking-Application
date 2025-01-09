package com.carprakingapp.webapp.database.dao;

import com.carprakingapp.webapp.database.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserRolesDAO extends JpaRepository<UserRole, Long> {



    List<UserRole> findByUserRoleId(Integer userRoleId);

    @Query(value = "select ur.user_role_id, ur.role_code,u.id\n" +
            "from user_roles ur, user_role_link url, users u\n" +
            "where ur.user_role_id=url.user_role_id\n" +
            "and url.user_id = u.id;" , nativeQuery = true)
    List<UserRole> findUserRoleCodeByUserId(Integer userId);

}
