package com.spatialt.ST1.domain;

import com.spatialt.ST1.domain.base.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Menu extends BaseEntity {

    @Id @GeneratedValue
    @Column(name="menu_id")
    private Long id;

    private String menuNm;

    private int price;

    // 판매 상태 ON_SALE, STOPPED_SALE
    @Enumerated(EnumType.STRING)
    private SaleStatus saleStatus;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="restaurant_id")
    private Restaurant restaurant;

    /*
    * 메뉴 등록시 필요한것
    * 메뉴명, 가격, 판매상태, 가게정보, 등록자, 등록시간
    * */
    @Builder
    public Menu(String menuNm, int price, SaleStatus saleStatus, Restaurant restaurant){
        this.menuNm = menuNm;
        this.price = price;
        this.saleStatus = saleStatus;
        this.restaurant = restaurant;

    }


}
