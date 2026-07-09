package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.model.Country;
import com.example.repository.CountryRepository;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }

    @Bean
    CommandLineRunner run(CountryRepository repository) {
        return args -> {

            repository.save(new Country("IN", "India"));
            repository.save(new Country("US", "United States"));

            System.out.println("Countries in Database:");

            repository.findAll()
                      .forEach(country ->
                          System.out.println(
                              country.getCode() + " - " +
                              country.getName()));
        };
    }
}