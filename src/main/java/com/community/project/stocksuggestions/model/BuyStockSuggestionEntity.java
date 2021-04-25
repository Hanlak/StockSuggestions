package com.community.project.stocksuggestions.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("BUY")
public class BuyStockSuggestionEntity extends StockSuggestionEntity {
    private Float BuyRangeFrom;
    private Float BuyRangeTo;
}
