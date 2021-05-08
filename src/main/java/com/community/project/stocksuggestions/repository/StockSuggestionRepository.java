package com.community.project.stocksuggestions.repository;

import com.community.project.stocksuggestions.dao.StockSuggestionEntity;
import org.springframework.stereotype.Repository;

@Repository
public class StockSuggestionRepository extends GenericRepository<StockSuggestionEntity, Long> {
  protected StockSuggestionRepository(Class<StockSuggestionEntity> clazz) {
    super(clazz);
  }
}
