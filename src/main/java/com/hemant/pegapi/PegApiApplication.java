package com.hemant.pegapi;

import com.hemant.pegapi.entity.Expense;
import com.hemant.pegapi.service.ExpenseService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Random;

@SpringBootApplication
public class PegApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PegApiApplication.class, args);
    }

}
