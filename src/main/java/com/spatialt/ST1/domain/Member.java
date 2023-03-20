package com.spatialt.ST1.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Member {

    @Id // 기본 키 매핑
    @GeneratedValue(strategy = GenerationType.AUTO) // 자동증가
    private long idx;
    private String id;
    private String password;
    private Date regDate;
    private String name;


}
