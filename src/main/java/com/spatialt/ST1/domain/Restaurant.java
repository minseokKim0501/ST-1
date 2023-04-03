package com.spatialt.ST1.domain;

import com.spatialt.ST1.domain.base.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Restaurant extends BaseEntity {

    @Id @GeneratedValue
    @Column(name="restaurant_id")
    private Long id;

    private String restaurantNm;

    //가게 휴일 ( ex 월, 목 2일 이상인경우 )?
    private List<DayOfWeek> holidays;

    // 브레이크 타임 (시작 / 종료 시간)
    // private LocalDateTime breakStTime;
    // private LocalDateTime breakEdTime;

    @OneToMany(mappedBy = "restaurant")
    private List<Menu> menus = new ArrayList<>();


    /*
    * 엔티티를 생성시 빌더 패턴 사용
    * 가게 등록시 필요한것?
    * 가게 먼저 생성 후 음식 등록?
    * 가게명 , 가게휴무일 , 브레이크타임(시작, 종료), 등록자, 등록시간
    * */
    @Builder
    public Restaurant(String restaurantNm, List<DayOfWeek> holidays) {
        this.restaurantNm = restaurantNm;
        this.holidays = holidays;
       }
}
