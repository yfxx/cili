package com.ciliweb.dao;

import com.ciliweb.domain.Certification;
import java.util.List;

public interface CertificationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Certification record);

    Certification selectByPrimaryKey(Long id);

    List<Certification> selectAll();

    int updateByPrimaryKey(Certification record);
}