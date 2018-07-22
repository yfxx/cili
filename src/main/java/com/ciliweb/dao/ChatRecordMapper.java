package com.ciliweb.dao;

import com.ciliweb.domain.ChatRecord;
import java.util.List;

public interface ChatRecordMapper {
    int deleteByPrimaryKey(Long chatId);

    int insert(ChatRecord record);

    ChatRecord selectByPrimaryKey(Long chatId);

    List<ChatRecord> selectAll();

    int updateByPrimaryKey(ChatRecord record);
}