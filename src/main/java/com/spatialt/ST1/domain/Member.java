package com.spatialt.ST1.domain;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Table(name = "member") //  table 명
@Entity(name = "member")
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
