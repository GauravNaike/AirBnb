package com.gaurav.project.airBnbApp.advice;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.List;

// User For through custom Exception
@Data
@Builder
public class ApiError {

    private String message;
    private HttpStatus statusCode;
    private List<String> subErrors;

}
