//package com.hemant.pegapi.service;
//
//import com.hemant.pegapi.entity.Account;
//import com.hemant.pegapi.repository.AccountRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DataLoader implements CommandLineRunner {
//    @Autowired
//    private AccountRepository repo;
//
//    @Override
//    public void run(String... args) {
//        Account a1 = new Account();
//        a1.setName("Hemant");
//        a1.setBalance(1000);
//
//        Account a2 = new Account();
//        a2.setName("Amit");
//        a2.setBalance(1000);
//
//        repo.save(a1);
//        repo.save(a2);
//    }
//}
//
