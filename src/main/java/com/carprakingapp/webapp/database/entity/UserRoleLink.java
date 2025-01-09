package com.carprakingapp.webapp.database.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;


@Data
@NoArgsConstructor
@ToString
@Entity
@Table(name="user_role_link")
public class UserRoleLink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_role_link_id")
    private Integer userRoleLinkId;


    //-----------One User-Role can have Many UserRoleLink-------------

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_role_id", nullable = false)
    private UserRole userRole;

    @Column(name = "user_role_id", insertable = false, updatable = false)
    private Integer userRoleId;

    //---------------------------------------------------------------

    //--------------------One User can have Many UserRoleLinks---------

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "user_id", insertable = false, updatable = false)
    private Integer userId;

    //------------------------------------------------------------






}
