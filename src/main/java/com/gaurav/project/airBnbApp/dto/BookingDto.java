package com.gaurav.project.airBnbApp.dto;

import com.gaurav.project.airBnbApp.entity.Guest;
import com.gaurav.project.airBnbApp.entity.Hotel;
import com.gaurav.project.airBnbApp.entity.Room;
import com.gaurav.project.airBnbApp.entity.User;
import com.gaurav.project.airBnbApp.entity.enums.BookingStatus;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Data
public class BookingDto {

    private Long id;
    private Integer roomsCount;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private LocalDateTime createAt;
    private LocalDateTime updatedAt;
    private BookingStatus bookingStatus;
    private Set<GuestDto> guests;
    private BigDecimal amount;
}
