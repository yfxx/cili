package com.ciliweb.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Trade {
    private String tradeId;

    private String thridTradeNo;

    private Long userId;

    private Date timestamp;

    private BigDecimal totalAmount;

    private BigDecimal receiptAmount;

    private String channel;

    private String status;

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId == null ? null : tradeId.trim();
    }

    public String getThridTradeNo() {
        return thridTradeNo;
    }

    public void setThridTradeNo(String thridTradeNo) {
        this.thridTradeNo = thridTradeNo == null ? null : thridTradeNo.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getReceiptAmount() {
        return receiptAmount;
    }

    public void setReceiptAmount(BigDecimal receiptAmount) {
        this.receiptAmount = receiptAmount;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}