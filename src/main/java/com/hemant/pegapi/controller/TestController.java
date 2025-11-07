package com.hemant.pegapi.controller;

import com.hemant.pegapi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/transfer")
    public String testTransaction() {
        accountService.transfer(1L, 2L, 100);
        return "Transfer done!";
    }
}
