//package com.example.demo.reactive;
//
//import org.springframework.data.repository.reactive.ReactiveCrudRepository;
//
//// tag::code[]
//public interface ItemRepository extends ReactiveCrudRepository<Item, String> {
//    /*
//     *  Spring Data Commons 에 포함된 ReactiveCrudRepository를 상속 받음
//     *   - 첫 번째 파라미터는 Item 이며 이는 ItemRepository가 item을 저장하고 조회하는 역할을 맡음
//     *   - 두 번쨰 파라미터는 저장되는 데이터의 식별자의 타입이 String이라는 의미이다.
//     *  ReactiveCrudRepository 로 부터 상속 받는 메소드
//     *   - save(), saveAll()
//     *   - findById(), findAll(), findAllById()
//     *   - existById()
//     *   - count()
//     *   - deleteById(), delete(), deleteAll()
//     *   실제 구현 코드를 작성하지 않아도 메소드를 사용할 수 있음
//     *   모든 메소드의 반환 타입은 Flux 나 Mono 임
//     * */
//
//}
//// end::code[]