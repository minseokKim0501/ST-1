package com.spatialt.ST1.exception.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ErrorDto {
    private int status;
    private String message;

}
