package com.ciliweb.dao;

import com.ciliweb.domain.GiftCount;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GiftCountMapper {
    int deleteByPrimaryKey(@Param("userId") Long userId, @Param("giftId") Integer giftId);

    int insert(GiftCount record);

    GiftCount selectByPrimaryKey(@Param("userId") Long userId, @Param("giftId") Integer giftId);

    List<GiftCount> selectAll();

    int updateByPrimaryKey(GiftCount record);
}