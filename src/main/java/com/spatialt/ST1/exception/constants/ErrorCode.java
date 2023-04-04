package com.spatialt.ST1.exception.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorCode {
    //400 BAD_REQUEST 잘못된 요청
    INVALID_PARAMETER(400, "파라미터 값을 확인해주세요."),

    //500 INTERNAL SERVER ERROR
    INTERNAL_SERVER_ERROR(500, "서버 에러입니다."),

    //404 NOT_FOUND 잘못된 리소스 접근
    NOT_FOUND(404, "존재하지 않는 주소입니다.");

    private final int status;

    private final String message;
}
