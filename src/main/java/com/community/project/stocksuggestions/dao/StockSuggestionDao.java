package com.community.project.stocksuggestions.dao;

import com.community.project.stocksuggestions.model.StockSuggestionEntity;
import org.springframework.stereotype.Repository;

@Repository
public class StockSuggestionDao extends GenericDao<StockSuggestionEntity, Long> {
  protected StockSuggestionDao(Class<StockSuggestionEntity> clazz) {
    super(clazz);
  }
}
