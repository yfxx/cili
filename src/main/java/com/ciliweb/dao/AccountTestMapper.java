package com.ciliweb.dao;

import com.ciliweb.domain.AccountTest;
import java.util.List;

public interface AccountTestMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(AccountTest record);

    AccountTest selectByPrimaryKey(Long userId);

    List<AccountTest> selectAll();

    int updateByPrimaryKey(AccountTest record);
}