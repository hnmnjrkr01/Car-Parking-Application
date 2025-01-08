package com.carprakingapp.webapp.formBean;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@ToString
public class UserDTO {

    @Pattern(regexp="^[A-z 0-9]$")
    @NotEmpty(message = "Username must be provided.")
    private String username;


    @Length(min=8, message = "Password minimum length is 8 characters.")
    @Length(max=30, message = "Password minimum length is 8 characters.")
    @NotEmpty(message = "Password must be provided.")
    private String password;

    @NotEmpty(message = "Firstname must be provided.")
    private String firstname;

    @NotEmpty(message = "Lastname must be provided.")
    private String lastname;

    @Email(message = "Provide correct email.")
    @NotEmpty(message = "Email must be provided.")
    private String email;

    @NotEmpty(message = "Phone number must be provided.")
    private Long phone;
}
