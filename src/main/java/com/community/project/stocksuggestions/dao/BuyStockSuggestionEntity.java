package com.community.project.stocksuggestions.dao;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("BUY")
public class BuyStockSuggestionEntity extends StockSuggestionEntity {
  private Float buyRangeFrom;
  private Float buyRangeTo;

  public BuyStockSuggestionEntity(
      String stockName, int weightAge, Float buyRangeFrom, Float buyRangeTo) {
    super(stockName, weightAge);
    this.buyRangeFrom = buyRangeFrom;
    this.buyRangeTo = buyRangeTo;
  }
  //getters and setters


  public Float getBuyRangeFrom() {
    return buyRangeFrom;
  }

  public void setBuyRangeFrom(Float buyRangeFrom) {
    this.buyRangeFrom = buyRangeFrom;
  }

  public Float getBuyRangeTo() {
    return buyRangeTo;
  }

  public void setBuyRangeTo(Float buyRangeTo) {
    this.buyRangeTo = buyRangeTo;
  }
}
