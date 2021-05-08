package com.community.project.stocksuggestions.dao;

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

  public StockSuggestionEntity(String stockName, int weightAge) {
    this.stockName = stockName;
    this.weightAge = weightAge;
  }

  @PreUpdate
  @PrePersist
  public void updateTimeStamps() {
    lastModified = Instant.now();
  }

  //getter and setters

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getStockName() {
    return stockName;
  }

  public void setStockName(String stockName) {
    this.stockName = stockName;
  }

  public int getWeightAge() {
    return weightAge;
  }

  public void setWeightAge(int weightAge) {
    this.weightAge = weightAge;
  }
}
