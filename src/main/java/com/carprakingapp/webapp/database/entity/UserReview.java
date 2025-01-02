package com.carprakingapp.webapp.database.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users_reviews")
public class UserReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_review_id")
    private Integer userReviewId;

    //-----------------One User has many Reviews---------------------
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    @ToString.Exclude
    private User user;

    @Column(name = "user_id", insertable = false, updatable = false)
    private Integer userId;

    //---------------------------------------------------------------






    @Column(name = "users_reviews")
    private String userReviews;

    @Column(name = "users_review_rating")
    private Integer userReviewRating;

}
