package com.fintrack.fintrack_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import java.time.LocalDate;

@Entity // १. हा क्लास डेटाबेसमध्ये टेबल बनवेल
@Data   // २. Lombok जादू! Getter, Setter आपोआप तयार होतील
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;              // खर्चाचा आयडी (Auto-increment)

    private String title;         // खर्चाचे नाव (उदा. चहा, रूम रेंट)
    private Double amount;        // किती पैसे खर्च झाले (उदा. ५००.०)
    private String category;      // कॅटेगरी (उदा. Food, Bills)
    private LocalDate date;       // खर्चाची तारीख
    private String description;   // इतर माहिती
}
