package com.ciliweb.dao;

import com.ciliweb.domain.AccountRelation;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountRelationMapper {
    int deleteByPrimaryKey(@Param("userId") Long userId, @Param("followerId") Long followerId);

    int insert(AccountRelation record);

    AccountRelation selectByPrimaryKey(@Param("userId") Long userId, @Param("followerId") Long followerId);

    List<AccountRelation> selectAll();

    int updateByPrimaryKey(AccountRelation record);
}