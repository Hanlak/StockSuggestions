package com.community.project.stocksuggestions.model;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

import static javax.persistence.InheritanceType.SINGLE_TABLE;

@Entity
@Table(name = "Suggestion")
@Inheritance(strategy=SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING,
        name = "Type")
public class StockSuggestionEntity {
    @Id
    private long id;
    private String stockName;
    private Instant lastModified; // persisted upon persist & merge

    public StockSuggestionEntity(long id, String stockName, Instant lastModified) {
        this.id = id;
        this.stockName = stockName;
        this.lastModified = lastModified;
    }
        @PreUpdate
        @PrePersist
        public void updateTimeStamps() {
            lastModified = Instant.now();
    }
}
