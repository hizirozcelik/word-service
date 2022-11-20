package com.ozcelik.springboot.wordservice;

import com.ozcelik.springboot.wordservice.repository.WordRepository;
import com.ozcelik.springboot.wordservice.service.JsonPlaceholderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class WordServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WordServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(JsonPlaceholderService jsonPlaceholderService, WordRepository db) {
        return args -> {
                db.saveAll(jsonPlaceholderService.getWords());
        };
    }

}
