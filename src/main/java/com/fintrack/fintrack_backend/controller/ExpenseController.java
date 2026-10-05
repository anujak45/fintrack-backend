package com.fintrack.fintrack_backend.controller;

import com.fintrack.fintrack_backend.model.Expense;
import com.fintrack.fintrack_backend.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/expenses") // Base URL Path: http://localhost:8080/api/expenses
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService; // Connecting to the Chef (Service Layer)

    // 📥 1. API to save a new expense into the database (POST Request)
    @PostMapping
    public Expense createExpense(@RequestBody Expense expense) {
        return expenseService.saveExpense(expense);
    }

    // 📤 2. API to fetch all expenses from the database (GET Request)
    @GetMapping
    public List<Expense> getExpenses() {
        return expenseService.getAllExpenses();
    }
}
