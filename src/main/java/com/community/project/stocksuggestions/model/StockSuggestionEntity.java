package com.community.project.stocksuggestions.model;

import javax.persistence.*;
import java.time.Instant;

import static javax.persistence.InheritanceType.SINGLE_TABLE;

@Entity
@Table(name = "Suggestion")
@Inheritance(strategy=SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING,
        name = "Type")
public class StockSuggestionEntity {
    @Id
    private long id;
    private String StockName;
    private Instant lastModified; // persisted upon persist & merge
}
