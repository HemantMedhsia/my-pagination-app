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

    @Bean
    CommandLineRunner runner(ExpenseService service) {
        return args -> {
            String[] categories = {"Food","Travel","Health","Shopping","Bills"};
            Random rnd = new Random();

            for (int i = 1; i <= 1000; i++) {
                Expense e = Expense.builder()
                        .title("Expense " + i)
                        .amount(Math.round(rnd.nextDouble() * 10000.0) / 100.0) // upto 2 decimal
                        .category(categories[rnd.nextInt(categories.length)])
                        .build();
                service.save(e);
            }
            System.out.println("✅ Inserted 1000 dummy expenses");
        };
    }

}
