package com.ciliweb.dao;

import com.ciliweb.domain.Trade;
import java.util.List;

public interface TradeMapper {
    int deleteByPrimaryKey(String tradeId);

    int insert(Trade record);

    Trade selectByPrimaryKey(String tradeId);

    List<Trade> selectAll();

    int updateByPrimaryKey(Trade record);
}