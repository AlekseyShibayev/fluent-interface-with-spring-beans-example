package com.company.app.domain.service.api;

import com.company.app.domain.dto.ChatDto;
import com.company.app.domain.entity.Chat;

import java.util.List;

public interface ChatService {

    Long create(ChatDto chatDto);

    Chat read(Long id);

    Boolean update(Long id, ChatDto chatDto);

    Boolean update(Chat chat);

    Boolean delete(Long id);

    Chat getChatOrCreateIfNotExist(String chatId);

    List<Chat> getAll();

    void saveAll(List<Chat> list);

}
