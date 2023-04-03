package com.spatialt.ST1.exception.handler;

import com.spatialt.ST1.exception.constants.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CustomException extends RuntimeException {

    private final ErrorCode errorCode;
}