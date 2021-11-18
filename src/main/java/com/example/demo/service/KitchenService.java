package com.example.demo.service;

import com.example.demo.domain.Dish;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class KitchenService {

    public Flux<Dish> getDishes() {
        /*
        *  250 밀리초 동안 데이터를  랜덤 발생하여 전달함
        * */
        return Flux.<Dish>generate(sink -> sink.next(randomDish())).delayElements(Duration.ofMillis(250));
    }

    private Dish randomDish() {
        return menu.get(picker.nextInt(menu.size()));
    }

    private List<Dish> menu = Arrays.asList(
            new Dish("Sesame chicken"),
            new Dish("Lo mein noodles, plain"),
            new Dish("Sweet * Sour beef"));

    private Random picker = new Random();

}
