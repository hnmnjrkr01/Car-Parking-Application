package com.carprakingapp.webapp.database.dao;

import com.carprakingapp.webapp.database.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface BookingDAO extends JpaRepository<Booking, Long> {

    Booking findByBookingId(Integer bookingId);

    List<Booking> findByUserId(Integer userId);

    Booking findBylicensePlateNumber(String licensePlateNumber);

    Booking findByStartDateTime(LocalDateTime startDateTime);

    List<Booking> findByLevelId(Integer levelId);


//    List<Booking> findByBookingDateBetween(LocalDateTime startDateTime, LocalDateTime endDateTime);



}
