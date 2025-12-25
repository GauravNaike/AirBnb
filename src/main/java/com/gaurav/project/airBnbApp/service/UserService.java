package com.gaurav.project.airBnbApp.service;

import com.gaurav.project.airBnbApp.dto.ProfileUpdateRequestDto;
import com.gaurav.project.airBnbApp.dto.UserDto;
import com.gaurav.project.airBnbApp.entity.User;

public interface UserService {

    User getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();
}
