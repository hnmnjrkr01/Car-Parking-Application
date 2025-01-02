package com.carprakingapp.webapp.formBean;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class BookingDTO {

    private Integer userId;

    private Integer levelId;

    private Double totalPrice;

    private LocalDateTime startDateTime;

    private LocalDateTime endDateTime;

    private Integer duration;

    private String licensePlateNumber;
}
