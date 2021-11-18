package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Mono;

@Controller
public class HomeController {

    @GetMapping("/")
    Mono<String> home() {
        /*
        *  Mono는 0 또는 1개의 원소만 담을 수 있는 리액티브 Publisher(발행자)
        *  - 하나의 원소만 비동기적으로 반환하는 경우 사용
        * */
        return Mono.just("home.html");
    }

}
