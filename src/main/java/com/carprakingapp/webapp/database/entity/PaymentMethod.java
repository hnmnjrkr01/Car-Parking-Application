package com.carprakingapp.webapp.database.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="payment_method")
public class PaymentMethod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="payment_id")
    private Integer paymentId;

    //------------------One User has many payment methods---------

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    @ToString.Exclude
    private User user;

    @Column(name="user_id", insertable = false, updatable = false)
    private Integer userId;

    //------------------------------------------------------------


    //---------One Payment-Method can have Many Bookings-----------

    @OneToMany(mappedBy = "paymentMethod", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Booking> bookings;

    //-------------------------------------------------------------

    @Column(name="payment_method")
    private Character paymentMethod;

    @Column(name="date_of_payment")
    private LocalDateTime dateOfPayment;


}
