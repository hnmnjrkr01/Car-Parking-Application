package com.carprakingapp.webapp.formBean;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserDTO {

    private String username;

    private String password;

    private String firstname;

    private String lastname;

    private String email;

    private Long phone;
}
