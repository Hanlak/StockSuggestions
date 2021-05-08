package com.community.project.stocksuggestions.mapper;

import com.community.project.stocksuggestions.dao.BuyStockSuggestionEntity;
import com.community.project.stocksuggestions.dto.BuyStockSuggestionDTO;

public class StockSuggestionBuyMapper {

  public BuyStockSuggestionEntity fromDto(BuyStockSuggestionDTO buyStockSuggestionDTO) {
    return new BuyStockSuggestionEntity(
        buyStockSuggestionDTO.stockName,
        buyStockSuggestionDTO.weightAge,
        buyStockSuggestionDTO.buyRangeFrom,
        buyStockSuggestionDTO.buyRangeTo);
  }

  public BuyStockSuggestionDTO toDto(BuyStockSuggestionEntity buyStockSuggestionEntity) {
    return new BuyStockSuggestionDTO(
        buyStockSuggestionEntity.getStockName(),
        buyStockSuggestionEntity.getWeightAge(),
        buyStockSuggestionEntity.getBuyRangeFrom(),
        buyStockSuggestionEntity.getBuyRangeTo());
  }
}
