package com.gaurav.project.airBnbApp.controller;

import com.gaurav.project.airBnbApp.dto.BookingDto;
import com.gaurav.project.airBnbApp.dto.ProfileUpdateRequestDto;
import com.gaurav.project.airBnbApp.dto.UserDto;
import com.gaurav.project.airBnbApp.service.BookingService;
import com.gaurav.project.airBnbApp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final BookingService bookingService;
    private final UserService userService;

    @PatchMapping("/profile")
    public ResponseEntity<Void> updateProfile(@RequestBody ProfileUpdateRequestDto profileUpdateRequestDto) {
        userService.updateProfile(profileUpdateRequestDto);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/myBookings")
    public ResponseEntity<List<BookingDto>> getMyBookings() {
        return ResponseEntity.ok(bookingService.getMyBookings());
    }

    @GetMapping("/profile")
    public ResponseEntity<UserDto> getMyProfile() {
        return ResponseEntity.ok(userService.getMyProfile());
    }
}
