package com.community.project.stocksuggestions.model;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SELL")
public class SellStockSuggestionEntity extends StockSuggestionEntity {
    private Float SellRangeFrom;
    private Float SellRangeTo;
}
