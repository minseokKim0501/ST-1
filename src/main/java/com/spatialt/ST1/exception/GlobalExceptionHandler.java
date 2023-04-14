package com.spatialt.ST1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExceptionHandler {
    @ExceptionHandler(MyException.class)
    public ResponseEntity<MyErrorResponse> handleMyException(MyException ex){
        MyErrorResponse response = new MyErrorResponse(ex.getMessage(), HttpStatus.BAD_REQUEST);
        return ResponseEntity.badRequest().body(response);
    }

    @ExceptionHandler(MyException.class)
    public ResponseEntity<MyErrorResponse> handleException(Exception ex){
        MyErrorResponse response = new MyErrorResponse(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        return ResponseEntity.badRequest().body(response);
    }
}
