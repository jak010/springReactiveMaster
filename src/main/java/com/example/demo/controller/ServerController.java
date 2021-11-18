package com.example.demo.controller;

import com.example.demo.domain.Dish;
import com.example.demo.service.KitchenService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class ServerController {

    private final KitchenService kitchen;

    public ServerController(KitchenService kitchen) {
        this.kitchen = kitchen;
    }

    @GetMapping(value = "/server", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
        /*
         *  Flux<T> 는 Publisher 와 Consumer 사이에 demand control(수요저절)에 기반함
         * */
    Flux<Dish> serveDishes() {
        return this.kitchen.getDishes();
    }


    /*  58 page */
    @GetMapping(value = "/served-dishes", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    Flux<Dish> deliverDishes() {
        /* delivered 의 상태를 바꾼 값들을 Response 한다는 점에서 /server 랑 다름
         *  - 상태를 바꾼 것처럼 다른 변환도 가능하다는 점
         *  */
        return this.kitchen.getDishes().map(dish -> Dish.deliver(dish));
    }

}
