package com.fintrack.fintrack_backend.controller;

import com.fintrack.fintrack_backend.model.Income;
import com.fintrack.fintrack_backend.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/incomes") // मुख्य पत्ता: http://localhost:8080/api/incomes
public class IncomeController {

    @Autowired
    private IncomeService incomeService; // Connecting to the Chef

    // 📥 १. नवीन उत्पन्न सेव्ह करण्याचे API (POST Request)
    @PostMapping
    public Income createIncome(@RequestBody Income income) {
        return incomeService.saveIncome(income);
    }

    // 📤 २. सर्व उत्पन्नाची यादी पाहण्याचे API (GET Request)
    @GetMapping
    public List<Income> getIncomes() {
        return incomeService.getAllIncomes();
    }
}
