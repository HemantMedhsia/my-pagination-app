package com.hemant.pegapi.repository;

import com.hemant.pegapi.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    // findAll(Pageable pageable) is already provided by JpaRepository
}
