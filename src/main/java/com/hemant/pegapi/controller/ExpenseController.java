package com.hemant.pegapi.controller;

import com.hemant.pegapi.entity.Expense;
import com.hemant.pegapi.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService service;

    @GetMapping
    public ResponseEntity<Map<String, Object>> listExpenses(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDir) {

        Page<Expense> expensesPage = service.getExpenses(page, size, sortBy, sortDir);

        Map<String, Object> response = new HashMap<>();
        response.put("data", expensesPage.getContent());
        response.put("currentPage", expensesPage.getNumber());
        response.put("pageSize", expensesPage.getSize());
        response.put("totalItems", expensesPage.getTotalElements());
        response.put("totalPages", expensesPage.getTotalPages());
        response.put("sortBy", sortBy);
        response.put("sortDir", sortDir);

        return ResponseEntity.ok(response);
    }
}
