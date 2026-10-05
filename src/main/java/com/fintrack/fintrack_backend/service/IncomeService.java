package com.fintrack.fintrack_backend.service;

import com.fintrack.fintrack_backend.model.Income;
import com.fintrack.fintrack_backend.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service // Spring चा मॅनेजर याला ओळखेल
public class IncomeService {

    @Autowired // डेटाबेस मॅनेजरला (Repository) ऑटोमॅटिक जोडणे
    private IncomeRepository incomeRepository;

    // 📥 १. नवीन उत्पन्न डेटाबेसमध्ये सेव्ह करण्याची पद्धत (POST साठी)
    public Income saveIncome(Income income) {
        return incomeRepository.save(income);
    }

    // 📤 २. सर्व उत्पन्नाची यादी डेटाबेसमधून शोधून आणण्याची पद्धत (GET साठी)
    public List<Income> getAllIncomes() {
        return incomeRepository.findAll();
    }
}
