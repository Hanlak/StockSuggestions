package com.community.project.stocksuggestions.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SellStockSuggestionDTO extends StockSuggestionDTO {
  @JsonProperty("sell_range_from")
  public Float sellRangeFrom;

  @JsonProperty("sell_range_to")
  public Float sellRangeTo;

  public SellStockSuggestionDTO(
      String stockName, int weightAge, Float sellRangeFrom, Float sellRangeTo) {
    super(stockName, weightAge);
    this.sellRangeFrom = sellRangeFrom;
    this.sellRangeTo = sellRangeTo;
  }
}
