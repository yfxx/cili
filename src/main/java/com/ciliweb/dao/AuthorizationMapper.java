package com.ciliweb.dao;

import com.ciliweb.domain.Authorization;
import java.util.List;

public interface AuthorizationMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(Authorization record);

    Authorization selectByPrimaryKey(Long userId);

    List<Authorization> selectAll();

    int updateByPrimaryKey(Authorization record);
}