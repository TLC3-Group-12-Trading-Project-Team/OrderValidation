package com.example.orderValidation.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MarketData {

    @JsonProperty(value = "LAST_TRADED_PRICE")
    private double lastTradedPrice;
    @JsonProperty(value = "BID_PRICE")
    private double bidPrice;
    @JsonProperty(value = "SELL_LIMIT")
    private int sellLimit;
    @JsonProperty(value = "MAX_PRICE_SHIFT")
    private double maxPriceShift;
    @JsonProperty(value = "TICKER")
    private String ticker;
    @JsonProperty(value = "ASK_PRICE")
    private double askPrice;
    @JsonProperty(value = "BUY_LIMIT")
    private int buyLimit;

    public MarketData() {}

    public MarketData(final double lastTradedPrice, final double bidPrice, final int sellLimit, final double maxPriceShift, final String ticker,
                      final double askPrice, final int buyLimit) {
        this.lastTradedPrice = lastTradedPrice;
        this.bidPrice = bidPrice;
        this.sellLimit = sellLimit;
        this.maxPriceShift = maxPriceShift;
        this.ticker = ticker;
        this.askPrice = askPrice;
        this.buyLimit = buyLimit;
    }

    public double getLastTradedPrice() {
        return lastTradedPrice;
    }

    public double getBidPrice() {
        return bidPrice;
    }

    public int getSellLimit() {
        return sellLimit;
    }

    public double getMaxPriceShift() {
        return maxPriceShift;
    }

    public String getTicker() {
        return ticker;
    }

    public double getAskPrice() {
        return askPrice;
    }

    public int getBuyLimit() {
        return buyLimit;
    }

    @Override
    public String toString() {
        return "MarketData {askPrice=" + askPrice + ", bidPrice=" + bidPrice + ", buyLimit=" + buyLimit
                + ", lastTradedPrice=" + lastTradedPrice + ", maxPriceShift=" + maxPriceShift + ", sellLimit=" + sellLimit
                + ", ticker=" + ticker + "}";
    }

    public void setLastTradedPrice(double lastTradedPrice) {
        this.lastTradedPrice = lastTradedPrice;
    }

    public void setBidPrice(double bidPrice) {
        this.bidPrice = bidPrice;
    }

    public void setSellLimit(int sellLimit) {
        this.sellLimit = sellLimit;
    }

    public void setMaxPriceShift(double maxPriceShift) {
        this.maxPriceShift = maxPriceShift;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public void setAskPrice(double askPrice) {
        this.askPrice = askPrice;
    }

    public void setBuyLimit(int buyLimit) {
        this.buyLimit = buyLimit;
    }
}
