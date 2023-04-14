package com.spatialt.ST1.exception;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class MyControllerTest {

    @Test
    ResponseEntity<?> testMethod() {
        log.warn("예외 경로 확인");
        throw new MyException("Test Exception");
        }
    }