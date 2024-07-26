package com.montezumadev.airbnbcloneback.booking.repository;

import com.montezumadev.airbnbcloneback.booking.domain.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
