package com.community.project.stocksuggestions.model;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.Instant;

@Entity
@DiscriminatorValue("SELL")
public class SellStockSuggestionEntity extends StockSuggestionEntity {
    private Float sellRangeFrom;
    private Float sellRangeTo;

    public SellStockSuggestionEntity(long id, String stockName, Instant lastModified, Float sellRangeFrom, Float sellRangeTo) {
        super(id, stockName, lastModified);
        this.sellRangeFrom = sellRangeFrom;
        this.sellRangeTo = sellRangeTo;
    }
}
