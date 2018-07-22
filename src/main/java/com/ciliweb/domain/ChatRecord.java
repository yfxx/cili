package com.ciliweb.domain;

import java.util.Date;

public class ChatRecord {
    private Long chatId;

    private Long sellUserId;

    private Long buyUserId;

    private Date startTime;

    private Date endTime;

    private Integer costCoins;

    public Long getChatId() {
        return chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public Long getSellUserId() {
        return sellUserId;
    }

    public void setSellUserId(Long sellUserId) {
        this.sellUserId = sellUserId;
    }

    public Long getBuyUserId() {
        return buyUserId;
    }

    public void setBuyUserId(Long buyUserId) {
        this.buyUserId = buyUserId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getCostCoins() {
        return costCoins;
    }

    public void setCostCoins(Integer costCoins) {
        this.costCoins = costCoins;
    }
}