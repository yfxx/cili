package com.ciliweb.dao;

import com.ciliweb.domain.CashTrade;
import java.util.List;

public interface CashTradeMapper {
    int deleteByPrimaryKey(String tradeId);

    int insert(CashTrade record);

    CashTrade selectByPrimaryKey(String tradeId);

    List<CashTrade> selectAll();

    int updateByPrimaryKey(CashTrade record);
}