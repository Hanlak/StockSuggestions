package com.community.project.stocksuggestions.dao;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SELL")
public class SellStockSuggestionEntity extends StockSuggestionEntity {
  private Float sellRangeFrom;
  private Float sellRangeTo;

  public SellStockSuggestionEntity(
      String stockName, int weightAge, Float sellRangeFrom, Float sellRangeTo) {
    super(stockName, weightAge);
    this.sellRangeFrom = sellRangeFrom;
    this.sellRangeTo = sellRangeTo;
  }
  //getter nd setters

  public Float getSellRangeFrom() {
    return sellRangeFrom;
  }

  public void setSellRangeFrom(Float sellRangeFrom) {
    this.sellRangeFrom = sellRangeFrom;
  }

  public Float getSellRangeTo() {
    return sellRangeTo;
  }

  public void setSellRangeTo(Float sellRangeTo) {
    this.sellRangeTo = sellRangeTo;
  }
}
