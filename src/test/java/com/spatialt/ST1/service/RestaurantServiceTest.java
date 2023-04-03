package com.spatialt.ST1.service;

import com.spatialt.ST1.domain.Menu;
import com.spatialt.ST1.domain.Restaurant;
import com.spatialt.ST1.domain.SaleStatus;
import com.spatialt.ST1.repository.MenuRepository;
import com.spatialt.ST1.repository.RestaurantRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
@Transactional(readOnly = true)
class RestauratServiceTest {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Autowired
    private MenuRepository menuRepository;


    @Test
    @DisplayName("음식점추가")
    @Transactional
    @Rollback(value = false)
    public void 음식점추가() throws Exception
    {
        List<DayOfWeek> list = new ArrayList<>();
        list.add(DayOfWeek.MONDAY);
        list.add(DayOfWeek.FRIDAY);
        list.add(DayOfWeek.THURSDAY);

        Restaurant r = Restaurant.builder()
                .restaurantNm("레스토랑1")
                .holidays(list)
                .build();

        Restaurant save = restaurantRepository.save(r);

        System.out.println("save = " + save.getId());

    }

    @Test
    @DisplayName("메뉴추가")
    @Transactional
    @Rollback(value = false)
    public void 메뉴추가() throws Exception
    {
        Restaurant r = restaurantRepository.findById(1L)
                .orElseThrow(() -> new EntityNotFoundException("존재하지 않는 음식점"));


        Menu m = Menu.builder()
                .menuNm("치킨")
                .price(18000)
                .saleStatus(SaleStatus.ON_SALE)
                .restaurant(r)
                .build();

        menuRepository.save(m);

    }


    @Test
    @DisplayName("음식점 메뉴 리스트 가져오기")
    public void 음식점_메뉴_리스트_가져오기() throws Exception
    {

        Restaurant r = restaurantRepository.findById(1L)
                .orElseThrow(() -> new EntityNotFoundException("존재하지 않는 음식점"));

        List<Menu> menus = r.getMenus();

        for (Menu menu : menus) {
            System.out.println(menu.getMenuNm() + " " + menu.getPrice());
        }

    }

}