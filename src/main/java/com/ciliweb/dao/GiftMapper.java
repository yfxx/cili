package com.ciliweb.dao;

import com.ciliweb.domain.Gift;
import java.util.List;

public interface GiftMapper {
    int deleteByPrimaryKey(Integer giftId);

    int insert(Gift record);

    Gift selectByPrimaryKey(Integer giftId);

    List<Gift> selectAll();

    int updateByPrimaryKey(Gift record);
}