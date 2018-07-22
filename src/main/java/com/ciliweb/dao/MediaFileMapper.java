package com.ciliweb.dao;

import com.ciliweb.domain.MediaFile;
import java.util.List;

public interface MediaFileMapper {
    int deleteByPrimaryKey(Long fileId);

    int insert(MediaFile record);

    MediaFile selectByPrimaryKey(Long fileId);

    List<MediaFile> selectAll();

    int updateByPrimaryKey(MediaFile record);
}