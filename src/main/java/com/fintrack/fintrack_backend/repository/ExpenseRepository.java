package com.fintrack.fintrack_backend.repository;

import com.fintrack.fintrack_backend.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // १. Spring ला सांगणे की हा डेटाबेसशी बोलणारा मॅनेजर आहे
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    // JpaRepository<Expense, Long> चा अर्थ: आपण Expense टेबलसोबत बोलत आहोत आणि त्याचा Primary Key 'Long' (ID) आहे.
}
