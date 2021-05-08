package com.community.project.stocksuggestions.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StockSuggestionDTO {
  @JsonProperty("stock_name")
  public String stockName;

  @JsonProperty("weight_age")
  public int weightAge;

  public StockSuggestionDTO(String stockName, int weightAge) {
    this.stockName = stockName;
    this.weightAge = weightAge;
  }
}
