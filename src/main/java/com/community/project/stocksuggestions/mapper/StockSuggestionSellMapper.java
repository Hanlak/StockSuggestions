package com.community.project.stocksuggestions.mapper;

import com.community.project.stocksuggestions.dao.SellStockSuggestionEntity;
import com.community.project.stocksuggestions.dto.SellStockSuggestionDTO;

public class StockSuggestionSellMapper {
  public SellStockSuggestionEntity fromDto(SellStockSuggestionDTO sellStockSuggestionDTO) {
    return new SellStockSuggestionEntity(
        sellStockSuggestionDTO.stockName,
        sellStockSuggestionDTO.weightAge,
        sellStockSuggestionDTO.sellRangeFrom,
        sellStockSuggestionDTO.sellRangeTo);
  }

  public SellStockSuggestionDTO toDto(SellStockSuggestionEntity sellStockSuggestionEntity) {
    return new SellStockSuggestionDTO(
        sellStockSuggestionEntity.getStockName(),
        sellStockSuggestionEntity.getWeightAge(),
        sellStockSuggestionEntity.getSellRangeFrom(),
        sellStockSuggestionEntity.getSellRangeTo());
  }
}
