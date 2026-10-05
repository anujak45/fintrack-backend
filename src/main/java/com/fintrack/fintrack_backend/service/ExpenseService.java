package com.fintrack.fintrack_backend.service;

import com.fintrack.fintrack_backend.model.Expense;
import com.fintrack.fintrack_backend.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service // Tells Spring Boot that this is the Chef (Business Logic Layer)
public class ExpenseService {

    @Autowired // Automatically connects the Database Manager (Repository Layer)
    private ExpenseRepository expenseRepository;

    // 📥 Method to save a new expense into the database
    public Expense saveExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    // 📤 Method to fetch all expenses from the database
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }
}
