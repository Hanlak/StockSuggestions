package com.community.project.stocksuggestions.model;

import javax.persistence.*;
import java.time.Instant;

import static javax.persistence.InheritanceType.SINGLE_TABLE;

@Entity
@Table(name = "Suggestion")
@Inheritance(strategy = SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name = "Type")
public class StockSuggestionEntity {
  @Id private long id;
  private String stockName;
  private int weightAge;
  private Instant lastModified; // persisted upon persist & merge

  public StockSuggestionEntity(long id, String stockName, int weightAge) {
    this.id = id;
    this.stockName = stockName;
    this.weightAge = weightAge;
  }

  @PreUpdate
  @PrePersist
  public void updateTimeStamps() {
    lastModified = Instant.now();
  }
}
