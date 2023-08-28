package com.company.app.step_4_update_fluient_interface_api_with_small_actions.user.component.create;

import com.company.app.domain.dto.UserDto;
import com.company.app.domain.entity.User;
import com.company.app.domain.repository.UserRepository;
import com.company.app.domain.util.UserMapper;
import com.company.app.service.AnyAnnotationForProxy;
import com.company.app.service.HistoryService;
import com.company.app.service.NotificationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserCreateAllByUserDtoList {

    private final UserRepository userRepository;
    private final NotificationService notificationService;
    private final HistoryService historyService;

    @AnyAnnotationForProxy
    public List<User> allBy(List<UserDto> userDtoList) {
        return userDtoList.stream()
                .map(userDto -> {
                    historyService.writeHistory();
                    User save = userRepository.save(UserMapper.of(userDto));
                    notificationService.doNotification();
                    return save;
                })
                .toList();
    }

}
