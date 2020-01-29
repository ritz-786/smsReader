package com.binarybeasts.smsreader.Models;

public class OrderRequest {
    String from,ProductPrice,DeliverPrice,Amount,status,key;

    public OrderRequest() {
    }

    public OrderRequest(String from, String productPrice, String deliverPrice, String amount) {
        this.from = from;
        ProductPrice = productPrice;
        DeliverPrice = deliverPrice;
        Amount = amount;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(String productPrice) {
        ProductPrice = productPrice;
    }

    public String getDeliverPrice() {
        return DeliverPrice;
    }

    public void setDeliverPrice(String deliverPrice) {
        DeliverPrice = deliverPrice;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }
}
