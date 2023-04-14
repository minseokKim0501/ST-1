package com.spatialt.ST1.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/test")
    public ResponseEntity<?> testMethod() {
        throw new MyException("Test Exception");
    }
}
