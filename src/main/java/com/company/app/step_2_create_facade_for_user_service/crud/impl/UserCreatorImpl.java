package com.company.app.step_2_create_facade_for_user_service.crud.impl;

import com.company.app.domain.dto.UserDto;
import com.company.app.domain.entity.User;
import com.company.app.domain.repository.UserRepository;
import com.company.app.domain.util.UserMapper;
import com.company.app.service.AnyAnnotationForProxy;
import com.company.app.service.HistoryService;
import com.company.app.service.NotificationService;
import com.company.app.step_2_create_facade_for_user_service.crud.api.UserCreator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserCreatorImpl implements UserCreator {

    private final UserRepository userRepository;
    private final NotificationService notificationService;
    private final HistoryService historyService;

    @AnyAnnotationForProxy
    @Override
    public User oneBy(UserDto userDto) {
        historyService.writeHistory();
        User save = userRepository.save(UserMapper.of(userDto));
        notificationService.doNotification();
        return save;
    }

    @AnyAnnotationForProxy
    @Override
    public List<User> allBy(List<UserDto> userDtoList) {
        return null;
    }

}
