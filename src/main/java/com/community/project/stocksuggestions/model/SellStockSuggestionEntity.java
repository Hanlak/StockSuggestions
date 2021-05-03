package com.community.project.stocksuggestions.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SELL")
public class SellStockSuggestionEntity extends StockSuggestionEntity {
  private Float sellRangeFrom;
  private Float sellRangeTo;

  public SellStockSuggestionEntity(
      long id, String stockName, int weightAge, Float sellRangeFrom, Float sellRangeTo) {
    super(id, stockName, weightAge);
    this.sellRangeFrom = sellRangeFrom;
    this.sellRangeTo = sellRangeTo;
  }
}
