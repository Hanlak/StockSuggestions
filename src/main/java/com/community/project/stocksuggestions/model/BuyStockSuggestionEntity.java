package com.community.project.stocksuggestions.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.Instant;

@Entity
@DiscriminatorValue("BUY")
public class BuyStockSuggestionEntity extends StockSuggestionEntity {
    private Float buyRangeFrom;
    private Float buyRangeTo;

    public BuyStockSuggestionEntity(long id, String stockName, Instant lastModified, Float buyRangeFrom, Float buyRangeTo) {
        super(id, stockName, lastModified);
        this.buyRangeFrom = buyRangeFrom;
        this.buyRangeTo = buyRangeTo;
    }
}
