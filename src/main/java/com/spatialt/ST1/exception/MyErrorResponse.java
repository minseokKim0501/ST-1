package com.spatialt.ST1.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Getter
public class MyErrorResponse {
    private String message;
    private HttpStatus status;
    private LocalDateTime timestamp;

    public MyErrorResponse(String message, HttpStatus status){
        this.message = message;
        this.status = status;
        this.timestamp = LocalDateTime.now();
    }
}
