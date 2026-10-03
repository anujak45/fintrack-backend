package com.fintrack.fintrack_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class Income {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;              // उत्पन्नाचा आयडी

    private String source;        // पैशांचा सोर्स (उदा. Salary, Freelance)
    private Double amount;        // किती पैसे आले
    private LocalDate date;       // आलेली तारीख
    private String description;   // इतर माहिती
}
