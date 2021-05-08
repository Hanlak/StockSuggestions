package com.community.project.stocksuggestions.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BuyStockSuggestionDTO extends StockSuggestionDTO {
  @JsonProperty("buy_range_from")
  public Float buyRangeFrom;

  @JsonProperty("buy_range_to")
  public Float buyRangeTo;

  public BuyStockSuggestionDTO(
      String stockName, int weightAge, Float buyRangeFrom, Float buyRangeTo) {
    super(stockName, weightAge);
    this.buyRangeFrom = buyRangeFrom;
    this.buyRangeTo = buyRangeTo;
  }
}
