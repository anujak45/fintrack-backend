package com.fintrack.fintrack_backend.repository;

import com.fintrack.fintrack_backend.model.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeRepository extends JpaRepository<Income, Long> {
    // हा इंटरफेस इन्कमचा डेटा सेव्ह आणि फेट करायला मदत करेल
}
