package com.gaurav.project.airBnbApp.dto;

import com.gaurav.project.airBnbApp.entity.User;
import com.gaurav.project.airBnbApp.entity.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;

@Data
public class GuestDto {

    private Long id;
    private User user;
    private String name;
    private Gender gender;
    private Integer age;
}
