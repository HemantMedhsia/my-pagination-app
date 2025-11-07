package com.hemant.pegapi.service;

import com.hemant.pegapi.entity.Account;
import com.hemant.pegapi.repository.AccountRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Transactional
    public void transfer(Long fromId, Long toId, double amount) {
        Account from = accountRepository.findById(fromId).orElseThrow();
        Account to = accountRepository.findById(toId).orElseThrow();

        from.setBalance(from.getBalance() - amount);
        accountRepository.save(from);

//        if (true) {
//            throw new RuntimeException("Something went wrong!");
//        }

        to.setBalance(to.getBalance() + amount);
        accountRepository.save(to);
    }
}
