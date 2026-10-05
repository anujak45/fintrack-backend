package com.fintrack.fintrack_backend.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.util.Date;

@Entity // १. हा क्लास डेटाबेसमध्ये टेबल बनवेल
@Data   // २. Lombok जादू! Getter, Setter आपोआप तयार होतील
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;              // खर्चाचा आयडी (Auto-increment)

    @Column(length = 100, nullable = false)
    private String title;         // खर्चाचे नाव (उदा. चहा, रूम रेंट)
    private Double amount;        // किती पैसे खर्च झाले (उदा. ५००.०)

    @Column(name = "category", length = 500)
    private String category;      // कॅटेगरी (उदा. Food, Bills)
    private Date date;       // खर्चाची तारीख
    private String description;   // इतर माहिती
}
