package com.carprakingapp.webapp.formBean;


import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class UserReviewDTO {

    private Integer userId;

    private String userReviews;

    private String userReviewRating;
}
