package com.example.demo.reactive;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;

@Component
public class TemplateDatabaseLoader {

    @Bean
    CommandLineRunner initialize(MongoOperations mongo) {
        return args -> {
            System.out.println(" [Debug] Initialized");
            mongo.save(new Item("Alf alaram clock", 19.99));
            mongo.save(new Item("Smurf TV tray", 24.99));
            System.out.println(" [Debug] End");
        };
    }
}
