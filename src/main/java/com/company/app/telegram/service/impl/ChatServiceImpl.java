package com.company.app.telegram.service.impl;

import com.company.app.telegram.dto.ChatDto;
import com.company.app.telegram.entity.Chat;
import com.company.app.telegram.repository.ChatRepository;
import com.company.app.telegram.service.api.ChatService;
import com.company.app.telegram.util.ChatUtil;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ChatServiceImpl implements ChatService {

	@Autowired
	ChatRepository chatRepository;

	@Transactional
	@Override
	public Long create(ChatDto chatDto) {
		Optional<Chat> optional = chatRepository.findFirstByChatId(chatDto.getChatId());
		if (optional.isPresent()) {
			return optional.get().getId();
		} else {
			Chat chat = ChatUtil.of(chatDto);
			return chatRepository.save(chat).getId();
		}
	}

	@Transactional
	@Override
	public Chat read(Long id) {
		Optional<Chat> optional = chatRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		} else {
			throw new ObjectNotFoundException(id, Chat.class.getName());
		}
	}

	@Transactional
	@Override
	public Boolean update(Long id, ChatDto chatDto) {
		Chat chat = ChatUtil.of(id, chatDto);
		chatRepository.save(chat);
		return true;
	}

	@Transactional
	@Override
	public Boolean delete(Long id) {
		chatRepository.deleteById(id);
		return true;
	}
}
