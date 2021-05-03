package com.community.project.stocksuggestions.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("BUY")
public class BuyStockSuggestionEntity extends StockSuggestionEntity {
  private Float buyRangeFrom;
  private Float buyRangeTo;

  public BuyStockSuggestionEntity(
      long id, String stockName, int weightAge, Float buyRangeFrom, Float buyRangeTo) {
    super(id, stockName, weightAge);
    this.buyRangeFrom = buyRangeFrom;
    this.buyRangeTo = buyRangeTo;
  }
}
