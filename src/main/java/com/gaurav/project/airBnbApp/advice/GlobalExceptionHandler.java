package com.gaurav.project.airBnbApp.advice;

import com.gaurav.project.airBnbApp.exception.ResourceNotFoundException;
import io.jsonwebtoken.JwtException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.security.access.AccessDeniedException;

//1. Let Create the Object for the ApiError
//2. then We can convert this to a ResponseEntity
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse<?>> handleResourceNotFound(ResourceNotFoundException exception){
         ApiError apiError = ApiError.builder()
                 .statusCode(HttpStatus.NOT_FOUND)
                 .message(exception.getMessage())
                 .build();
         return builderResponseEntity(apiError);
    }

    @ExceptionHandler(AuthenticationException.class)
    public ResponseEntity<ApiResponse<?>> handleAuthenticationException(AuthenticationException exception) {
        ApiError apiError = ApiError.builder()
                .statusCode(HttpStatus.UNAUTHORIZED)
                .message(exception.getMessage())
                .build();
        return builderResponseEntity(apiError);
    }

    @ExceptionHandler(JwtException.class)
    public ResponseEntity<ApiResponse<?>> handleJwtException(JwtException ex) {
        ApiError apiError = ApiError.builder()
                .statusCode(HttpStatus.UNAUTHORIZED)
                .message(ex.getMessage())
                .build();
        return builderResponseEntity(apiError);
    }

    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<ApiResponse<?>> handleAccessDeniedException(AccessDeniedException ex) {
        ApiError apiError = ApiError.builder()
                .statusCode(HttpStatus.FORBIDDEN)
                .message(ex.getMessage())
                .build();
        return builderResponseEntity(apiError);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse<?>> handleInternalServer(Exception exception){
        ApiError apiError = ApiError.builder()
                .statusCode(HttpStatus.INTERNAL_SERVER_ERROR)
                .message(exception.getMessage())
                .build();
        return builderResponseEntity(apiError);
    }

    public ResponseEntity<ApiResponse<?>> builderResponseEntity(ApiError apiError) {
        return new ResponseEntity<>(new ApiResponse<>(apiError), apiError.getStatusCode());
    }

}
